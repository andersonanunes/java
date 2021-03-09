package UriJudge.E1014;

import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a distancia: ");
        int x = scan.nextInt();
        System.out.println("Digite o total de combustivel: ");
        double y = scan.nextDouble();
        double consumo = (x / y);
        System.out.println(String.format("%.3f", consumo) + " km/l");
        scan.close();
    }
}
