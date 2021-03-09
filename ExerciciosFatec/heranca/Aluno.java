package heranca;

class Aluno extends Pessoa {

	private String semestre;
	private String curso;

	public Aluno(String nome, int idade, String endereco, String semestre, String curso) {
		super(nome, idade, endereco);
		this.semestre = semestre;
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
}