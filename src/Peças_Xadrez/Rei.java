package Peças_Xadrez;

import Tabuleiro.system.Tabuleiro;
import xadrez.system.Cor;
import xadrez.system.Xadrez_Peca;

public class Rei extends Xadrez_Peca{
	
	public Rei(Tabuleiro board, Cor c) {
		super(board, c);
	}
	
	@Override 
	public String toString() {
		return "K";
	}
}
