/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Andres
 */
public class Cliente implements Runnable {
    private int id;
    private int resultado;
    private Thread t;
    private JLabel cliente;
    private JLabel derecha;
    private JLabel izquierda;
    private JLabel resultado1;
    private String process;
    private JTextArea area;

    public Cliente(int id, JLabel derecha, JLabel izquierda, JLabel Cliente, JLabel resultado1, JTextArea area) {
        this.id = id; 
        this.cliente = Cliente;
        this.derecha = derecha;
        this.izquierda = izquierda;
        this.resultado1 = resultado1;      
        this.area = area;
        t= new Thread(this);
        t.start();
    }

    @Override
    public void run() {
       for (int i = 0; i < 4; i++) { // se controla el numero de veces que van a comer
            synchronized (this.izquierda) {
                synchronized (this.derecha) {
                ingresa();   
                }

            }
        
        } 
    }
private void ingresa(){
izquierda.setText("Depositando");
izquierda.setForeground(Color.red);
resultado = Integer.parseInt(resultado1.getText());
        resultado += 100;
        resultado1.setText(String.valueOf(resultado));
        process = "Cliente " + (id + 1) + ": " + "Esta depositando\n";
        area.append(process);
try {
            Thread.sleep(10);
        } catch (InterruptedException e) {

        }
izquierda.setText("Sale");
izquierda.setForeground(Color.black);

process = "Cliente" + (id + 1) + ": " + "Esta saliendo\n";
        area.append(process);
}
    
}
