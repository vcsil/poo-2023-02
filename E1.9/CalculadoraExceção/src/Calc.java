public class Calc {
    double n1;
    double n2;

    public double somar() {
        return n1 + n2;
    }

    public double diminuir() {
        return n1 - n2;
    }

    public double multiplicar() {
        return n1 * n2;
    }

    public double dividir() throws ArithmeticException {
        if (n2 == 0) {
            throw new ArithmeticException("Não é possível fazer divisão por 0.");
        }
        return n1 / n2;
    }
}