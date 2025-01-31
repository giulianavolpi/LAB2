public class Compartido extends Thread {

    private int suma;
    private int[][] matriz;

    public synchronized void adicionarAcumFila(int matriz) {
        suma = 0;
        for (int i = 0; i < matriz; i++) {
            suma += matriz;
        }
    }

    public synchronized void darTotal(int matriz) {

        System.out.println("La suma de la matriz es: " + suma);
    }

}
