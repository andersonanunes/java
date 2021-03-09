package UriJudge.E1003;

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int a = scan.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = scan.nextInt();

        int soma = a + b;

        System.out.println("SOMA = " + soma);

        scan.close();

    }
}
