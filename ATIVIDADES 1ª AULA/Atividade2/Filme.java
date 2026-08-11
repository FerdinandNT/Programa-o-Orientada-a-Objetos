public class Filme {
    String titulo;
    int duracao;
    double nota;
    boolean assistido;

    void exibirFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Nota: " + nota);
        System.out.println("Assistido: " + assistido);
    }

    void marcarAssistido() {
        assistido = true;
    }

    void avaliar(double novaNota) {
        if (novaNota >= 0 && novaNota <= 10) {
            nota = novaNota;
        } else {
            System.out.println("Nota inválida");
        }
    }
}
