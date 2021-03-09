package UriJudge.E1007;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);       
        int A = scan.nextInt();       
        int B = scan.nextInt();       
        int C = scan.nextInt();
        int D = scan.nextInt();
        int diferenca = (A * B - C * D);
        System.out.println("DIFERENCA = " + diferenca);
        scan.close();
    }
}
