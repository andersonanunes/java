/* Exercicio 10
 * Faca uma funcao recursiva que receba um numero inteiro positivo par N e imprima todos
 * os numeros pares de 0 ate N em ordem decrescente.
*/
package recursividade;
import java.util.Scanner;

public class ImprimePares {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // instancia o objeto
        ImprimePares nPares = new ImprimePares();
        
        // entrada de dados
        System.out.print("Digite um numero inteiro: ");
        int n = scanner.nextInt();      
        
        // faz a chamada recursiva passando o parametro
        System.out.println(nPares.ImprimeParesRecursivo(n));
        
        // encerra o scanner
        scanner.close();
    }

    // recebe um inteiro N e imprime todos os pares em ordem decrescente
    private int ImprimeParesRecursivo(int n){
        
        // para a chamada do metodo recursivo
        if (n == 0) return 0;
        
        // se o resto da divisao for 0 o numero é par e exibe na tela
        if (n % 2 == 0) 
        System.out.println("Números Pares: " + n);
        
        // senao decrementa o valor e chama novamente o metodo recursivamente
        return ImprimeParesRecursivo(n - 1);
    }
}