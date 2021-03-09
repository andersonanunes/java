package UriJudge.E1019;

import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        int N = scan.nextInt();
        int hora, min, seg;

        hora = N / 3600;
        N %= 3600;
        min = N / 60;
        N %= 60;
        seg = N;

        System.out.println(String.format("%d", hora) + ":" + String.format("%d", min) + ":" + String.format("%d", seg));
        scan.close();
    }
}