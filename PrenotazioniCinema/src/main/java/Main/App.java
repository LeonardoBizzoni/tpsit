package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static int[] postiSala = { 50, 50, 50, 50 };

    public static void main(String[] args) {
        // INIT
        Semaphore s = new Semaphore();

        File f = new File("client.txt");
        Scanner reader;
        String[] line;

        int fisico = 0, online = 0;

        CassaFisica cassa0;
        CassaFisica cassa1;
        CassaFisica cassa2;

        CassaOnline online0;
        CassaOnline online1;

        try {
            reader = new Scanner(f);

            while (reader.hasNextLine()) {
                // lettura dati relativi a tipo di cassa, spettacolo scelto, posti richiesti e tempo di permanenza
                line = reader.nextLine().split(",");

                // Prenotazione dei posti e della sala con cassa fisica
                if (line[0].equals("fisica")) {
                    if (fisico == 0) {
                        cassa0 = new CassaFisica(s, Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3]));
                        new Thread(cassa0).start();

                        fisico++;
                    } else if (fisico == 1) {
                        cassa1 = new CassaFisica(s, Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3]));
                        new Thread(cassa1).start();

                        fisico++;
                    } else {
                        cassa2 = new CassaFisica(s, Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3]));
                        new Thread(cassa2).start();

                        fisico = 0;
                    }

                // Prenotazione dei posti e della sala con cassa online
                } else {
                    if (online == 0) {
                        online0 = new CassaOnline(s, Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3]));
                        new Thread(online0).start();

                        online++;
                    } else {
                        online1 = new CassaOnline(s, Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3]));
                        new Thread(online1).start();

                        online--;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
