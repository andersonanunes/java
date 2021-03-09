package UriJudge.E1012;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double triangulo = (a * c) / 2;
        double circulo = (c * c) * 3.14159;
        double trapezio = ((a + b) / 2) * c;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.println("TRIANGULO: " + String.format("%.3f", triangulo));
        System.out.println("CIRCULO: " + String.format("%.3f", circulo));
        System.out.println("TRAPEZIO: " + String.format("%.3f", trapezio));
        System.out.println("QUADRADO: " + String.format("%.3f", quadrado));
        System.out.println("RETANGULO: " + String.format("%.3f", retangulo));

        scan.close();
    }
}
