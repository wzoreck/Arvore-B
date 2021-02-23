
public class Pagina {

	private int grau; // Quantidade m�xima de chaves (elementos) que uma p�gina pode ter
	private Dado chaves[];
	private Pagina filhos[];
	private int numeroChaves; // N�merp de elementos inseridos em uma p�gina
	private Boolean folha;

	public Pagina(int grau, Boolean folha) {
		this.grau = grau;
		chaves = new Dado[grau];
		filhos = new Pagina[grau + 1];
		numeroChaves = 0;
		this.folha = folha;
	}

	public int getGrau() {
		return grau;
	}

	public void setGrau(int grau) {
		this.grau = grau;
	}

	public Dado getChave(int indice) {
		return chaves[indice];
	}

	public void addChave(Dado chave, int indice) {
		chaves[indice] = chave;
	}

	public int addChave(Dado chave) {
		if (numeroChaves == grau)
			return -1; // P�gina lotada

		int i = numeroChaves;
		while (i > 0 && chave.getId() < chaves[i-1].getId()) {
			chaves[i] = chaves[i - 1];
			filhos[i + 1] = filhos[i];
			i--;
		}

		chaves[i] = chave;
		numeroChaves++;
		return i;
	}

	public Pagina getFilho(int indice) {
		return filhos[indice];
	}

	public void addFilho(Pagina pagina, int indice) {
		filhos[indice] = pagina;
	}

	public int getNumeroChaves() {
		return numeroChaves;
	}

	public void setNumeroChaves(int numeroChaves) {
		this.numeroChaves = numeroChaves;
	}

	public void incrementaNumeroChaves() {
		numeroChaves++;
	}

	public void decrementaNumeroChaves() {
		numeroChaves--;
	}

	public Boolean isFolha() {
		return folha;
	}

	public void setFolha(Boolean folha) {
		this.folha = folha;
	}
}
