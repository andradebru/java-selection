package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
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
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando=true;
        boolean atendeu=false;
        do {
            atendeu = atender();
            continuarTentando= !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println(("contato realizado com sucesso"));
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " NA " + tentativasRealizadas + " tentativa");
        } else {
            System.out.println("nao conseguimos contato com o candidato " + candidato);
        }


        selecaoCandidatos();
        imprimirSelecionados();
//        analisarCandidato(1900.00);
//        analisarCandidato(2200.00);
//        analisarCandidato(2000.00);

    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
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
        System.out.println("Imprimindo lista de candidatos");
        for (int indice=0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de numero " + (indice+1) + "é" + candidatos[indice]);
        }
        System.out.println("Forma abreviada de interaçao for each");
        for(String candidato: candidatos) {
            System.out.println("Candidata(o) selecionada(o) foi " + candidato);
        }
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
