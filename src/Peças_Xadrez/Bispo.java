package Pe�as_Xadrez;

import Tabuleiro.system.Tabuleiro;
import xadrez.system.Cor;
import xadrez.system.Xadrez_Peca;

public class Bispo extends Xadrez_Peca{

	public Bispo(Tabuleiro board, Cor c) {
		super(board, c);
	}

	@Override
	public String toString() {
		return "B";
	}
}
