package Atividade3;

public class Livro {
    String titulo;
    Autor autor;
    int ano;
    boolean emprestado;

    public Livro(String titulo, Autor autor, int ano, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = emprestado;
    }

    void exibirFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor.nome);
        System.out.println("Ano: " + ano);
    }

    void emprestar() {
        if (emprestado) {
            System.out.println("Livro já está emprestado!");
        } else {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso!");
        }
    }
}
