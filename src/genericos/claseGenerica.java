/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericos;

/**
 *
 * @author Berke
 * @param  <T> tipo de dato a parametrizar
 */
public class claseGenerica<T>{
    //T es un tipo de dato abstracto que sera reemplazada al momendo de usar la clase
    T objeto; //objeto es de tipo T
    
    
    //Constructor
    public claseGenerica(T o){
        this.objeto = o;
    }
    public T getObjeto(){
        return this.objeto;
    }
    public void setObjeto(T o){
        this.objeto= o;
    }
    //muestra el tipo de dato efectivo con el que trabaja el objeto de esta clase
    public void getType(){
        System.out.println("El tipo T efectivo es;" + this.objeto.getClass().getName());
    }
}
