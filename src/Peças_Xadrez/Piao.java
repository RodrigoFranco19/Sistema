package Peças_Xadrez;

import Tabuleiro.system.Tabuleiro;
import xadrez.system.Cor;
import xadrez.system.Xadrez_Peca;

public class Piao extends Xadrez_Peca {

	public Piao(Tabuleiro board, Cor c) {
		super(board, c);
	}

	@Override
	public String toString() {
		return "P";
	}
	
	
	
}
