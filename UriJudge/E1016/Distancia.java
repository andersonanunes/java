package UriJudge.E1016;

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distancia = scan.nextInt();
        int tempo = (int) (distancia / ((90 / 60.0) - (60 / 60.0)));
        System.out.println(tempo + " minutos");
        scan.close();
    }
}
