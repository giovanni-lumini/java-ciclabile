import java.util.ArrayList;
import java.util.Iterator;

public class CiclabileArrayList {
    // variabile d'istanza
    private ArrayList<Integer> listaDiNumeriInteri;
    private Iterator<Integer> iterator;

    // costruttore
    public CiclabileArrayList(ArrayList<Integer> listaDiNumeriInteri) {
        this.listaDiNumeriInteri = listaDiNumeriInteri;
        this.iterator = listaDiNumeriInteri.iterator();
    }

    // metodi
    // getElementoSuccessivo:
    // restituisce il prossimo elemento rispetto all’ultima volta che è stato
    // invocato.
    // la prima volta restituisce il primo elemento, la seconda il secondo,ecc..
    public Integer getElementoSuccessivo() {
        if (iterator.hasNext()) {
            return iterator.next(); // restituisce il prossimo elemento, se c'è
        }
        return null; // restituisce null se non si sono più elementi
        // hasNext() significa: fin che ci sono elementi disponibili,
        // se ci sono: hasNext()= true, se non ci sono hasNext()= false
        // next() significa: restituisci il prossimo elemento
    }

    // hasAncoraElementi
    // deve restituire true se ci sono ancora elementi da restituire
    public boolean hasAncoraElementi() {
        return iterator.hasNext(); // restituisce true se ci sono elementi disponibili, false se non ci sono
    }

    public static void main(String[] args) {

        // creiamo l'ArrayList da passare poi a Ciclabile
        ArrayList<Integer> nuovaListaDiNumeriInteri = new ArrayList<Integer>();

        // aggiungiamo elementi a nuovaListaDiNumeriInteri
        nuovaListaDiNumeriInteri.add(1);
        nuovaListaDiNumeriInteri.add(2);
        nuovaListaDiNumeriInteri.add(3);
        nuovaListaDiNumeriInteri.add(4);
        nuovaListaDiNumeriInteri.add(5);

        // creiamo l'oggetto Ciclabile
        CiclabileArrayList ciclabile = new CiclabileArrayList(nuovaListaDiNumeriInteri);

        // getElementoSuccessivo e hasAncoraElementi:
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi());
    }
}