package veintiSeis;

import java.util.Scanner;

public class SeisUnoDos {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(sc.hasNext()) {
			double r = sc.nextInt();
			double c1 = sc.nextInt();
			double c2 = sc.nextInt();
			int contador = 0;
			do {
				if ((Math.sqrt(Math.pow(c1, 2) + Math.pow(c2,2)) <= r)) contador++;
				if (r > 1) {
					for (double i = Math.floor(r/2); i > r; i = Math.floor(i/2)) {
						if (c1 > c2) {
							if (c1 > 0 && (Math.sqrt(Math.pow(c1 - r, 2) + Math.pow(c1 + r , 2)) <= i)) contador++;
							if (c1 < 0 && (Math.sqrt(Math.pow(c1 - r, 2) + Math.pow(c1 + r , 2)) <= i))
						}
						if ((Math.sqrt(Math.pow(Math.abs(c1) - r, 2) + Math.pow(Math.abs(c1) - r , 2)) <= i)) contador++;
					}
				}
				r = Math.floor(r/2);
			} while (r > 1);
			System.out.println(contador);
		}

	}

}
 