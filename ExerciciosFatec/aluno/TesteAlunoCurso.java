package aluno;

public class TesteAlunoCurso {
    public static void main(String[] args) {
        // instanciando um novo aluno
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Anderson");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Leandro");

        // passando novos parametros atraves do metodo set
        Curso curso1 = new Curso();
        curso1.setCodigo(123);
        curso1.setNome("ADS");
        curso1.setDescricao("Curso de ADS da Fatec Caracas");
        curso1.setCargaHoraria(4);

        // exibindo o resultado na tela
        System.out.println(curso1);
    }
}