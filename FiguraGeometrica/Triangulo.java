package FiguraGeometrica;

public class Triangulo extends FigGeometrica {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getLado1(){
        return this.lado1;
    }

    public double getLado2(){
        return this.lado2;
    }

    public double getLado3(){
        return this.lado3;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setLado1(double lado1){
        this.lado1 = lado1;
    }

    public void setLado2(double lado2){
        this.lado2 = lado2;
    }

    public void setLado3(double lado3){
        this.lado3 = lado3;
    }

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // calcula o perimetro
    public double calculaPerimetro(){
        return this.getLado1() + this.getLado2() + this.getLado3();
    }

    // calcula a area
    public double calculaArea(){
        return (this.getBase() * this.getAltura()) / 2;
    }
}
