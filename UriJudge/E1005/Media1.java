package UriJudge.E1005;

import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double media = ((3.5 * A) + (7.5 * B))/11;
        System.out.println("MEDIA = " + String.format("%.5f", media));
        scan.close();
    }
}
