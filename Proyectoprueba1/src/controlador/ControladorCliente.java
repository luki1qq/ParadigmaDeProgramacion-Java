/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.DB;
import vista.VistaCliente;

/**
 *
 * @author lucas
 */
public class ControladorCliente {
    static VistaCliente ventana = new VistaCliente();
    public static void mostrar(){
        ventana.setVisible(true);
    }
    public static void ocultar(){
        ventana.setVisible(false);
    }
    public static void registarCliente(){
        String nombre = ventana.getTxtNombre().getText();
        String apellido = ventana.getTxtApellido().getText();
        String dni = ventana.getTxtDni().getText();
        String telefono = ventana.getTxtTelefono().getText();
        String correo = ventana.getTxtCorreo().getText();
        Cliente c = new Cliente();
        DB db = new DB();
        c.setNombre(nombre);
        c.setApellido(apellido);
        c.setDni(dni);
        c.setTelefono(telefono);
        c.setCorreo(correo);
        db.agregarCliente(c);
        JOptionPane.showMessageDialog(null, "Cliente registrado con exito");
        ocultar();
        ControladorMascota.mostrar2(dni);
    }
}
