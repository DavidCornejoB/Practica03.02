package practica03_02;

import Clases.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
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
        System.out.println("***Ingresar");
        System.out.println("Cuantos elementos desea ingresar?");
        int elem = leer.nextInt();
        for(int i = 0; i<elem; i++){
            System.out.println("Nombre de la persona");
            String nombre=leer.next();
            
            System.out.println("Codigo generado");
            int codPersona=i+1;
            System.out.println("Nombre de la casa");
            String casa=leer.next();
            int codCasa=i+1;
        }
        int op;
        
        System.out.println("*** Codigo de la persona a recuperar");
        op=leer.nextInt();
        Object elemento=dic.recuperarElemento(op);
        System.out.println(elemento);
        System.out.println("***Codigo de la persona a eliminar");
        op=leer.nextInt();
        dic.eliminarElemento(op);
        System.out.println("***Listado de las personas ingresadas");
        List lista1=dic.recuperarElementos();
        for(int i=0;i<lista1.size();i++){
            System.out.println(lista1.get(i));
        }
        
        
    }
    
}
