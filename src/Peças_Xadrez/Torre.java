package Peças_Xadrez;

import Tabuleiro.system.Tabuleiro;
import xadrez.system.Cor;
import xadrez.system.Xadrez_Peca;

public class Torre extends Xadrez_Peca{

	public Torre(Tabuleiro board, Cor c) {
		super(board, c);
	}

	@Override
	public String toString(){
		return "T";
	}
}
