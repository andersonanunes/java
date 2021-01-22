package parentizacao;

public class PilhaString {
    private int topo;
    private String[] expressao;

    public PilhaString () {
        this.topo = 0;
        expressao = new String[100];
    }

    public PilhaString (int capacidade) {
        this.topo = 0;
        expressao = new String[capacidade];
    }

    public boolean pilhaVazia () {
        return this.topo == 0;
    }

    public boolean pilhaCheia () {
        return this.topo == expressao.length;
    }

    public void push (String elemento) {
        this.expressao[this.topo++] = elemento;
    }

    public String pop () {
        return this.expressao[--this.topo];
    }

    public int tamanhoPilha() {
        return this.topo;
    }

    public String consultaTopo () {
        return this.expressao[this.topo-1];
    }

    @Override
    public String toString() {
        String aux = "Pilha: ";
        if (this.pilhaVazia()) {
            aux += "vazia";
        }
        else {
            for (int i = this.topo-1; i >= 0; i--) {
                aux += this.expressao[i] + " ";
            }
        }
        aux += "\n";
        return aux;
    }
}