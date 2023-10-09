package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
//        analisarCandidato(1900.00);
//        analisarCandidato(2200.00);
//        analisarCandidato(2000.00);
    }
    public static void selecaoCandidatos() {
        String[] candidatos = {
                "Ana",
                "João",
                "Maria",
                "Pedro",
                "Sofia",
                "Carlos",
                "Laura",
                "Miguel",
                "Beatriz",
                "Guilherme"
        };
        int candidatosSelecionados = 0;
        int candidatoAtual=0;
        double salarioBase=2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou o seguinte valor: " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato  " + candidato + " foi selecionado");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    private static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        }
        else if(salarioBase==salarioPretendido) {
            System.out.println("Ligar para candidato com contraproposta");
        } else {
            System.out.println("Aguardando resultado de demais candidatos");
        }
    }
}
