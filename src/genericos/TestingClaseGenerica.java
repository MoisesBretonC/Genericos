/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericos;

/**
 *Clase que crea y utiliza objetos tipo ClaseGenerica
 * @author Berke
 */
public class TestingClaseGenerica {
    public static void  main(String[]args){
        
       //Declarar un objeto de la clase generica
       claseGenerica <String> objeto1;
       
       //construir el objeto1
       objeto1 = new claseGenerica<>("Ginger");
        System.out.println("El contenido del obejto1 es:" + objeto1.getObjeto().toString());
        System.out.println("El tipo de dato del objeto1 es:");
         objeto1.getType();
}
}