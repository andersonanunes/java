package UriJudge.E1008;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numFunc = scan.nextInt();
        int numHoras = scan.nextInt();
        double valorHora = scan.nextDouble();
        double salario = numHoras * valorHora;
        System.out.println("NUMBER = " + numFunc);
        System.out.println("SALARY = U$ " + String.format("%.2f", salario));
        scan.close();
    }
}
