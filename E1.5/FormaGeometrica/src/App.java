class Circulo extends FormaGeometrica {
    protected int raio;

    public Circulo(int uRaio) {
        this.raio = uRaio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    };
}

class Retangulo extends FormaGeometrica {
    protected int largura;
    protected int altura;

    public Retangulo(int uLargura, int uAltura) {
        this.largura = uLargura;
        this.altura = uAltura;
    };

    public double calcularArea() {
        return largura * altura;
    };
}

class Triangulo extends FormaGeometrica {
    protected int base;
    protected int altura;

    public Triangulo(int uAltura, int uBase) {
        this.altura = uAltura;
        this.base = uBase;
    };

    public double calcularArea() {
        return (base * altura) / 2;
    };
}

public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo1 = new Circulo(4);
        Retangulo retangulo1 = new Retangulo(3, 7);
        Triangulo triangulo1 = new Triangulo(18, 12);

        FormaGeometrica[] arrFormas = new FormaGeometrica[3];
        arrFormas[0] = circulo1;
        arrFormas[1] = retangulo1;
        arrFormas[2] = triangulo1;

        CalculadoraArea calcArea = new CalculadoraArea();
        double areaTotal = calcArea.calcularAreaTotal(arrFormas);
        System.out.println(areaTotal);
    }
}
