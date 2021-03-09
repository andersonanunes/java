/* Exercicio 16
 * Faca uma funcao recursiva que receba um numero inteiro positivo impar N e retorne
 * o fatorial duplo desse numero. O fatorial duplo e definido como o produto de todos os
 * numeros naturais ımpares de 1 ate algum numero natural ımpar N. Assim, o fatorial duplo
 * de 5 e 5!! = 1 * 3 * 5 = 15
*/
package recursividade;
import java.util.Scanner;

public class FatDuplo {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // instancia o objeto
        FatDuplo nFat = new FatDuplo();

        System.out.println("Digite um número inteiro: ");
        int n = scanner.nextInt();
        
        // faz a chamada recursiva passando o parametro
        System.out.println(nFat.recebeFatDuplo(n));
        scanner.close();
    }

    // recebe um inteiro e calcula o fatorial duplo
    private int recebeFatDuplo(int n){
        if (n == 1) return 1;
        if (n % 2 == 0) return recebeFatDuplo(n - 1);
        return n * recebeFatDuplo(n - 2);
    }
}
