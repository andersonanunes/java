package UriJudge.E1036;

import java.util.Scanner;


public class FormulaBhaskara {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        double A = scan.nextDouble();
        System.out.println("Digite o valor de B: ");
        double B = scan.nextDouble();
        System.out.println("Digite o valor de C: ");
        double C = scan.nextDouble();

        double delta = Math.pow(B, 2) - 4 * A * C;

        if(A <= 0 || B <= 0 || C <= 0 || delta < 0){
            System.out.println("Impossivel calcular");
        } else {
            
            double bhaskara = Math.sqrt(delta);
            double R1 = (-B + bhaskara) / (2 * A);
            double R2 = (-B - bhaskara) / (2 * A);

            System.out.println(String.format("R1 = %.5f", R1));
            System.out.println(String.format("R2 = %.5f", R2));

        }
        scan.close();

    }
}
