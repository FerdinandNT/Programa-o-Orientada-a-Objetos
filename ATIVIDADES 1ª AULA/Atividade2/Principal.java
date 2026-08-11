package Atividade2;

public class Principal {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.titulo = "Interestelar";
        filme1.duracao = 169;
        filme1.nota = 9.0;
        filme1.assistido = false;

        Filme filme2 = new Filme();
        filme2.titulo = "O Rei Leão";
        filme2.duracao = 118;
        filme2.nota = 8.5;
        filme2.assistido = false;

        Filme filme3 = new Filme();
        filme3.titulo = "Matrix";
        filme3.duracao = 136;
        filme3.nota = 9.5;
        filme3.assistido = false;

        filme1.marcarAssistido();

        filme2.avaliar(9.2);

        filme1.exibirFicha();
        filme2.exibirFicha();
        filme3.exibirFicha();
    }
}
