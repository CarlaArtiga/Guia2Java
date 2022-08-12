/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package guia1poo1.estructurascontrol;

/**
 *
 * @author LENOVO
 */
import java.util.*;
public class EstructurasControl {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //Variables
        int Var1,Var2;
        
        //Escritura y lectura de datos de primer numero
        System.out.println("Ingrese numero1: ");
        Var1=reader.nextInt();
        
        //Escritura y lectura de datos de segundo numero
        System.out.println("Ingrese numero2: ");
        Var2 = reader.nextInt();
        
        if(Var1==Var2){
            System.out.print("Los numeros ingresados son iguales");
            
        }
        else{
            System.out.println("Los numeros ingresados no son iguales");
        }
    }
}
