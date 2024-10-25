/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.calcularlaedad;
import java.util.Scanner
public class Calcularlaedad {

    public static void main(String[] args) {
        
        Scanner e=new Scsnner (source: System.in )
        
        System.out.println("Ingresa tu edad");
        int edad= e.nextInt();
        if(edad>=0  && edad<120){
            //Categoriza la persona
           if(edad>0  && edad>12){
               System.out.println("Eres un niño");
           }else if (eada>=13  && edad <=35){
               System.out.println("Eres un joven");
           }else{
               System.out.println("Eres un adulto");
   
        }
        }else{
            System.out.println("ERROR!");
       
    }
}
