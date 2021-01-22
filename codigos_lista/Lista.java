package codigos_lista;

public class Lista {
    private No primeiro;

    public Lista () {
        this.setPrimeiro(null);
    }
    public No getPrimeiro () {
        return this.primeiro;
    }
    public void setPrimeiro (No no) {
        this.primeiro = no;
    }
    //operações específicas de listas ligadas
    public boolean estaVazia() {
        return this.getPrimeiro() == null;
    }
    public void insereInicio(int info) {
        No temp = new No(info);
        if (!this.estaVazia()) {
            temp.setProximo(this.getPrimeiro());
        }
        this.setPrimeiro(temp);
    }
    @Override
    public String toString() {
        String stringAux = "Lista: [";
        if (this.estaVazia()) {
            stringAux = stringAux + "vazia";
        }
        else {
            No noAux = this.getPrimeiro();
            while (noAux != null) {
                stringAux = stringAux + noAux + " ";
                noAux = noAux.getProximo();
            }
        }
        stringAux = stringAux + "]";
        return stringAux;
    }
}
