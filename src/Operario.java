import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Operario extends Thread {

    private int id;
    private BuzonOrdenes buzon;

    public Operario(int pid, BuzonOrdenes pbuzon) {
        {
            this.id = pid;
            this.buzon = pbuzon;
        }
    }

    public void run() {
        while (true) {
            if (!buzon.darHayUltimaOrden()) {
                // Espera Activa
            } else {
                int idUltimaOrden = buzon.darUltimaOrden();
                System.out.println("Operario " + id + " procesando la orden " + idUltimaOrden);
            }

        }

    }
}
