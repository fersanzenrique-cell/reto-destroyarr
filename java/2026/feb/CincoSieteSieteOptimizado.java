import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CincoSieteSieteOptimizado {
	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());

        for (int i = 0; i < casos; i++) {

            String[] p = br.readLine().split(" ");
            int a = Integer.parseInt(p[0]);
            int b = Integer.parseInt(p[1]);
            int c = Integer.parseInt(p[2]);

            int inicio = Math.max(a, c - b);
            int fin = c - 1;

            int soluciones = Math.max(0, fin - inicio + 1);

            System.out.println(1 + soluciones);
        }
    }
}
