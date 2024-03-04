package a_revisao_desafio_jogador;

public class Jogador {
	
	private String nome;
	//string n inicializada é nulo/ numeros é 0
	private int camisa;
	private int gols;
	
	
	public Jogador(String nome, int camisa, int gols) {
		this.nome = nome;
		this.camisa = camisa;
		this.gols = gols;
	}
	
	public Jogador() {
		setNome("");
		setCamisa(999);
		setGols(-1);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCamisa() {
		return camisa;
	}
	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}
	public int getGols() {
		return gols;
	}
	public void setGols(int gols) {
		this.gols = gols;
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", camisa=" + camisa + ", gols=" + gols + "]";
	}
	
	

}
