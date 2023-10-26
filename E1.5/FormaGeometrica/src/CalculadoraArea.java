public class CalculadoraArea {

    public double calcularAreaTotal(FormaGeometrica[] arrFormaGeometrica) {
        double areaTotal = 0;

        for (int i = 0; i < arrFormaGeometrica.length; i++) {
            areaTotal += arrFormaGeometrica[i].calcularArea();
        }

        return areaTotal;
    };
}