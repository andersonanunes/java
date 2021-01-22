package ordenacao;

import java.util.Random;
import java.util.Scanner;

public class SelectionSort {

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

    static void selectionSort(int[] v, int n){
        int i, j, min, aux;
        for(i = 0; i < n - 1; i++){
            min = i;
            for(j = min + 1; j < n; j++){
                if(v[j] < v[min]){
                    min = j;
                }
            }
            aux = v[i];
            v[i] = v[min];
            v[min] = aux;
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
        selectionSort(v, n);
        long fim = System.currentTimeMillis();
        mostraVetor("Vetor Ordenado", v, n);
        System.out.println("A ordenação demorou " + ((fim - inicio)/1000.0) + " segundos");
        scanner.close();
    }
}
