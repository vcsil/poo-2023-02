public class Circulo extends Figura implements Desenho {
    protected double raio;

    public Circulo() {
        setRaio(5);
    };

    public Circulo(double uRaio) {
        this.raio = uRaio;
    };

    public double getRaio() {
        return raio;
    }

    public void setRaio(double uRaio) {
        this.raio = uRaio;
    }

    @Override
    double calcularArea() {
        return Math.PI * getRaio() * getRaio();
    };
    
    @Override
    double calcularPerimetro() {
        return 2 * Math.PI * getRaio();
    }

    @Override
    public String desenhar() {
        return "Desenhando a Figura Circulo";
    }
}
