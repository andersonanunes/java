package UriJudge.E1004;

import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int PROD = a * b;

        System.out.println("PROD = " + PROD);
        scan.close();
    }
}
