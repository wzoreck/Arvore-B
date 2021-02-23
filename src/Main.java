
public class Main {

	public static void main(String[] args) {
		
		// Criando uma nova árvore onde cada folha suporta no máximo 4 chaves
		ArvoreB arvoreB = new ArvoreB(4);
		arvoreB.inserir(new Dado(10));
		arvoreB.inserir(new Dado(5));
		arvoreB.inserir(new Dado(15));
	}

}
