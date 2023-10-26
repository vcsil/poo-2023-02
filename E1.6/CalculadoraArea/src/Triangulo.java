public class Triangulo extends Figura implements Desenho{
    private double base;
    private double lado1;
    private double lado2;
    private double altura;

    public Triangulo() {
        setBase(12);
        setLado1(11);
        setLado2(7);
        setAltura(8);
    };

    public Triangulo(double uBase, double uLado1, double uLado2, double uAltura) {
        this.base = uBase;
        this.lado1 = uLado1;
        this.lado2 = uLado2;
        this.altura = uAltura;
    };
    
    public double getBase() {
        return base;
    }

    public void setBase(double uBase) {
        this.base = uBase;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double uLado1) {
        this.lado1 = uLado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double uLado2) {
        this.lado2 = uLado2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double uAltura) {
        this.altura = uAltura;
    }

    @Override
    double calcularArea() {
        return (getBase() * getAltura())/2;
    };
    
    @Override
    double calcularPerimetro() {
        return getBase() + getLado1() + getLado2();
    }

    @Override
    public String desenhar() {
        return "Desenhando a Figura Triangulo";
    }
}
