package UriJudge.E1018;

import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor desejado: ");
        int N = scan.nextInt();

        int valor = N;

        int nota100 = N / 100;
        N %= 100; // 76
        
        int nota50 = N / 50;
        N %= 50; // 26

        int nota20 = N / 20;
        N %= 20; // 6

        int nota10 = N / 10;
        N %= 10; // 0

        int nota5 = N / 5;
        N %= 5; // 1

        int nota2 = N / 2;
        N %= 2; // 0

        int nota1 = N;

        System.out.println(valor);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");
        scan.close();
    }
}
