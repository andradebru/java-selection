package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1900.00);
        analisarCandidato(2200.00);
        analisarCandidato(2000.00);
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
