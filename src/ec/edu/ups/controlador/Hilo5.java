/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.awt.Color;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Andres
 */
public class Hilo5 implements Runnable{
         
    private int kilometro;
    private JLabel cliente;
    private String nombre;
    private int id;
    private JTextArea area;
    private final Random randomico = new Random();
    private String process;
    private int resultado;
    private JLabel resultado1;

    public Hilo5(int kilometro, JLabel cliente, String nombre, int id, JTextArea area, JLabel resultado1) {
        this.kilometro = kilometro;
        this.cliente = cliente;
        this.nombre = nombre;
        this.id = id;
        this.area = area;
        this.resultado1 = resultado1;
    }
    
    

    public Hilo5(int kilometro, JLabel cliente, String nombre) {
        this.kilometro = kilometro;
        this.cliente = cliente;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
        synchronized(this.cliente){
         cambiar();
        }
        
                   }
        }
    
    private void cambiar(){
    cliente.setForeground(Color.red); 
    cliente.setLocation(125, 70);
    process = "Cliente "+ id +": " +"esta depositando 20$"+ "\n";    
    area.append(process);
     try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }   
        resultado = Integer.parseInt(resultado1.getText());
        resultado =resultado+20;
        resultado1.setText(String.valueOf(resultado));
       try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }       
         cliente.setLocation(225, 400);
       cliente.setForeground(Color.black);
    }
    

         

    
}
