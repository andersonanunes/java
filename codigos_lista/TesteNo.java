package codigos_lista;

public class TesteNo {
    public static void main (String args[]) {
        No no1 = new No(5);
        No no2 = new No(32);

        System.out.println("no1: " + no1);
        System.out.println("no2: " + no2);

        no1.setInfo(10);
        no1.setProximo(no2);

        No temp = no1;
        System.out.println("info do no que temp referencia: " + temp.getInfo());
        //caminhando
        temp = temp.getProximo();
        System.out.println("info do no que temp referencia: " + temp.getInfo());
        temp.setProximo(no1);
    }
}
