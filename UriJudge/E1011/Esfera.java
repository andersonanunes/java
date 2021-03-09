package UriJudge.E1011;

import java.util.Scanner;

public class Esfera {
    public static final double PI = 3.14159;
    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        double volume = ((4/3.0) * PI * Math.pow(raio, 3));
        System.out.println("VOLUME = " + String.format("%.3f", volume));
        scan.close();
    }
}
