package heranca;

public class TesteHeranca {
    public static void main(String[] args) {
        // instancia os objetos
        Aluno aluno = new Aluno("Anderson", 48, "Av. Marginal 1455", "3", "ADS");
        Professor professor = new Professor("Andrea Machion", 20, "Av. não sei", 10000.00, "Estrutura de Dados");
        Funcionario funcionario = new Funcionario("Ze Chapeu de Aluminio", 25, "Av. Ioio 1234", 1250.00);
        FuncAdm funcAdm = new FuncAdm("Vanessa", 60, "Rua Jurupupu 69", 2250.00, "secretaria", "Coordenadora");

        // exibe o resultado da classe Alunos
        System.out.println("\n\nVeja como os atributos da classe Professor foram preenchidos\n");
        System.out.println("Nome: " + aluno.getNome());
		System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Endereco: " + aluno.getEndereco().toString());
        System.out.println("Semestre: " + aluno.getSemestre().toString());
        System.out.println("Curso: " + aluno.getCurso().toString());

        // exibe o resultado da classe Professor
        System.out.println("\n\nVeja como os atributos da classe Professor foram preenchidos\n");
        System.out.println("Nome: " + professor.getNome());
		System.out.println("Idade: " + professor.getIdade());
        System.out.println("Endereco: " + professor.getEndereco().toString());
        System.out.println("Salário: " + professor.getSalario());
        System.out.println("Disciplina: " + professor.getDisciplina().toString());
        System.out.println("\n********************************************************\n");

        // exibe o resultado da classe Funcionario
        System.out.println("\n\nVeja como os atributos da classe Funcionario foram preenchidos\n");
        System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Endereco: " + funcionario.getEndereco().toString());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("\n********************************************************\n");

        // exibe o resultado da classe FuncAdm
        System.out.println("\n\nVeja como os atributos da classe FuncAdm foram preenchidos\n");
        System.out.println("Nome: " + funcAdm.getNome());
		System.out.println("Idade: " + funcAdm.getIdade());
        System.out.println("Endereco: " + funcAdm.getEndereco().toString());
        System.out.println("Salário: " + funcAdm.getSalario());
        System.out.println("Setor: " + funcAdm.getSetor().toString());
        System.out.println("Função: " + funcAdm.getFuncao().toString());
        System.out.println("\n********************************************************\n");
    }
}
