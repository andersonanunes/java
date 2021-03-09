package arvore;

public class TesteArvore {
    public static void main(String[] args) {
        ArvoreBinaria a = new ArvoreBinaria();
        a.insere(10);
        a.insere(5);
        a.insere(15);
        a.insere(7);
        a.insere(6);
        a.insere(12);
        a.insere(15);
        a.insere(20);

        System.out.println(a.exibeEmOrdem());
    }
}
