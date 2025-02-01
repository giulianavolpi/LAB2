public class Compartido extends Thread {

    private int suma;
    private int[][] matriz;

    public synchronized void adicionarAcumFila(int sumaFila) {

        suma += sumaFila;
    }

    public synchronized void darTotal() {

        System.out.println("La suma de la matriz es: " + suma);
    }

}
