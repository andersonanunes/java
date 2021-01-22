package codigos_lista;

public class TesteLista {
    public static void main (String[] args) {
        Lista l = new Lista();
        System.out.println(l);

        l.insereInicio(4);
        l.insereInicio(21);
        l.insereInicio(12);
        System.out.println(l);
    }
}
