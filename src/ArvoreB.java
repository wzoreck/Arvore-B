
public class ArvoreB {

	private Pagina root;
	private int grau;

	public ArvoreB(int grau) {
		this.grau = grau;
	}

	public void inserir(Dado chave) {
		if (root == null) { // Criar a p�gina raiz folha e inserir a primeira chave
			root = new Pagina(grau, true);
			root.addChave(chave);
			return;
		}
		if (root.isFolha()) { // Inserir chaves na raiz, se for folha
			adicionarEmFolha(root, chave);
		} else {
			// Percorer at� a folha onde vai ser adicionado
			// Chamar adicionarEmFolha
		}
	}

	public void adicionarEmFolha(Pagina pagina, Dado chave) {
		if (pagina.getNumeroChaves() < grau) {
			pagina.addChave(chave);
			return;
		} else { // Caso a raiz esteja lotada
			pagina = dividir(pagina, chave);
			return;
		}
	}

	public Pagina dividir(Pagina paginaAtual, Dado chave) { // Quando uma p�gina estiver lotada, dividir
		Pagina novoPai = new Pagina(grau, false);
		Pagina p1 = paginaAtual;
		Pagina p2 = new Pagina(grau, p1.isFolha());
		Dado temporario[] = new Dado[grau + 1]; // Recebe os vavlores da p�gina atual e o novo
		// Continuar ...

		novoPai.addFilho(p1, 0);
		novoPai.addFilho(p2, 1);

		//Continuar..
		
		return novoPai;
	}

	public void getDado(int id) {

	}

	public void deletarDado(int id) {

	}
	
	public Dado buscarMaisDireita(Pagina pagina) { // Remo��o de n� que n�o seja folha
		// Encontrar o elemento mais a direita do filho passado (filho da esquerda)
		return null;
	}
	
	public void concatenar() {
		//
	}
	
	public void redistribuir() {
		//
	}

	public void percorrerEmOrdem() {

	}
}

// A inser��o e remo��o devem garantir a ordena��o e balanceamento