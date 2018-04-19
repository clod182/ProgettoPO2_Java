package company;

import javax.print.DocFlavor;

//array
public class ArrayList {

    //GETTER
    //SETTER
    //INSERT
    //REMOVE


    //ALGORITMI ORDINAMENTO

    //quicksort
    //caso migliore : O(n log n)
    //caso peggiore: O(n^2)
    void quickSort(int array[], int left, int right) {
        int index = partition(array, left, right);
        if (left < index - 1)
            quickSort(array, left, index - 1);
        if (index < right)
            quickSort(array, index, right);
    }

    int partition(int arr[], int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }

    //bubblesort
    //caso migliore: O(n)
    //caso peggiore: O(n^2)

    public void bubbleSort(int [] array) {
        for(int i = 0; i < array.length; i++) {
            boolean flag = false;
            for(int j = 0; j < array.length-1; j++) {
                //Se l' elemento j e maggiore del successivo allora scambiamo i valori
                if(array[j]>array[j+1]) {
                    int k = array[j];
                    array[j] = array[j+1];
                    array[j+1] = k;
                    flag=true; //Lo setto a true per indicare che é avvenuto uno scambio
                }
            }
            /*Se flag=false allora vuol dire che nell' ultima iterazione
            //non ci sono stati scambi, quindi il metodo può terminare
            //poiché l' array risulta ordinato*/
            if(!flag) break;
        }
    }

    //selection sort
    /*Numero di confronti é O(n^2) in ogni caso, mentre il numero di scambi è lineare O(n) nel caso peggiore
     mentre é costante O(1) nel caso migliore. */

    public void selectionSort(int [] array) {
        for(int i = 0; i < array.length-1; i++) {
            int minimo = i; //Partiamo dall' i-esimo elemento
            for(int j = i+1; j < array.length; j++) {
                /*Qui avviene la selezione, ogni volta che nell' iterazione troviamo un elemento piú piccolo di minimo
                facciamo puntare minimo all' elemento trovato*/
                if(array[minimo]>array[j]) {
                    minimo = j;
                }
            }
            //Se minimo e diverso dall' elemento di partenza allora avviene lo scambio
            if(minimo!=i) {
                int k = array[minimo];
                array[minimo]= array[i];
                array[i] = k;
            }
        }
    }

    //insertion sort
    //caso migliore: O(n)
    //caso peggiore: O(n^2)


    //mergesort
    /* La complessita della fusione (metodo merge) é lineare O(n), mentre mergeSort richiama se stessa due volte ogni
    volta su metà del vettore di input, quindi se associamo la funzione temporale al tempo di esecuzione del mergeSort
    T(n) = 2T(n/2)+O(n) = O(n log n)
    La complessitá rimane la stessa sia nel coso peggiore, medio e migliore, poiché il processo ricorsivo non puó essere
     arrestato anticipatamente la complessitá é O(n log n) in ogni caso.*/
}

