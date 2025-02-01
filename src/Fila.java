public class Fila extends Thread {

    private int[] fila;
    private Compartido compartido;
    private boolean esUltimo;

    public Fila(int[] pfila, Compartido pcompartido, boolean pesUltimo) {
        this.fila = pfila;
        this.compartido = pcompartido;
        this.esUltimo = pesUltimo;
    }

    @Override
    public void run() {
        int sumaFila = 0;
        for (int i = 0; i < fila.length; i++) {
            sumaFila += fila[i];
        }
        compartido.adicionarAcumFila(sumaFila);
        if (esUltimo) {
            compartido.darTotal();
        }
    }

}
