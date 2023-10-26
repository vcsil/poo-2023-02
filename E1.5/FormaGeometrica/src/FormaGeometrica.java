public abstract class FormaGeometrica {
    
    public abstract double calcularArea();
}

// class Circulo extends FormaGeometrica {
//     protected int raio;

//     public Circulo(int uRaio) {
//         this.raio = uRaio;
//     }

//     public double calcularArea() {
//         return Math.PI * raio * raio;
//     };
// }

// class Retangulo extends FormaGeometrica {
//     protected int largura;
//     protected int altura;

//     public Retangulo(int uLargura, int uAltura) {
//         this.largura = uLargura;
//         this.altura = uAltura;
//     };

//     public double calcularArea() {
//         return largura * altura;
//     };
// }

// class Triangulo extends FormaGeometrica {
//     protected int base;
//     protected int altura;

//     public Triangulo(int uAltura, int uBase) {
//         this.altura = uAltura;
//         this.base = uBase;
//     };

//     public double calcularArea() {
//         return (base * altura) / 2;
//     };
// }