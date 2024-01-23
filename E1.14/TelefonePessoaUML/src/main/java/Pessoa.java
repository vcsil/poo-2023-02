import java.lang.String;
import java.util.*;

public class Pessoa {
    private java.lang.String nome;
    private java.lang.String cpf;
    private java.lang.String[] telefones;

    public Pessoa(java.lang.String nome, java.lang.String cpf) {
        setNome(nome);
        setCpf(cpf);
        this.telefones = new java.lang.String[1];
    }

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public java.lang.String getCpf() {
        return cpf;
    }

    public void setCpf(java.lang.String cpf) {
        this.cpf = cpf;
    }

    public java.lang.String[] getTelefones() {
        return telefones;
    }

    public void setTelefones(java.lang.String novoNumero) {
        if (this.telefones[0] == null) {
            this.telefones[0] = novoNumero;
        } else {
            for (java.lang.String numero : telefones) {
                if (numero.equals(novoNumero)) {
                    return;
                }
            }
            int qntTelefone = telefones.length;
            telefones = Arrays.copyOf(telefones, qntTelefone + 1);
            telefones[qntTelefone] = novoNumero;
        }
    }

    public void delTelefones(java.lang.String atualNumero) {
        if (telefones[0] == null) {
            return;
        }
        boolean encontrada = false;
        java.lang.String[] arrayNumero = getTelefones();

        for (int i = 0; i < arrayNumero.length; i++) {
            if (arrayNumero[i].equals(atualNumero)) {
                encontrada = true;
                break;
            }
        }
        // Se a string foi encontrada, criar um novo array sem ela
        if (encontrada) {
            java.lang.String[] novoArray = new String[arrayNumero.length - 1];
            int j = 0;
            for (int i = 0; i < arrayNumero.length; i++) {
                if (!arrayNumero[i].equals(atualNumero)) {
                    novoArray[j++] = arrayNumero[i];
                }
            }
            this.telefones = novoArray;
        }
    }

    @Override
    public java.lang.String toString() {
        java.lang.String texto = "Dono: " + getNome() + "\nNumeros:\n";
        texto += "\n";
        java.lang.String[] arrayTelefones = getTelefones();
        for (int i = 0; i < arrayTelefones.length; i++) {
            texto += i + " - " + arrayTelefones[i] + "\n";
        }
        return texto;
    }
}