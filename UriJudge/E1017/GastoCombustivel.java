package UriJudge.E1017;

import java.util.Scanner;

public class GastoCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas: ");
        int tempo = scan.nextInt();
        System.out.println("Digite a velocidade media: ");
        int velocidade = scan.nextInt();
        double qtdeCombustivel = (velocidade * tempo) / 12.0;
        System.out.println(String.format("%.3f", qtdeCombustivel));
        scan.close();
    }
}