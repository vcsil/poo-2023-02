import java.lang.String;

public class Telefone {
    private java.lang.String numero;
    private Pessoa dono;

    public Telefone(java.lang.String numero, Pessoa dono) {
        setNumero(numero);
        setDono(dono);
    }

    public java.lang.String getNumero() {
        return numero;
    }

    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        dono.setTelefones(this.numero);
        this.dono = dono;
    }

}