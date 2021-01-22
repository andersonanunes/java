package FiguraGeometrica;

public class TesteFigGeom {
    public static void main(String[] args) {
        // instancia os objetos
        Retangulo retangulo = new Retangulo(20, 20);
        Circulo circulo = new Circulo(15);
        Triangulo triangulo = new Triangulo(12, 12, 6, 6, 6);

        // exibe os resultados
        System.out.println("\nResultados dos cálculos: \n");
        System.out.println("Perimetro do Retangulo: " + retangulo.calculaPerimetro());
        System.out.println("Area do Retangulo: " + retangulo.calculaArea());
        System.out.println("\n*********************************************\n");

        System.out.println("Perimetro do Círculo: " + circulo.calculaPerimetro());
        System.out.println("Area do Círculo: " + circulo.calculaArea());
        System.out.println("\n*********************************************\n");
        
        System.out.println("Perimetro do Triangulo: " + triangulo.calculaPerimetro());
        System.out.println("Area do Triangulo: " + triangulo.calculaArea());
        System.out.println("\n*********************************************\n");
    }
}