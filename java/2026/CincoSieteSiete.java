import java.util.Scanner;

public class CincoSieteSiete {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		int casosDeUso = in.nextInt();
		
		for (int i = 0; casosDeUso > i; i++) {
			
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			
			int contador = 1;
			
			for (int j = a; j <= c; j++) {

				for (int k = b; k > 0; k--) {
					if (j + k == c) {
						contador++;
					}
				}
			}
			System.out.println(contador);
			
			
		}

	}

}
