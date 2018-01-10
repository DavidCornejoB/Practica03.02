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
        
        Map<Integer,Persona>mapa=new HashMap<>();
        ArrayList<Casa>lista=new ArrayList<>();
        Diccionario dic=new Diccionario(mapa);
        Lista listaLib=new Lista(lista);
        Persona p=new Persona();
        Casa c=new Casa();
        int op;
        System.out.println("***Ingresar");
        System.out.println("Cuantos elementos desea ingresar?");
        int elem = leer.nextInt();
        leer.nextLine();
        
        for(int i = 0; i<elem; i++){
            
            System.out.println("Nombre de la persona");
            String nombre=leer.next();            
            int codPersona=i+1;
            JOptionPane.showMessageDialog(null,"ID Propietario Generada","Codigo Propietario",JOptionPane.INFORMATION_MESSAGE);
            p.setId(codPersona);
            p.setNomApe(nombre);
           
            System.out.println("Nombre de la casa de: "+nombre);
            String NomCasa=leer.next();
            int codCasa=i+1;
            JOptionPane.showMessageDialog(null,"ID Casa Generada","Codigo Casa",JOptionPane.INFORMATION_MESSAGE);
            c.setId(codCasa);
            c.setNombre(NomCasa);
            p.setCasa(c);
            
            dic.agregarElemento(codPersona, p.getNomApe());
            listaLib.agregarElemento(c.getNombre());
        }
       
        op=Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo del propietario", "Eliminar",JOptionPane.NO_OPTION));
        Object elemento=dic.recuperarElemento(op);
        System.out.println(elemento);
        op=Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo del propietario", "Eliminar",JOptionPane.NO_OPTION));
        dic.eliminarElemento(op);
        System.out.println("***Listado de las propietarios ingresados");
        List lista1=dic.recuperarElementos();
        for(int i=0;i<lista1.size();i++){
            System.out.println(lista1.get(i));
        }
        
        
    }
    
}
