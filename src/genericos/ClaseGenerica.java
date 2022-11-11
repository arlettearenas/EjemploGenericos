/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericos;

/**
 *
 * @author Noena
 * @param <T>
 */
public class ClaseGenerica<T>{
     //T es un tipo de dato abstractp que sera reemplazado al momento de usar la clase
    T objeto; //es un objeto de tipo T
    
    
    //Constructor
    public ClaseGenerica(T o){
        this.objeto = o;
    }
    
    public T getObjeto(){
        return this.objeto;
    }
    
    public void setObjeto(T o){
        this.objeto = o;
    }
    
    public void getType(){
        System.out.println("El tipo de efectivo es: " + this.objeto.getClass().getName());
    }
}
