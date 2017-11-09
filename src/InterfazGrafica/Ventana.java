/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;
//PASO 1 - IMPORTAR
import javax.swing.*;//Librerìa gràfica estandar multiplataforma
import java.awt.*;//Libreria gràfica del Sistema Operativo

/**
 *
 * @author LAB03
 */
//PASO 2 - HEREDAR MI CLASE DESDE JFRAME
public class  Ventana extends JFrame
{
    //PASO 3 - DECLARAR LOS ELEMENTOS QUE VAMOS A UTILIZAR
    JPanel panel;//Creacion de objeto JPanel
    JLabel label;
    JTextField text;
    JButton boton;
    JCheckBox check;
    JRadioButton radio;
    
     //PASO 4 - DEFINICION DEL CONSTRUCTOR DE LA CLASE
    public Ventana()
    {
    //PASO 5 - CREAR E INICIALIZAR LOS OBJETOS
    panel = new JPanel();//Creamos el objeto
    label = new JLabel();
    text = new JTextField(25);//25 son los caracteres
    boton = new JButton();
    check = new JCheckBox();
    radio = new JRadioButton();
    
     //PASO 6 - AGREGAR LOS ELEMENTOS AL JFRAME
        this.add(panel);//Agrego el JPanel al JFrame
        panel.add(label);//Agrego los elementos al JPanel
        panel.add(text);
        panel.add(boton);
        panel.add(check);
        panel.add(radio);
        
         //PASO 7 - PROPIEDADES DE LOS ELEMENTOS
        label.setText("Nombre");
        boton.setText("Enviar");
        panel.setBackground(Color.yellow);//COLOR DE FONDO DEL PANEL
    
    }
}
