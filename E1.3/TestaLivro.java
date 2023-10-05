public class TestaLivro {
  public static void main(String[] args) {
    
		Livro livro1 = new Livro(
			"The Spy Coast: A Thriller (The Martini Club Book 1)",
			"Tess Gerritsen",
			2023,
			"Thomas & Mercer"
		);
		Livro livro2 = new Livro(
			"Between Love and Loathing: Dom and Clara's Fake Dating Story",
			"Shain Rose ",
			2023,
			"Greene Ink Publishing"
		);
		Livro livro3 = new Livro(
			"The Broken Vows: Zane and Celeste's Story",
			"Catharina Maura",
			2023,
			"Undefined"
		);

		System.out.println(livro1.toString()+"\n");
		System.out.println(livro2.toString()+"\n");
		System.out.println(livro3.toString()+"\n");
  }
}