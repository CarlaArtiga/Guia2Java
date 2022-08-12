/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo1.estructurascontrol;

/**
 *
 * @author LENOVO
 */
import javax.swing.JOptionPane;
public class Controlif3 {
    public static void main(String[] args) {
       
        //Variable
        int result = JOptionPane.showConfirmDialog(null,"Replace existing selection? ");
        System.out.println("El numero devuelto es: "+result);
        
        if(result == JOptionPane.YES_OPTION){
            System.out.println("Yes");
        }
        else if(result == JOptionPane.NO_OPTION){
                System.out.println("No");
            }
        else if(result == JOptionPane.CANCEL_OPTION){
                System.out.println("Cancel");
        }
        else if (result == JOptionPane.CLOSED_OPTION){
                 System.out.println("Closed");
        }
    }
}
