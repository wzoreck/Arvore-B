
public class Pagina {

	private int grau;
	private Dado chaves[];
	private Pagina filhos[];
	
	public Pagina(int grau) {
		this.grau = grau;
		chaves = new Dado[grau];
		filhos = new Pagina[grau+1];
	}
}
