/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
/**
 *NewClass
 * @author adrian
 */
public class Saludos extends JPanel implements ActionListener{
    private JButton botonNombre;
    private JTextArea texto;
    private JButton botonApellido;    
    
    public Saludos(){
            initComponents();
    }
    
    public Saludos(Color color){
           initComponents();
        cambiarColorFondo(color);
    }
    
    public JButton getBotonNombre() {
            return botonNombre;
    }
    
    public JButton getBotonApellido() {
            return botonApellido;
    }
    
    private void cambiarColorFondo(Color color){
        // Establece el color de fondo del panel
            this.setBackground(color);
    }
        private void initComponents(){
        
        botonNombre = new JButton("Nombre");
        botonApellido = new JButton("Apellidos");
        texto = new JTextArea(1,25);
        texto.setBackground(Color.cyan);
        
        this.setLayout(new FlowLayout());
        
        this.add(botonNombre);
        this.add(texto);
        // Añadimos el botón al panel
        this.add(botonApellido);
        // Controlador del evento
        botonApellido.addActionListener(this);

        botonNombre.addActionListener(this);
    }
        
    @Override
    public void actionPerformed(ActionEvent ae) {

            // Si el botón pulsado es botonSaludar
        if(ae.getSource() == botonNombre){
            texto.setText("Adrian");
        } else { 
            texto.setText("Vallejo Robles");
        }
    }    
}
