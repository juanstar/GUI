//Nombre: Juan López Estrella
//Matricula: 2023114
package GUI;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author j_sta
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setTitle("Cesba Ventana ");
        
        frame.setResizable(true);
        
        //FORMATO DEFAULT
        //frame.getContentPane().setBackground(Color.DARK_GRAY);
        
        //FORMATO RGB
        //frame.getContentPane().setBackground(new Color(162, 51, 255));
        
        //FORMATO HEXADECIMAL
        frame.getContentPane().setBackground(new Color(0xAADE98));
        
    }
}
