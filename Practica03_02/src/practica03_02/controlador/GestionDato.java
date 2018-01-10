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

}
