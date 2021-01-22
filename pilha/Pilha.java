package pilha;

public class Pilha {
    private int topo;
    private int[] dados;

    // metodos com sobrecarga
    public Pilha(){
        this.topo = 0;
        dados = new int[10];
    }

    public Pilha(int capacidade){
        this.topo = 0;
        dados = new int[capacidade];
    }

    // 
    public boolean pilhaVazia(){
        return this.topo == 0;
    }

    // se o topo for igual ao tamanho do vetor esta cheio 
    public boolean pilhaCheia(){
        return this.topo == dados.length;
    }

    // empilhar
    public void push(int elemento){
        this.dados[this.topo++] = elemento;
    }

    // desempilhar
    public int pop(){
       return this.dados[--this.topo];
    }

    // tamanho da pilha e igual ao valor do topo
    public int tamanhoPilha(){
        return this.topo;
    }

    // verifica quem esta no topo sem desempilhar
    public int consultaTopo(){
        return this.dados[this.topo - 1];
    }

    @Override
    public String toString(){
        String aux = "Pilha: ";
        if(this.pilhaVazia()){
            aux += "vazia";
        } else {
            for (int i = this.topo - 1; i >= 0; i--) {
                aux += this.dados[i] + " ";
            }
        }
        aux += "\n";
        return aux;
    }
}