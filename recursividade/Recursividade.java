/* Exercício 6
 * A multiplicacao de dois numeros inteiros pode ser feita atraves de somas sucessivas.
 * Proponha um algoritmo recursivo Multip Rec(n1,n2) que calcule a multiplicacao de dois
 * inteiros. 
*/
package recursividade;
import java.util.Scanner;
public class Recursividade {

    static Scanner scanner = new Scanner(System.in);

    // multiplica 2 numeros inteiros
    static int Multip_Rec(int n1, int n2) {
        if (n2 == 0) return n2;
        else return n1 + Multip_Rec(n1, n2-1);
    }

    public static void main(String[] args) {
        //System.out.println("O resultado é: " + Multip_Rec(4, 5));

        int n1;
        int n2;

        System.out.print("Digite o primeiro numero inteiro: ");
        n1 = scanner.nextInt();
        
        System.out.print("Digite o segundo numero inteiro: ");
        n2 = scanner.nextInt();

        System.out.println("O resultado é: " + Multip_Rec(n1, n2));

        scanner.close();
    }
}
