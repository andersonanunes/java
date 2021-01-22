package heranca;

class Professor extends Funcionario {
    private String disciplina;

    public Professor(String nome, int idade, String endereco, double salario, String disciplina) {
        super(nome, idade, endereco, salario);
        this.setDisciplina(disciplina);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
