package codigos_fila;

import java.util.Random;

public class TesteFila {
    public static void main (String args[]) {
        Fila f = new Fila(8);
        Random random = new Random();
        do {
            if (random.nextInt(2)==1) {
                if (!f.filaCheia()) { // verifica se a fila nao esta cheia
                    f.insereFila(random.nextInt(10));
                }
            }
            else {
                if (!f.filaVazia()) { // verifica se a fila nao esta vazia
                    System.out.println(f.removeFila() + " foi atendido");
                }
            }
            //f.exibeVetor();
            System.out.println(f);
        } while (!f.filaVazia());
    }
}
