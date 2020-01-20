import xadrez.system.Xadrez_Peca;

public class Interface {

	public static void imprimir(Xadrez_Peca[][] pieces) {
		for(int x = 0 ; x < pieces.length ; x++) {
			System.out.print((8 - x) + " ");
			for(int y = 0 ; y < pieces.length ; y++) {
				ImprimirPeca(pieces[x][y]);
			}
			System.out.println();
		}
		System.out.print(" a  b  c  d  e  f  g  h ");
	}
	
	private static void ImprimirPeca(Xadrez_Peca piece) {
		if(piece == null) {
			System.out.print("-");
		}else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
