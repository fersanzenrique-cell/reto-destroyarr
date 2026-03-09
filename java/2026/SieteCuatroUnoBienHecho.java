/* solución creada por ChatGPT */
import java.util.Scanner;

public class SieteCuatroUnoBienHecho {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numCasos = sc.nextInt();

        for (int i = 0; i < numCasos; i++) {
            long h = sc.nextLong();
            System.out.println(h * (3 * h + 1) / 2);
        }
    }
}
