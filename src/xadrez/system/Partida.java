package xadrez.system;

import Peças_Xadrez.*;
import Tabuleiro.system.*;

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
	
	private void PlaceNewPiece(char coluna , int linha, Xadrez_Peca pc) {
		tab.PlacePiece(pc, new Xadrez_Posicao(coluna,linha).toPosition());
	}
	
	private void InicialSetUp() {
		PlaceNewPiece('a',8,new Torre(tab, Cor.WHITE));
		PlaceNewPiece('b',8,new Cavalo(tab, Cor.WHITE));
		PlaceNewPiece('c',8,new Bispo(tab,Cor.WHITE));
		PlaceNewPiece('d',8,new Rainha(tab,Cor.WHITE));
		PlaceNewPiece('e',8,new Rei(tab,Cor.WHITE));
		PlaceNewPiece('f',8,new Bispo(tab,Cor.WHITE)); 
		PlaceNewPiece('g',8,new Cavalo(tab,Cor.WHITE)); 
		PlaceNewPiece('h',8,new Torre(tab,Cor.WHITE)); 

		PlaceNewPiece('a',7,new Piao(tab,Cor.WHITE));
		PlaceNewPiece('b',7,new Piao(tab,Cor.WHITE));
		PlaceNewPiece('c',7,new Piao(tab,Cor.WHITE));
		PlaceNewPiece('d',7,new Piao(tab,Cor.WHITE));
		PlaceNewPiece('e',7,new Piao(tab,Cor.WHITE));
		PlaceNewPiece('f',7,new Piao(tab,Cor.WHITE));
		PlaceNewPiece('g',7,new Piao(tab,Cor.WHITE));
		PlaceNewPiece('h',7,new Piao(tab,Cor.WHITE));
	}
}
