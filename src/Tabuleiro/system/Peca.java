package Tabuleiro.system;

public class Peca {
protected Posicao pos;
private Tabuleiro board;

protected Tabuleiro getBoard() {
	return board;
}

public Peca(Tabuleiro board) {
	this.board = board;
}
}