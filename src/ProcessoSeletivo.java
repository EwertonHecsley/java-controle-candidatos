import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analizarCandidato(2500.0);
        analizarCandidato(2000);
        analizarCandidato(1900);

        selecaoCandidatos();

        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "Ewerson", "Luana", "Amanda", "Ewerton", "Erik" };

        System.out.println("Imprimindo a lista de candidatos informando o indice");

        for (int index = 0; index < candidatos.length; index++) {
            System.out.println("O candidato de numero: " + (index + 1) + " é o: " + candidatos[index]);
        }

        System.out.println("For de forma abreviada");

        for (String candidato : candidatos) {
            System.out.println("O nome do candidato é: " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Jose", "Maria", "Joao", "Pedro", "Jeferson", "Luana", "Amanda", "Ewerton", "Erik",
                "Ewerson" };

        int candidatosSelecinados = 0;
        int candidatoAtual = 0;
        double salarioBAse = 2000.0;
        while (candidatosSelecinados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if (salarioBAse >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecinados++;
            }
            candidatoAtual++;
        }
    }

    static void analizarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDAR RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}