
public class Main {

	public static void main(String[] args) {
		
		// Criando uma nova �rvore onde cada folha suporta no m�ximo 4 chaves
		ArvoreB arvoreB = new ArvoreB(4);
		arvoreB.inserir(new Dado(10));
		arvoreB.inserir(new Dado(5));
		arvoreB.inserir(new Dado(15));
	}

}
