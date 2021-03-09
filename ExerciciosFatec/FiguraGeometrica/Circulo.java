package FiguraGeometrica;

public class Circulo extends FigGeometrica {
    
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    // calcula o perimetro
    public double calculaPerimetro(){
        return 2 * Math.PI * this.getRaio();
    }

    // calcula a area
    public double calculaArea(){
        return Math.PI * this.getRaio() * this.getRaio();
    }
}
