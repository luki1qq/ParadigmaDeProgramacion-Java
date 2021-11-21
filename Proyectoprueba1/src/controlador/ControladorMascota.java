/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.DB;
import modelo.Mascota;
import vista.VistaMascota;

public class ControladorMascota {
    static VistaMascota ventana = new VistaMascota();
    public static void mostrar(){
        ventana.setVisible(true);
    }
    public static void mostrar2(String dni){
        ventana.setVisible(true);
        ventana.getjLabel1().setVisible(false);
        ventana.getTxtCliente().setVisible(false);
        ventana.getTxtDNI().setVisible(false);
        ventana.getTxtDNI().setText(dni);
        
    }
    public static void ocultar(){
        ventana.setVisible(false);
    }
    public static void registrarMascota(){
        String dni = ventana.getTxtDNI().getText();
        String nombre_mascota = ventana.getTxtNombre_mascota().getText();
        String peso = ventana.getTxtPeso().getText();
        String animal = ventana.getTxtAnimal().getText();
        int idcliente = 0;
        int bandera = 0;
        Mascota m = new Mascota();
        DB db = new DB();
        JOptionPane.showMessageDialog(null, dni);
        ArrayList<Cliente> cliente = db.obtenerCliente();
        for (Cliente cliente1 : cliente) {
            if(dni.equals(cliente1.getDni())){
                idcliente = cliente1.getIdCliente();
                bandera = 1;
            }else{
                bandera = 0;
            }
        }
        if(bandera == 0){
            JOptionPane.showMessageDialog(null,"Cliente no encontrado, Ingresar nuevamente.");
        }
        m.setIdCliente(idcliente);
        m.setAnimal(animal);
        m.setNombre_mascota(nombre_mascota);
        m.setPeso(peso);
        db.agregarMascota(m);
        JOptionPane.showMessageDialog(null, "Animal registrado con exito !");
    }
    public static void buscarCliente(){
        int bandera = 1,idcliente = 0;
        String nombrecliente = "",apellidocliente = "";
        String dni = ventana.getTxtDNI().getText();
        Mascota m = new Mascota();
        DB db = new DB();
          ArrayList<Cliente> cliente = db.obtenerCliente();
        for (Cliente cliente1 : cliente) {
            if(dni.equals(cliente1.getDni())){
                idcliente = cliente1.getIdCliente();
                bandera = 0;
                nombrecliente = cliente1.getNombre();
                apellidocliente = cliente1.getApellido();
            }
        }
        if(bandera == 0){
            JOptionPane.showMessageDialog(null, "Cliente encontrado ! : \n" + "Su nombre es : " + nombrecliente + "\n Su apellido es : " + apellidocliente );
            
        }else{
            JOptionPane.showMessageDialog(null, "Cliente no encontrado, intente nuevamente !");
        }
            
    }
}
