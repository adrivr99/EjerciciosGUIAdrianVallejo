/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author adrian
 */
public class Prueba {
    public static void main(String[] args) {
        // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame ("Adrián Vallejo");

        // Establecemos tamaño y posición
        ventanaPrincipal.setSize(500, 500);
        
        ventanaPrincipal.setLocationRelativeTo(null);
        
        // Para que no se pueda redimensionar
        ventanaPrincipal.setResizable(false);

        // Añadimos un objeto MiPanel al JFrame
        //ventanaPrincipal.add(new Ej1(Color.cyan));

        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        // Acción por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        // Añadimos los paneles en cada posición del BorderLayout

        // Añadir panel amarillo en la posición superior (NORTH)
        ventanaPrincipal.add(new Arriba(Color.orange), BorderLayout.NORTH);

        // Añadir panel rojo en la posición inferior (SOUTH)
        ventanaPrincipal.add(new Abajo(Color.pink), BorderLayout.SOUTH);

        // Añadir panel gris en la posición central (CENTER)
        ventanaPrincipal.add(new Centro(Color.LIGHT_GRAY), BorderLayout.CENTER);

        // Añadir panel verde en la posición izquierda (WEST)
        ventanaPrincipal.add(new Izquierda(Color.green), BorderLayout.WEST);

        // Añadir panel cián en la posición derecha (EAST)
        ventanaPrincipal.add(new Derecha(Color.red), BorderLayout.EAST);

    }  
}
