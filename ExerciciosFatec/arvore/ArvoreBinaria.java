package arvore;

public class ArvoreBinaria {
    private NoBinario raiz;

    public ArvoreBinaria() {
        this.setRaiz(null);
    }

    public NoBinario getRaiz() {
        return this.raiz;
    }

    public void setRaiz(NoBinario raiz) {
        this.raiz = raiz;
    }

    public Boolean isEmpty(){
        return this.raiz == null;
    }

    public void insere(int info){
        NoBinario novo =  new NoBinario(info);
        if(isEmpty()){
            this.setRaiz(novo);
        } else {
            insereRec(novo, this.raiz);
        }
    }

    public void insereRec(NoBinario novo, NoBinario atual){
        if(novo.getInfo() <= atual.getInfo()){
            if(atual.getEsquerda() == null){
                atual.setEsquerda(novo);
            } else {
                insereRec(novo, atual.getEsquerda());
            }
        } else {
            if(atual.getDireita() == null){
                atual.setDireita(novo);
            } else {
                insereRec(novo, atual.getDireita());
            }           
        }
    }
    
    // percorre esq, raiz, dir
    public String exibeEmOrdem(){
        String aux = "arvore: ";
        if(isEmpty()){
            return aux + "vazia";
        } else {
            return aux + exibeEmOrdemRec(this.getRaiz());
        }
    }

    public String exibeEmOrdemRec(NoBinario atual){
        String aux = "";
        if(atual != null){
            aux += exibeEmOrdemRec(atual.getEsquerda());
            aux += atual.getInfo() + " ";
            aux += exibeEmOrdemRec(atual.getDireita());
        }
        return aux;
    }
}
