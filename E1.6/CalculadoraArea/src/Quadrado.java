public class Quadrado extends Figura implements Desenho{
    private double lado;

    public Quadrado() {
        setLado(4);
    };

    public Quadrado(double uLado) {
        this.lado = uLado;
    };

    public double getLado() {
        return lado;
    }

    public void setLado(double uLado) {
        this.lado = uLado;
    }

    @Override
    double calcularArea() {
        return getLado() * getLado();
    };
    
    @Override
    double calcularPerimetro() {
        return getLado() * 4;
    }

    @Override
    public String desenhar() {
        return "Desenhando a Figura Quadrado";
    }
}
