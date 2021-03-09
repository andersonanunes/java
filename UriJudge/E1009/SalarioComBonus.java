package UriJudge.E1009;

import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        double salario = scan.nextDouble();
        double vendas = scan.nextDouble();
        double comissao = (vendas * 15)/100;
        double salarioFinal = salario + comissao;
        System.out.println("TOTAL = R$ " + String.format("%.2f", salarioFinal));
        scan.close();
    }
}
