/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo1.estructurascontrol;

/**
 *
 * @author LENOVO
 */
//Import que permite usar GUI
import javax.swing.JOptionPane;
public class ControlIf2 {
    public static void main(String[] args) {
         //Variable string vacia
        String v1 = "";
        //Por medio de un cuadro de dialogo se pide al usuario 
        //Escribir un valor y quedara guardado en v1
        v1=JOptionPane.showInputDialog("Ingrese un valor");
        
        //Si la variable es nula es porque el usuario apreto el boton cancelar
        if(v1 == null)
        {
            JOptionPane.showMessageDialog(null,"Apretaste cancelar");
        }
        //Si no apreto el boton cancelar entonces...
        else{
            //Si la variable esta vacia entonces que imprima el siguiente mensaje
            if(v1.equals(""))
            {
                JOptionPane.showMessageDialog(null, "No ingresaste nada");
            }
            //Si no el usuario digito un numero diferente de 0
            else{
                JOptionPane.showMessageDialog(null, "El valor de V1 es: " +v1);
            }
        }
    
    }
}
