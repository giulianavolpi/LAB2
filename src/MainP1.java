import java.util.Random;

public class MainP1 {

    public static void main(String[] args) throws InterruptedException {

        Compartido compartido = new Compartido();
        int n = 100;
        int[][] matriz = new int[n][n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(100);
            }
        }

        Thread[] filas = new Thread[n];
        for (int i = 0; i < n; i++) {
            boolean esUltimo = false;
            filas[i] = new Fila(matriz[i], compartido, esUltimo);
            filas[i].start();
        }

        // compartido.start();

    }

}
