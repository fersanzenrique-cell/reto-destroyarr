package veintiSeis;

import java.util.Scanner;

public class SieteCuatroUno {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int numCasos = sc.nextInt();
		for (int i=0; i < numCasos; i++) {
			int altura = sc.nextInt();
			long numCartas = 0;
			for (;altura > 0; altura--) {
				numCartas += altura * 2;
				if (altura > 1) numCartas += altura - 1;
			}
			System.out.println(numCartas);
		}

	}

}
