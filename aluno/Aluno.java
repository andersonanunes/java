package aluno;

public class Aluno {
    
    static int contador = 0; // variavel de classe
    static final int MAX_SEMESTRES = 10; // constante de classe
    
    // atributos
    String nome;
    String ra;
    int anoIngresso;
    byte semestre;
    Curso curso; // associacao entre classes (aluno x curso)

    public String getNome(){
        return this.nome;
    }

    public String getRa(){
        return this.ra;
    }

    public int getAnoIngresso(){
        return this.anoIngresso;
    }

    public byte getSemestre(){
        return this.semestre;
    }

    public Curso getCurso(){
        return this.curso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setRa(String ra){
        this.ra = ra;
    }

    public void setAnoIngresso(int anoIngresso){
        this.anoIngresso = anoIngresso;
    }

    public void setSemestre(byte semestre){
        this.semestre = semestre;
    }

    public void setCurso(Curso curso){
        this.curso = curso;
    }

    // metodos
    void estudar(){
        System.out.println("Aluno estudando...");
    }

    // aqui existe uma dependencia entre classes pois para se matricular e necessario uma disciplina
    // matricular é responsabilidade da classe aluno
    void matricular(){

    }

    void trancaMatricula(){

    }
}
