package xadrez.system;

import Peças_Xadrez.*;
import Tabuleiro.system.Posicao;
import Tabuleiro.system.Tabuleiro;

public class Partida {

	private static Tabuleiro tab;
	
	public Partida() {
		tab = new Tabuleiro(8,8);
		InicialSetUp();
	}
	
	public static Xadrez_Peca[][] getPieces(){
		Xadrez_Peca[][] mat = new Xadrez_Peca[tab.getLinha()][tab.getColuna()];
		
		for(int i = 0 ; i < tab.getLinha() ; i++) {
			for(int j = 0 ; j < tab.getColuna() ; j++) {
				mat[i][j] = (Xadrez_Peca) tab.piece(i, j);
			}}
		return mat;
	}
	
	private void InicialSetUp() {
		tab.PlacePiece(new Rei(tab, Cor.WHITE), new Posicao(0,2));
		tab.PlacePiece(new Torre(tab,Cor.BLACK), new Posicao(0,0));
	}
}
