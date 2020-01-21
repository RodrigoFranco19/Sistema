package Tabuleiro.system;

public class Tabuleiro {

	private int linha;
	private int coluna;
	private Peca [][]pcs;

	public Tabuleiro(int linha, int coluna) {
		
		if(linha < 0 || coluna < 0) {
			throw new BoardException("Invalido na quantidade de linhas e colunas");
		}
		
		this.linha = linha;
		this.coluna = coluna;
		pcs = new Peca[linha][coluna];
	}
	
	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	public Peca piece(int linha,int coluna) {
		if(!PosicaoExiste(linha , coluna)) {
			throw new BoardException("A posicao indicada nao existe");
		}
		return pcs[linha][coluna];
	}

	public Peca piece(Posicao pos) {
		if(!PosicaoExiste(pos)) {
			throw new BoardException("A posicao indicada nao existe");
		}
		return pcs[pos.getLinha()][pos.getColuna()];
	}
	
	public void PlacePiece(Peca pc , Posicao pos) {
		if(TemPeca(pos)) {
			throw new BoardException("Ja tem uma peca na posicao " + pos);
		}
		pcs[pos.getLinha()][pos.getColuna()] = pc;
		pc.pos = pos;
	}
	
	public boolean PosicaoExiste(Posicao pos) {
		return PosicaoExiste(pos.getLinha(),pos.getColuna());
	}
	
	public boolean PosicaoExiste(int row , int column) {
		return row >= 0 && row < linha && column >= 0 && column < coluna;
	}
	
	public boolean TemPeca(Posicao pos) {
		if(!PosicaoExiste(pos)) {
			throw new BoardException("A peca nao existe");
		}
		return piece(pos) != null;
	}
}