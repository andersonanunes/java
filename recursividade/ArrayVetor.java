/* Exercicio 11
 * Escreva uma funcao recursiva que exibe todos os elementos em um array de inteiros,
 * separados por espaco.
*/
package recursividade;
import java.util.Random;
import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {

        int[] v;
        int n;
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        n = scanner.nextInt();
        
        // instancia o objeto
        v = new int[n];    
        ArrayVetor vArray = new ArrayVetor();
        
        geraVetor(v, n);
        vArray.print (v); // chamada da funcao recursiva
        scanner.close();
	}

    // gera o vetor com numeros aleatorios
    static void geraVetor(int[] v, int n){
        int i;
        Random random = new Random();
        for(i = 0; i < n; i++){
            v[i] = random.nextInt(n * 10);
        }
    }

	public void print (int[] v) {
		print (v, 0);
	}

    private void print (int[] v, int n) {
		if (n >= v.length) return;
		else
			System.out.print (v [n] + " ");
			print (v, n + 1);
	}
}
