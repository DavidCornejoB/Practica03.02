package practica03_02;

import Clases.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal1 {

    public static void main(String[] args) {
        Map<Integer,String>mapa=new HashMap<>();
        Diccionario dic=new Diccionario(mapa);
        
        dic.agregarElemento(1, "Stalin Figueroa");
        dic.agregarElemento(2, "Paul Carrasco");
        dic.agregarElemento(2, "David Cornejo");
        dic.agregarElemento(2, "Fransua Cordovez");
        
        Object elemento=dic.recuperarElemento(1);
        System.out.println(elemento);
        
        dic.eliminarElemento(1);
        
        List lista=dic.recuperarElementos();
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
    }
    
}
