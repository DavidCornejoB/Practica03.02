package practica03_02;

import Clases.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import practica03_02.controlador.GestionDato;
import practica03_02.modelo.Casa;
import practica03_02.modelo.Persona;

public class Principal1 {

    public static void main(String[] args) {

        Map<Integer, Persona> mapa = new HashMap<>();
        ArrayList<Casa> lista = new ArrayList<>();
        Diccionario dic = new Diccionario(mapa);
        Lista listaLib = new Lista(lista);
        GestionDato gd = new GestionDato();
        Persona p = new Persona();
        Casa c = new Casa();
        int op, opCasa, elem = 0;
        boolean cent;

        do {
            try {
                cent = true;
                elem = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos elementos desea ingresar", "Ingreso", JOptionPane.NO_OPTION));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresar solo numeros", "Error", JOptionPane.ERROR_MESSAGE);
                cent = false;
            }
        } while (cent == false);
        int arreglo[] = new int[elem];
        int arreglo2[] = new int[elem];
        int arregloOrdenado[] = new int[elem];
        int arregloOrdenado2[] = new int[elem];
        for (int i = 0; i < elem; i++) {

            String nombre = JOptionPane.showInputDialog(null, "Nombre del propietario", "Propietario", JOptionPane.NO_OPTION), nom = null, ape = null;
            int codPersona = i + 1;

            for (int j = 0; j < nombre.length(); j++) {
                if (nombre.charAt(j) == 32) {
                    nom = nombre.substring(0, j);
                    ape = nombre.substring(j + 1, nombre.length());
                }
            }
            JOptionPane.showMessageDialog(null, "ID Propietario " + nombre + " Generada: " + codPersona, "Codigo Propietario", JOptionPane.INFORMATION_MESSAGE);
            p.setId(codPersona);
            p.setNombre(nom);
            p.setApellido(ape);

            String NomCasa = JOptionPane.showInputDialog(null, "Nombre de la casa de: " + nombre, "Propietario", JOptionPane.NO_OPTION);
            int codCasa = i + 1;
            JOptionPane.showMessageDialog(null, "ID Casa " + NomCasa + " Generada: " + codCasa, "Codigo Casa", JOptionPane.INFORMATION_MESSAGE);
            c.setId(codCasa);
            c.setNombre(NomCasa);
            p.setCasa(c);
            arreglo[i] = codPersona;
            arreglo2[i] = codCasa;
            dic.agregarElemento(codPersona, p.getNombre() + " " + p.getApellido());
            listaLib.agregarElemento(c.getNombre());
        }
        
        System.out.println("*** Ordenamiento del Diccionario por Burbuja ***");
        arregloOrdenado = gd.ordenarBurbuja(arreglo, elem);
        for(int i = 0; i < arregloOrdenado.length; i++){
            System.out.println(arregloOrdenado[i] + " " + dic.recuperarElemento(arregloOrdenado[i]));
        }
        
        System.out.println("*** Ordenamiento de la Lista por QuickSort ***");
        arregloOrdenado2 = gd.ordenarQuicksort(arreglo2, 0, elem-1);
        for(int i = 0; i < arreglo2.length; i++){
            Object element = listaLib.recuperarElemento(arregloOrdenado2[i]-1);
            System.out.println((i+1) + " " + element);
            
        }

        

        op = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo del propietario", "Recuperar", JOptionPane.NO_OPTION));
        Object elemento = dic.recuperarElemento(op);
        System.out.println("Recuperado " + elemento);

        op = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo del propietario", "Eliminar", JOptionPane.NO_OPTION));
        dic.eliminarElemento(op);
        listaLib.eliminarElemento(op - 1);
        System.out.println("***Listado de las propietarios ingresados");
        List lista1 = dic.recuperarElementos();
        for (int i = 0; i < lista1.size(); i++) {
            System.out.println(lista1.get(i));
        }

        opCasa = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo de la casa", "Recuperar", JOptionPane.NO_OPTION));
        Object elemento1 = listaLib.recuperarElemento(opCasa - 1);
        System.out.println("Recuperado " + elemento1);
        opCasa = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo de la casa", "Eliminar", JOptionPane.NO_OPTION));
        listaLib.eliminarElemento(opCasa - 1);
        //Listar casas
        for (int j = 0; j < lista.size(); j++) {
            System.out.println(lista.get(j));
        }

    }

}
