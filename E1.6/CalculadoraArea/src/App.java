public class App {
    public static void main(String[] args) throws Exception {
        Retangulo retangulo1 = new Retangulo();
        double perimetroRetangulo1 = retangulo1.calcularPerimetro();
        System.out.println("01 - Perimetro Ret: " + perimetroRetangulo1);

        retangulo1.setLado(2);
        retangulo1.setLado2(3);
        perimetroRetangulo1 = retangulo1.calcularPerimetro();
        System.out.println("02 - Perimetro Ret: " + perimetroRetangulo1);

        Quadrado quadrado1 = new Quadrado(9);
        double areaQuadrado1 = quadrado1.calcularArea();
        System.out.println("Area do quadrado1: " + areaQuadrado1);

        Triangulo triangulo1 = new Triangulo();
        double areaTriangulo1 = triangulo1.calcularArea();
        System.out.println("Area do triangulo1: " + areaTriangulo1);

        Circulo circulo1 = new Circulo();
        double areaCirculo1 = circulo1.calcularArea();
        System.out.println("Area do circulo1: " + areaCirculo1);

        System.out.println("\n");

        Figura[] arrFiguras = new Figura[4];
        arrFiguras[0] = retangulo1;
        arrFiguras[1] = quadrado1;
        arrFiguras[2] = triangulo1;
        arrFiguras[3] = circulo1;

        for (int i = 0; i < arrFiguras.length; i++) {
            double area = arrFiguras[i].calcularArea();
            double perimetro = arrFiguras[i].calcularPerimetro();
            System.out.println("0" + i + " - Area: " + area + " Perimetro: " + perimetro);
        }

        // System.out.println("\n");

        // System.out.println(retangulo1.desenhar());
        // System.out.println(quadrado1.desenhar());
        // System.out.println(triangulo1.desenhar());
        // System.out.println(circulo1.desenhar());

    }
}
