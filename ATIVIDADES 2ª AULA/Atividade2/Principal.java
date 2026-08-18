package Atividade2;

public class Principal {
    public static void main(String[] args) {
        
        Paciente paciente1 = new Paciente("João", "1233323123232");
        Paciente paciente2 = new Paciente("Eduardo", "213123123123");

        Consulta consulta1 = new Consulta(
                paciente1,
                java.time.LocalDate.of(2026, 8, 20),
                150.00
        );

        Consulta consulta2 = new Consulta(
                paciente2,
                java.time.LocalDate.of(2026, 8, 25),
                200.00
        );

        consulta1.exibirComprovante();
        System.out.println();

        consulta2.exibirComprovante();
    }
}
