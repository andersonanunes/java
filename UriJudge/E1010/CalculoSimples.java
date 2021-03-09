package UriJudge.E1010;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        scan.nextInt();
        int qtde1 = scan.nextInt();
        double valor1 = scan.nextDouble();

        scan.nextInt();
        int qtde2 = scan.nextInt();
        double valor2 = scan.nextDouble();

        double total = (qtde1 * valor1) + (qtde2 * valor2);
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));
        scan.close();

    }
}
