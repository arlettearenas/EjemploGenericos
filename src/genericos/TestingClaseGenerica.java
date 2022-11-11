/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericos;

/**
 *
 * @author Noena
 */
public class TestingClaseGenerica{
   
    public static void main(String[] args) {
        
     //Declarar un objeto de la clase generica
     ClaseGenerica<String> objeto1;
     ClaseGenerica<Integer> objeto2;
     //Declarar un objeto de la clase generica tipo cancion
     ClaseGenerica<Cancion> objeto3;
     
     //construir el objeto1
     objeto1 = new ClaseGenerica<>("Ginger");
        System.out.println("El contenido del objeto1 es : " + objeto1.getObjeto());
        System.out.println("El tipo de dato de objeto1 es: ");
        objeto1.getType();
        
    //construir y usar el objeto2
    objeto2 = new ClaseGenerica<Integer>(100);
        System.out.println("El contenido del objeto 2 es: " + objeto2.getObjeto());
        objeto2.getType();
        
        //construir el tipo cancion
        Cancion unaCancion = new Cancion("In the end", "Linkin Park");
        objeto3 = new ClaseGenerica<>(unaCancion);
        System.out.println("El contenido del objeto3 es : " + objeto3.getObjeto());
        objeto3.getType();
        
        //Recuperando el contenido del objeto3 (que tambien es un objeto)
        Cancion otroObjeto = objeto3.getObjeto();
        System.out.println("Informacion de otro objeto");
        System.out.println(otroObjeto.getNombre() + "" + otroObjeto.getInterprete());
    }
}
