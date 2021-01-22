package aluno;

public class Curso {
    int codigo;
    String nome;
    String descricao;
    int cargaHoraria;
    int limite;

    // construtor padrao
    public Curso(){}

    // construtor com sobrecarga para fazer uma consulta por código no BD e retornar os valores
    public Curso(int codigo){
        this.codigo = codigo;
    }

    // construtor com sobrecarga de todos atributos
    public Curso(int codigo, String nome, String descricao, int cargaHoraria){
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.setLimite(limite);
    } 

    // metodo get sao sempre do tipo da variavel que ele retorna e nao tem parametros
    public int getCodigo(){
        return this.codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public int getCargaHoraria(){
        return this.cargaHoraria;
    }

    public int getLimite(){
        return this.limite;
    }

    // metodos set são sempre void e recebem valor do mesmo tipo de variável que deseja modificar
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public void setLimite(int limite) {
        if(limite <= 20){
            this.limite = limite;
        }
    }

    // metodo para personalizar a saida de dados sem mudar a assinatura - POLIMORFISMO
    @Override // sobrescrita, sobreposicao
    public String toString(){
        return "Codigo: " + codigo + "\nNome: " + nome + "\nDescricao: " + descricao + "\nCarga Horária: " + cargaHoraria + "\nLimite Vagas: " + limite;
    }

    void atualizaPlanos(){

    }
}
