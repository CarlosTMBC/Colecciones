
import java.util.*;


public class Main {

    public static void main(String[] args) 
    {
        /*List MiLista =new ArrayList();
        MiLista.add(10);
        MiLista.add(10.5);
        MiLista.add(true);
        MiLista.add("HolaMundo"); 
        System.out.println(MiLista);
        System.out.println("----------- Otra forma de Recorrerlo");
        MiLista.forEach(dato->{
            System.out.println(dato);
        });
           
        System.out.println("----------- Otra forma de Recorrerlo");
        
        for(Object ListaDatos : MiLista){
            System.out.println(ListaDatos);
        }*/
        
    /*HashSet ListaNormal = new HashSet();
    ListaNormal.add("Lunes");
    ListaNormal.add("Martes");
    ListaNormal.add("Miercoles");
    ListaNormal.add("Jueves");
    ListaNormal.add("Viernes");
    ListaNormal.add("Viernes");
    System.out.println(ListaNormal);
    System.out.println("---------------usando Lambda");    
    ListaNormal.forEach(dato->{
        System.out.println(dato);
    });
    ListaNormal.clear();
    System.out.println("---------------imprimir for abreviado"); 
    for(Object MisDatos: ListaNormal)
    {
        System.out.println(MisDatos); 
    }
      */
        
        
        HashMap MiLista = new HashMap();
        MiLista.put(502, "Guatemala");
        MiLista.put(503, "El Salvador");
        MiLista.put(504, "Honduras");
        MiLista.put(505, "Nicaragua");
        MiLista.put(506, "Costa Rica");
        MiLista.put(507, "Panamá");
        
        System.out.println(MiLista);
        MiLista.put(507, "Estados Unidos");
        MiLista.remove(507);
        
        System.out.println(MiLista);
        
        MiLista.forEach((clave,valor)->{
            System.out.println(clave+" "+valor);
        });
        
        
        
        
        
    }
    
    
}
