import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestePessoa {

    @Test
    @DisplayName("Teste Salario: 1500; Idade: 65; Dependentes: 0")
    public void teste00() {
        Pessoa pessoa1 = new Pessoa("Carlos", 1500, 65, 0);
        assertEquals(pessoa1.calculaImposto(), 0);
    }

    @Test
    @DisplayName("Teste Salario: 1500; Idade: 65; Dependentes: 2")
    public void teste01() {
        Pessoa pessoa1 = new Pessoa("Carlos", 1500, 65, 2);
        assertEquals(pessoa1.calculaImposto(), 0);
    }

    @Test
    @DisplayName("Teste Salario: 2000; Idade: 65; Dependentes: 0")
    public void teste02() {
        Pessoa pessoa1 = new Pessoa("Carlos", 2000, 65, 0);
        assertEquals(pessoa1.calculaImposto(), 0);
    }

    @Test
    @DisplayName("Teste Salario: 2000; Idade: 65; Dependentes: 2")
    public void teste03() {
        Pessoa pessoa1 = new Pessoa("Carlos", 2000, 65, 2);
        assertEquals(pessoa1.calculaImposto(), 0);
    }

    @Test
    @DisplayName("Teste Salario: 3000; Idade: 65; Dependentes: 0")
    public void teste04() {
        Pessoa pessoa1 = new Pessoa("Carlos", 3000, 65, 0);
        assertEquals(pessoa1.calculaImposto(), 0);
    }

    @Test
    @DisplayName("Teste Salario: 3000; Idade: 65; Dependentes: 2")
    public void teste05() {
        Pessoa pessoa1 = new Pessoa("Carlos", 3000, 65, 2);
        assertEquals(pessoa1.calculaImposto(), 0);
    }

    @Test
    @DisplayName("Teste Salario: 4000; Idade: 65; Dependentes: 0")
    public void teste06() {
        Pessoa pessoa1 = new Pessoa("Carlos", 4000, 65, 0);
        assertEquals(pessoa1.calculaImposto(), 0);
    }

    @Test
    @DisplayName("Teste Salario: 4000; Idade: 65; Dependentes: 2")
    public void teste07() {
        Pessoa pessoa1 = new Pessoa("Carlos", 4000, 65, 2);
        assertEquals(pessoa1.calculaImposto(), 0);
    }

    @Test
    @DisplayName("Teste Salario: 5000; Idade: 65; Dependentes: 0")
    public void teste08() {
        Pessoa pessoa1 = new Pessoa("Carlos", 5000, 65, 0);
        assertEquals(pessoa1.calculaImposto(), 0);
    }

    @Test
    @DisplayName("Teste Salario: 5000; Idade: 65; Dependentes: 2")
    public void teste09() {
        Pessoa pessoa1 = new Pessoa("Carlos", 5000, 65, 2);
        assertEquals(pessoa1.calculaImposto(), 0);
    }
//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=
    @Test
    @DisplayName("Teste Salario: 1500; Idade: 30; Dependentes: 0")
    public void teste10() {
        Pessoa pessoa1 = new Pessoa("Carlos", 1500, 30, 0);
        assertEquals(pessoa1.calculaImposto(), 0);
    }

    @Test
    @DisplayName("Teste Salario: 1500; Idade: 30; Dependentes: 2")
    public void teste11() {
        Pessoa pessoa1 = new Pessoa("Carlos", 1500, 30, 2);
        assertEquals(pessoa1.calculaImposto(), 0);
    }

    @Test
    @DisplayName("Teste Salario: 2000; Idade: 30; Dependentes: 0")
    public void teste12() {
        Pessoa pessoa1 = new Pessoa("Carlos", 2000, 30, 0);
        assertEquals(pessoa1.calculaImposto(), 15.92);
    }

    @Test
    @DisplayName("Teste Salario: 2000; Idade: 30; Dependentes: 2")
    public void teste13() {
        Pessoa pessoa1 = new Pessoa("Carlos", 2000, 30, 2);
        assertEquals(pessoa1.calculaImposto(), 0);
    }

    @Test
    @DisplayName("Teste Salario: 3000; Idade: 30; Dependentes: 0")
    public void teste14() {
        Pessoa pessoa1 = new Pessoa("Carlos", 3000, 30, 0);
        assertEquals(pessoa1.calculaImposto(), 114.97);
    }

    @Test
    @DisplayName("Teste Salario: 3000; Idade: 30; Dependentes: 2")
    public void teste15() {
        Pessoa pessoa1 = new Pessoa("Carlos", 3000, 30, 2);
        assertEquals(pessoa1.calculaImposto(), 0);
    }

    @Test
    @DisplayName("Teste Salario: 4000; Idade: 30; Dependentes: 0")
    public void teste16() {
        Pessoa pessoa1 = new Pessoa("Carlos", 4000, 30, 0);
        assertEquals(pessoa1.calculaImposto(), 297.04);
    }

    @Test
    @DisplayName("Teste Salario: 4000; Idade: 30; Dependentes: 2")
    public void teste17() {
        Pessoa pessoa1 = new Pessoa("Carlos", 4000, 30, 2);
        assertEquals(pessoa1.calculaImposto(), 0);
    }

    @Test
    @DisplayName("Teste Salario: 5000; Idade: 30; Dependentes: 0")
    public void teste18() {
        Pessoa pessoa1 = new Pessoa("Carlos", 5000, 30, 0);
        assertEquals(pessoa1.calculaImposto(), 548.85);
    }

    @Test
    @DisplayName("Teste Salario: 5000; Idade: 30; Dependentes: 2")
    public void teste19() {
        Pessoa pessoa1 = new Pessoa("Carlos", 5000, 30, 2);
        assertEquals(pessoa1.calculaImposto(), 189.43);
    }

}