package pilha;

import java.util.Random;
import java.util.Scanner;

public class TestePilha {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a capacidade da pilha: ");

        Pilha pilha = new Pilha(scanner.nextInt());
        do {
            // seleciona uma das opcoes (push ou pop)
            if(random.nextInt(2) == 0){
                // se for 0 faz pop (desempilha)
                if(!pilha.pilhaVazia()){
                    System.out.println(pilha.pop() + " foi desempilhado");
                    System.out.println(pilha);
                }
            } else {
                // se for 1 faz push (empilha)
                if (!pilha.pilhaCheia()) {
                    int n = random.nextInt(10);
                    pilha.push(n);
                    System.out.println(n + " foi empilhado");
                    System.out.println(pilha);                    
                }
            }
        } while (!pilha.pilhaVazia());
        System.out.println("Acabou!");
        scanner.close();
    }
}
