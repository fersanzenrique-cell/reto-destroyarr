package veintiSeis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class UnoCeroCero {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static byte contador = 0;
	static void printSalida() { System.out.println(contador);}
	public static void main(String[] args) throws IOException {
		byte numCasos = Byte.valueOf(in.readLine());
		for (byte i = 0; i < numCasos; i++) {
			String num = String.valueOf(in.readLine());
			if (num.equals("6174")) {
				printSalida();
			} else {
				char[] kapChar;
				char[] revKapChar = new char[4];
				char[] temp;
				int kapNum;
				int revKapNum; /* forzado a declarar int por el metodo max y min*/
				while (!num.equals("6174")) {
				
					kapChar = String.valueOf(num).toCharArray();
					Arrays.sort(kapChar);
					
					for (byte j = 0, k = (byte) (kapChar.length - 1); j < kapChar.length; j++,k--) {
						revKapChar[j] = kapChar[k];
					}
					
					kapNum = Integer.parseInt(String.valueOf(kapChar));
					revKapNum = Integer.parseInt(String.valueOf(revKapChar));
					temp = String.valueOf(Integer.toString(Math.max(kapNum, revKapNum) - Math.min(kapNum, revKapNum))).toCharArray();
					num = String.valueOf(temp);
					contador++;
				}
				printSalida();
				contador = 0;
			}
		}
		in.close();
		
	}

}
