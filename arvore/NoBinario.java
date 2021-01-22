package arvore;

public class NoBinario {
    private int info;
    private NoBinario esquerda;
    private NoBinario direita;

    public NoBinario(int info) {
        this.setInfo(info);
        this.setEsquerda(null);
        this.setDireita(null);
    }

    public int getInfo() {
        return this.info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NoBinario getEsquerda() {
        return this.esquerda;
    }

    public void setEsquerda(NoBinario esquerda) {
        this.esquerda = esquerda;
    }

    public NoBinario getDireita() {
        return this.direita;
    }

    public void setDireita(NoBinario direita) {
        this.direita = direita;
    }

    @Override
    public String toString(){
        return "[" + this.info + "]";
    }
}
