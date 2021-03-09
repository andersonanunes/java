package codigos_fila;

public class Fila {
    private int dados[];
    private int primeiro=0;
    private int ultimo=0;
    private int cont=0;

    public Fila (int capacidade) {
        this.dados = new int[capacidade];
    }
    public Fila () {
        this.dados = new int[10];
    }
    int proximaPosicao (int pos) {
        return (pos+1) % this.dados.length;
    }
    public boolean filaVazia () {
        return this.cont==0;
    }
    public boolean filaCheia() {
        return this.cont == this.dados.length;
    }
    public void insereFila (int i) {
        this.dados[this.ultimo] = i;
        this.ultimo = proximaPosicao(this.ultimo);
        this.cont++;
    }
    public int removeFila () {
        int removido = this.dados[this.primeiro];
        this.primeiro = proximaPosicao(this.primeiro);
        this.cont--;
        return removido;
    }
    @Override
    public String toString () {
        String aux = "Fila: ";
        if (filaVazia()) {
            aux = aux + "vazia";
        }
        else {
            int i=this.primeiro;
            do {
                aux = aux + this.dados[i] + " ";
                i = proximaPosicao(i);
            } while (i != this.ultimo);
        }
        return aux;
    }
    //exibir o vetor - não faz parte, só é didático
    /*public void exibeVetor () {
        int i;
        if (this.filaCheia()) {
            for (i=0; i<this.dados.length; i++) {
                System.out.print(this.dados[i] + " ");
            }
        }
        else if (this.filaVazia()) {
            for (i=0; i<this.dados.length; i++) {
                System.out.print("_ ");
            }
        }
        else if (this.primeiro < this.ultimo) { // _ _ X X X _ _ _
            for (i=0; i<this.primeiro; i++) {
                System.out.print("_ ");
            }
            for (i=this.primeiro; i<this.ultimo; i++) {
                System.out.print(this.dados[i] + " ");
            }
            for (i=this.ultimo; i<this.dados.length; i++) {
                System.out.print("_ ");
            }
        }
        else { // X X _ _ _ X X X
            for (i=0; i<this.ultimo; i++) {
                System.out.print(this.dados[i] + " ");
            }
            for (i=this.ultimo; i<this.primeiro; i++) {
                System.out.print("_ ");
            }
            for (i=this.primeiro; i<this.dados.length; i++) {
                System.out.print(this.dados[i] + " ");
            }
        }
        System.out.print(" | ");
    }*/
}