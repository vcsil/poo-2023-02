import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestTestaPessoas {

    @Test
    @DisplayName("Cria pessoa")
    public void teste01() {
        java.lang.String nome = "Tailson";
        java.lang.String cpf = "01234567890";

        Pessoa p1 = new Pessoa(nome, cpf);
        assertEquals(p1.getNome(), nome);
        assertEquals(p1.getCpf(), cpf);
    }

    @Test
    @DisplayName("Cria telefone relacionado a pessoa")
    public void teste02() {
        java.lang.String nome = "Tailson";
        java.lang.String cpf = "01234567890";
        Pessoa p1 = new Pessoa(nome, cpf);

        java.lang.String numero = "123456789";
        Telefone t1 = new Telefone(numero, p1);

        assertEquals(t1.getNumero(), numero);
    }

    @Test
    @DisplayName("Adiciona dois número para a mesma pessoa")
    public void teste03() {
        java.lang.String nome = "Tailson";
        java.lang.String cpf = "01234567890";
        Pessoa p1 = new Pessoa(nome, cpf);

        java.lang.String numero1 = "123456789";
        Telefone t1 = new Telefone(numero1, p1);
        java.lang.String numero2 = "123456780";
        Telefone t2 = new Telefone(numero2, p1);

        assertEquals(t1.getNumero(), numero1);
        assertEquals(t2.getNumero(), numero2);
        assertEquals(p1.getTelefones().length, 2);
        assertEquals(p1.getTelefones()[0], numero1);
        assertEquals(p1.getTelefones()[1], numero2);
    }

    @Test
    @DisplayName("Deleta um numero da pessoa")
    public void teste04() {
        java.lang.String nome = "Tailson";
        java.lang.String cpf = "01234567890";
        Pessoa p1 = new Pessoa(nome, cpf);

        java.lang.String numero1 = "123456789";
        Telefone t1 = new Telefone(numero1, p1);
        java.lang.String numero2 = "123456780";
        Telefone t2 = new Telefone(numero2, p1);
        p1.delTelefones(numero2);

        assertEquals(p1.getTelefones().length, 1);
    }

    @Test
    @DisplayName("Deleta um numero que não existe")
    public void teste05() {
        java.lang.String nome = "Tailson";
        java.lang.String cpf = "01234567890";
        Pessoa p1 = new Pessoa(nome, cpf);

        java.lang.String numero1 = "123456789";
        p1.delTelefones(numero1);

        assertEquals(p1.getTelefones().length, 1);
        assertEquals(p1.getTelefones()[0], null);
    }
}