package Tabuleiro.system;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peca [][]pcs;

	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pcs = new Peca[linhas][colunas];
	}
	
	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
}