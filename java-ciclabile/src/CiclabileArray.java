import java.util.Arrays;

public class CiclabileArray {
    // variabili d'istanza
    private int[] listaDiNumeriInteri;
    private int indiceCorrente;

    // costruttore
    public CiclabileArray() {
        this.listaDiNumeriInteri = new int[0];
        this.indiceCorrente = 0;
    }

    // metodi
    // hasAncoraElementi
    // deve restituire true se ci sono ancora elementi da restituire
    public boolean hasAncoraElementi() {
        // se l'indice corrente è inferiore al numero di elementi nell’array
        // ritorna true, altrimenti false
        return indiceCorrente < listaDiNumeriInteri.length;
    }

    // getElementoSuccessivo:
    // restituisce il prossimo elemento rispetto all’ultima volta che è stato
    // invocato.
    // la prima volta restituisce il primo elemento, la seconda il secondo,ecc..
    public int getElementoSuccessivo() {
        // se ci sono ancora elementi da restituire (true)
        if (hasAncoraElementi()) {
            // ritorna il porssimo elemento e incrementa l'indice
            return listaDiNumeriInteri[indiceCorrente++];
        }
        // altrimenti ritorna 0 se non si sono più elementi
        return 0;
    }

    // addElemento:
    // aggiungere un nuovo intero all'array
    public int[] addElemento(int elementoDaAggiungere) {
        // creiamo un nuovo array, copia dell'originale, con uno spazio in più
        int[] nuovoArray = Arrays.copyOf(listaDiNumeriInteri, listaDiNumeriInteri.length + 1);
        // aggiungiamo il nuovo elemento all'ultimo indice dell'array
        nuovoArray[nuovoArray.length - 1] = elementoDaAggiungere;
        // aggiorniamo l'array originale
        listaDiNumeriInteri = nuovoArray;
        return listaDiNumeriInteri;
    }

    public static void main(String[] args) {

        // creiamo un oggetto Ciclabile dal costruttore senza parametri
        CiclabileArray ciclabile = new CiclabileArray();

        // addElemento
        ciclabile.addElemento(1);
        ciclabile.addElemento(2);
        ciclabile.addElemento(3);
        ciclabile.addElemento(4);
        ciclabile.addElemento(5);
        ciclabile.addElemento(6);

        // getElementoSuccessivo e hasAncoraElementi
        while (ciclabile.hasAncoraElementi()) {
            System.out.println(ciclabile.getElementoSuccessivo());
        }
    }
}
