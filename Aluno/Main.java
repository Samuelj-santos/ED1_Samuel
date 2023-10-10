package Aluno;

public class Main {
    public static void main(String[] args) {
        LSEAluno turma = new LSEAluno();
        LSEAluno turmaAprovados = new LSEAluno();
        LSEAluno turmaReprovados = new LSEAluno();
        Aluno one = new Aluno("12345", "André", 7.0, 2);
        Aluno two = new Aluno("67890", "Ana", 6.0, 8);
        Aluno three = new Aluno("13579", "Mateus", 8.0, 9);
        Aluno  four = new Aluno("12345", "Joao", 8.0, 8);

        turma.novoAluno(one);
        turma.novoAluno(two);
        turma.novoAluno(three);
        turma.novoAluno(four);

        turma.exibir();

        turma.aprovadosEReprovados(turmaAprovados, turmaReprovados);
         turmaAprovados.exibir();
        turmaReprovados.exibir();
    }
}
