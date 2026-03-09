import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.io.IOException;

public class DosNueveUno {
	public static BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		Byte casosPrueba = Byte.valueOf(in.readLine());
		while (casosPrueba > 0) {
			String[] linea = new String[casosPrueba];
			TreeMap<String,ArrayList<Integer>> palabras = new TreeMap<>();
			ArrayList<Integer> posicion = new ArrayList<>();
			for (int i = 0; i < casosPrueba; i++) {
				linea[i] = String.valueOf(in.readLine()).toLowerCase();
				for (String palabra : linea[i].split(" ")) {
					if (palabra.length() > 2) {
						if (palabras.containsKey(palabra)) {
							posicion.add(i+1);
							palabras.put(palabra, posicion);
						} else {
							palabras.put(palabra, posicion);
						}
						
					}
					
				}
			
			}
			System.out.println(palabras);
			
			casosPrueba = Byte.valueOf(in.readLine());
		}
	}
}
