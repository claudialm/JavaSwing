/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;
//PASO 8 - IMPORTAR LA CLASE CON LA VENTANA
import InterfazGrafica.Ventana;
import javax.swing.JFrame;

/**
 *
 * @author LAB03
 */
public class JavaSwing 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        //PASO 9 - LLAMADO A LA CLASE
                Ventana ventana = new Ventana();//CREO UN OBJETO TIPO WINDOW
                ventana.setVisible(true);
                ventana.setBounds(0, 0, 600, 800);
                ventana.setTitle("mi primer interfaz grafica");
                //La siguiente sentencia es para finalizar
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    
    
    }
    
}
