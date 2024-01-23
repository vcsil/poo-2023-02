public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Tailson", "01234567890");
        Telefone t1 = new Telefone("123456", p1);
        Telefone t6 = new Telefone("123456", p1);
        Telefone t2 = new Telefone("234567", p1);
        Telefone t3 = new Telefone("345678", p1);
        Telefone t4 = new Telefone("456789", p1);
        Telefone t5 = new Telefone("567890", p1);
        System.out.println(p1);

        p1.delTelefones("567890");
        System.out.println(p1);

        p1.delTelefones("567890");
        System.out.println(p1);

    }
}