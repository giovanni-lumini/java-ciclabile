import java.util.ArrayList;

public class Ciclabile {

    // 1-realizzare una classe che contenga un elenco di interi e che ci permetta di
    // ciclarli (dal primo all’ultimo)
    public static void main(String[] args) {
        ArrayList<Integer> listaDiNumeriInteri = new ArrayList<>();
        listaDiNumeriInteri.add(1);
        listaDiNumeriInteri.add(2);
        listaDiNumeriInteri.add(3);
        listaDiNumeriInteri.add(4);
        listaDiNumeriInteri.add(5);
        System.out.println(listaDiNumeriInteri);

        for (Integer element : listaDiNumeriInteri) {
            System.out.println(element);
        }

    }

    // 2-Dovrà offrire due metodi :
    // 2.1- int getElementoSuccessivo() (che restituisce il prossimo elemento
    // rispetto all’ultima volta che è stato invocato. Cioè la prima volta
    // restituisce il primo elemento, la seconda volta il secondo, …)
    // 2.2- boolean hasAncoraElementi() (che deve restituire true se ci sono ancora
    // elementi da restituire)

    // 3-La classe deve avere un costruttore che prende come parametro un array di
    // interi (che sarà l’elenco che viene gestito internamente)

    // 4-Internamente alla classe vogliamo mantenere l’elenco di interi come array,
    // no ArrayList o simili.

    // 5-Bonus :
    // prevedere anche un costruttore che non prenda parametri e un metodo
    // addElemento che permetta di aggiungere un nuovo intero all’elenco da ciclare.
    // Nota bene:
    // Vanno utilizzati solo gli array nativi e quindi non è possibile usare
    // iterator vari.

}
