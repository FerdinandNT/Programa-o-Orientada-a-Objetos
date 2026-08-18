package Atividade2;

public class Consulta {
    Paciente paciente;
    java.time.LocalDate data;
    double valor;

    public Consulta(Paciente paciente, java.time.LocalDate data, double valor){
        this.paciente = paciente;
        this.data = data;
        this.valor = valor;
    }
    void exibirComprovante(){
        System.out.println("Paciente: " + paciente.nome);
        System.out.println("Telefone: " + paciente.telefone);
        System.out.println("Data: " + data);
        System.out.println("Valor: R$ " + valor);
    }
}
