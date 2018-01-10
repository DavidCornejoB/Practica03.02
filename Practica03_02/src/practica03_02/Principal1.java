package practica03_02;

import Clases.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Principal1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Map<Integer,String>mapa=new HashMap<>();
        Diccionario dic=new Diccionario(mapa);
        
        System.out.println("Cuantos elementos desea ingresar?");
        int elem = leer.nextInt();
        
        for(int i = 0; i<elem; i++){
            System.out.println("Agregar elemento " + (i+1));
            leer.nextLine();
            dic.agregarElemento(i+1, leer.next());    
        }
        
        Object elemento=dic.recuperarElemento(1);
        System.out.println(elemento);
        
        dic.eliminarElemento(1);
        
        List lista=dic.recuperarElementos();
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
    }
    
}
