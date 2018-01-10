package practica03_02;

import Clases.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;
import practica03_02.modelo.Casa;
import practica03_02.modelo.Persona;

public class Principal1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Map<Integer, Persona> mapa = new HashMap<>();
        ArrayList<Casa> lista = new ArrayList<>();
        Diccionario dic = new Diccionario(mapa);
        Lista listaLib = new Lista(lista);
        Persona p = new Persona();
        Casa c = new Casa();
        int op, opCasa, elem;
        System.out.println("***Ingreso de datos***");
        elem = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos elementos desea ingresar", "Ingreso", JOptionPane.NO_OPTION));

        for (int i = 0; i < elem; i++) {

            System.out.println("Nombre del propietario");
            String nombre = leer.next();
            int codPersona = i + 1;
            JOptionPane.showMessageDialog(null, "ID Propietario " + nombre + " Generada: " + codPersona, "Codigo Propietario", JOptionPane.INFORMATION_MESSAGE);
            p.setId(codPersona);
            p.setNomApe(nombre);

            System.out.println("Nombre de la casa de: " + nombre);
            String NomCasa = leer.next();
            int codCasa = i + 1;
            JOptionPane.showMessageDialog(null, "ID Casa " + NomCasa + " Generada: " + codCasa, "Codigo Casa", JOptionPane.INFORMATION_MESSAGE);
            c.setId(codCasa);
            c.setNombre(NomCasa);
            p.setCasa(c);

            dic.agregarElemento(codPersona, p.getNomApe());
            listaLib.agregarElemento(c.getNombre());
        }
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo del propietario", "Recuperar", JOptionPane.NO_OPTION));
        Object elemento = dic.recuperarElemento(op);
        System.out.println("Recuperado "+elemento);
        
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo del propietario", "Eliminar", JOptionPane.NO_OPTION));
        dic.eliminarElemento(op);
        listaLib.eliminarElemento(op-1);
        System.out.println("***Listado de las propietarios ingresados");
        List lista1 = dic.recuperarElementos();
        for (int i = 0; i < lista1.size(); i++) {
            System.out.println(lista1.get(i));
        }

        opCasa = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo de la casa", "Recuperar", JOptionPane.NO_OPTION));
        Object elemento1 = listaLib.recuperarElemento(opCasa-1);
        System.out.println("Recuperado "+elemento1);
        opCasa = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo de la casa", "Eliminar", JOptionPane.NO_OPTION));
        listaLib.eliminarElemento(opCasa-1);
        //Listar casas
        for(int j=0;j<lista.size();j++){
            System.out.println(lista.get(j));
        }
    }

}
