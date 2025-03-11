import java.util.Arrays;

public class CiclabileArray {
    // variabili d'istanza
    private int[] listaDiNumeriInteri;
    private int indiceCorrente;

    // costruttore
    public CiclabileArray() {
        this.listaDiNumeriInteri = new int[5];
        indiceCorrente = 0;
    }

    // metodi
    // hasAncoraElementi
    // deve restituire true se ci sono ancora elementi da restituire
    public boolean hasAncoraElementi() {
        return indiceCorrente < listaDiNumeriInteri.length; // Controlla se l'indice è ancora valido
    }

    // getElementoSuccessivo:
    // restituisce il prossimo elemento rispetto all’ultima volta che è stato
    // invocato.
    // la prima volta restituisce il primo elemento, la seconda il secondo,ecc..
    public int getElementoSuccessivo() {
        if (hasAncoraElementi()) {
            return listaDiNumeriInteri[indiceCorrente++]; // Restituisce l'elemento e incrementa l'indice
        }
        return 0; // Nessun altro elemento
    }

    // addElemento:
    // aggiungere un nuovo intero all'array
    public int[] addElemento(int elemento) {
        // Creiamo un nuovo array con uno spazio in più
        int[] nuovoArray = Arrays.copyOf(listaDiNumeriInteri, listaDiNumeriInteri.length + 1);
        // Aggiungiamo il nuovo elemento in fondo
        nuovoArray[nuovoArray.length - 1] = elemento;
        // Aggiorniamo l'array originale
        listaDiNumeriInteri = nuovoArray;
        return listaDiNumeriInteri;
    }

    public static void main(String[] args) {

        // creiamo un oggetto Ciclabile dal costruttore senza parametri
        CiclabileArray ciclabile = new CiclabileArray();

        // addElemento
        ciclabile.addElemento(6);
        ciclabile.addElemento(7);

        // getElementoSuccessivo e hasAncoraElementi
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
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi()); // Dovrebbe stampare false
        System.out.println(ciclabile.getElementoSuccessivo()); // Dovrebbe stampare 0
        System.out.println(ciclabile.hasAncoraElementi()); // Dovrebbe stampare false
    }
}
