public class Pessoa {
    private String nome;
    private double salario;
    private int idade;
    private int numDependentes;

    public Pessoa(java.lang.String nome, double salario, int idade, int numDependentes) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.numDependentes = numDependentes;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumDependentes() {
        return numDependentes;
    }

    public void setNumDependentes(int numDependentes) {
        this.numDependentes = numDependentes;
    }

    public double calculaImposto () {
        if (getIdade() < 65) {
            double salarioPessoa = getSalario();
            double imposto = 0;

            if (salarioPessoa <= 1787.77) {
                return imposto;
            } else if (salarioPessoa <= 2679.29) {
                imposto = (salarioPessoa * 0.075) - 134.08;

            } else if (salarioPessoa <= 3572.43) {
                imposto = (salarioPessoa * 0.15) - 335.03;

            } else if (salarioPessoa <= 4463.81) {
                imposto = (salarioPessoa * 0.225) - 602.96;

            } else {
                imposto = (salarioPessoa * 0.275) - 826.15;

            }
            int qntDependentes = getNumDependentes();
            imposto -= 179.71 * qntDependentes;
            imposto = imposto > 0 ? (Math.round(imposto * 100.0) / 100.0) : 0;
            return imposto;
        }
        return 0;
    }
}
