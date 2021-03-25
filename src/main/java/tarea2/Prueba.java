/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import javax.swing.JFrame;

/**
 *
 * @author adrian
 */
public class Prueba {
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        
        frame.setLocationRelativeTo(null);
        
        // Para que no se pueda redimensionar
        frame.setResizable(false);
        
        frame.add(new Saludos());
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
}
