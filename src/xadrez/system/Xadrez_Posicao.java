package xadrez.system;

import Tabuleiro.system.Posicao;

public class Xadrez_Posicao {

	private char coluna;
	private int linha;
	
	public Xadrez_Posicao(char coluna, int linha) {
		if(coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {
			throw new ChessException("Invalidos na posicao");
		}
		this.coluna = coluna;
		this.linha = linha;
	}

	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}
	
	protected Posicao toPosition() {
		return new Posicao(8 - linha , coluna - 'a');
	}
	
	protected static Xadrez_Posicao fromPosition(Posicao pos) {
		return new Xadrez_Posicao((char)('a'- pos.getColuna()),8 - pos.getLinha());
	}
	
	@Override
	public String toString() {
		return "" + coluna + linha;
	}
}