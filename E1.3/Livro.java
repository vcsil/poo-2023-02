class Livro {
	private String titulo; // nome da obra (sequência de caracteres)
	private String autor; // autor da obra
	private int ano; // inteiro representando o ano de publicação
	private String editora; // nome da editora.

	public Livro(String titulo, String autor, int ano, String editora) {
		this.titulo = titulo;
    this.autor = autor;
    this.ano = ano;
    this.editora = editora;
  }

	public void settTtulo(String novotTtulo) {
		titulo = novotTtulo;
	}
	public String gettTtulo() {
		return titulo;
	}
	
	public void setAutor(String novoAutor) {
		autor = novoAutor;
	}
	public String getAutor() {
		return autor;
	}
	
	public void setAno(int novoAno) {
		ano = novoAno;
	}
	public int getAno() {
		return ano;
	}
	
	public void setEditora(String novoEditora) {
		editora = novoEditora;
	}
	public String getEditora() {
		return editora;
	}

	@Override
	public String toString() {
    return titulo + "\n" + autor + "\n" + editora + ", " + ano;
  }
}