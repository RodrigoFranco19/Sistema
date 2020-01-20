import Tabuleiro.system.Tabuleiro;
import xadrez.system.Partida;

public class Programa {

	public static void main(String[] args) {
		Tabuleiro tab = new Tabuleiro(8,8);
		
		Partida p = new Partida();
		
		Interface.imprimir(Partida.getPieces());
		
		
	}

}
