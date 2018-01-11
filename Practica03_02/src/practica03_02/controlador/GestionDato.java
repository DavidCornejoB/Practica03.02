/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica03_02.controlador;

import Clases.Lista;

/**
 *
 * @author Administrador
 */
public class GestionDato {

    boolean cent = false;

    public int[] ordenarBurbuja(int[] arreglo, int elem) {

        int[] retorno = new int[elem];

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    int tmp = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            retorno[i] = arreglo[i];
        }
        return retorno;

    }

    public int[] ordenarQuicksort(int A[], int izq, int der) {

        int pivote = A[izq];
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            while (A[i] <= pivote && i < j) {
                i++;
            }
            while (A[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
        }
        A[izq] = A[j];
        A[j] = pivote;
        if (izq < j - 1) {
            ordenarQuicksort(A, izq, j - 1);
            cent = false;
        }
        if (j + 1 < der) {
            ordenarQuicksort(A, j + 1, der);
            cent = true;
        }

        if (cent = true) {
            return A;
        } else {
            return null;
        }
    }

}
