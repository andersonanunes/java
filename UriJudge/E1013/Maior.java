package UriJudge.E1013;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        int valor3 = scan.nextInt();

        int aux = valor1; // armazena o primeiro valor
        if(valor1 < valor2 || valor1 < valor3){
            if(valor2 < valor3){
                aux = valor3;
            } else {
                aux = valor2;
            }
        }
        System.out.println(aux + " eh o maior");
        scan.close();
    }
}