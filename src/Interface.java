import xadrez.system.Xadrez_Peca;

public class Interface {

	public static void imprimir(Xadrez_Peca[][] pcs) {
		for(int x = 0 ; x < pcs.length ; x++) {
			System.out.print((8 - x) + " ");
			for(int y = 0 ; y < pcs.length ; y++) {
				ImprimirPeca(pcs[x][y]);
			}
			System.out.println();
		}
		System.out.print(" a  b  c  d  e  f  g  h ");
	}
	
	private static void ImprimirPeca(Xadrez_Peca piece) {
		if(piece == null) {
			System.out.println("-");
		}else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
