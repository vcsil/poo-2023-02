public class Retangulo extends Quadrado implements Desenho{
    double lado2;

    public Retangulo() {
        setLado2(7);
    };

    public Retangulo(double lado, double uLado2) {
        super(lado);
        this.lado2 = uLado2;
    };

    public double getLado2() {
        return lado2;
    };

    public void setLado2(double uLado2) {
        this.lado2 = uLado2;
    };

    @Override
    double calcularArea() {
        return getLado() * getLado2();
    };
    
    @Override
    double calcularPerimetro() {
        return getLado() * 2 + getLado2() * 2;
    }

    @Override
    public String desenhar() {
        return "Desenhando a Figura Retangulo";
    }
}
