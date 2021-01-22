package ordenacao;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort{

    // metodos estaticos
    static void geraVetor(int[] v, int n){
        int i;
        Random random = new Random();
        for(i = 0; i < n; i++){
            v[i] = random.nextInt(10 * n);
        }
    }

    static void mostraVetor(String s, int[] v, int n){
        int i;
        System.out.println("\n" + s);
        for(i = 0; i < n; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int[] v, int n){
        int i, j, aux;
        for(i = 1; i < n; i++){
            for(j = 0; j < n - i; j++){
                if(v[j] > v[j + 1]){
                    aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] v;
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");

        n = scanner.nextInt();
        v = new int[n]; // alocando o tamanho do vetor dinamicamente em tempo de execucao

        geraVetor(v, n);
        //mostraVetor("Vetor Original", v, n);
        long inicio = System.currentTimeMillis();
        bubbleSort(v, n);
        long fim = System.currentTimeMillis();
        //mostraVetor("Vetor Ordenado", v, n);
        System.out.println("A ordenação demorou " + ((fim - inicio)/1000.0) + " segundos");
        scanner.close();
    }
}