package FiguraGeometrica;

public class Retangulo extends FigGeometrica {
    
    // atributos
    private double base;
    private double altura;

    // getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // setters
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    // construtor
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // calcula o perimetro
    public double calculaPerimetro(){
        return 2 * this.getBase() + 2 * this.getAltura();
    }

    // calcula a area
    public double calculaArea(){
        return this.getBase() * this.getAltura();
    }
}
