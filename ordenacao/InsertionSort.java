package ordenacao;

import java.util.Random;
import java.util.Scanner;

public class InsertionSort {

    // metodos estaticos
    static void geraVetor(int[] v, int n){
        int i;
        Random random = new Random();
        for(i = 0; i < n; i++){
            v[i] = random.nextInt(n * 10);
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

    static void insertionSort(int[] v, int n){
        int i, j, key;
        for(i = 1; i < n; i++){
            key = v[i];
            j = i - 1;
            while (j >= 0 && v[j] > key){
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = key;
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
        insertionSort(v, n);
        long fim = System.currentTimeMillis();
        //mostraVetor("Vetor Ordenado", v, n);
        System.out.println("A ordenação demorou " + ((fim - inicio)/1000.0) + " segundos");
        scanner.close();
    }
}
