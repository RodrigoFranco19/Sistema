package xadrez.system;

import Tabuleiro.system.Peca;
import Tabuleiro.system.Tabuleiro;

public class Xadrez_Peca extends Peca{

	private Cor c;

	public Xadrez_Peca(Tabuleiro board, Cor c) {
		super(board);
		this.c = c;
	}
	
	public Cor getC() {
		return c;
	}
}
