/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.DB;
import modelo.Usuario;
import vista.VistaAdmin;

/**
 *
 * @author lucas
 */
public class ControladorAdmin {
    static VistaAdmin ventana = new VistaAdmin();
    public static void mostrar(){
        ventana.setVisible(true);
        DB db = new DB();
        ArrayList<Usuario> us =  db.obtenerUsuario();
        DefaultTableModel model = (DefaultTableModel) ventana.getTxtEmpleados().getModel();
        // El model tendrá los datos que muestra la grilla
        model.setNumRows(0);
        for (Usuario u : us) {
            Object[] fila = new Object[5];
            fila[0] = u.getIdusuario();
            fila[1] = u.getNombre();
            fila[2] = u.getApellido();
            fila[3] = u.getUsuario();
            fila[4] = u.getIdcargo();
            model.addRow(fila);
        }
    }
    
    public static void botonAgregarUsuario(){
        int cargo_num = 0;
        String nombre = ventana.getAdminNombre().getText();
        String apellido = ventana.getAdminApellido().getText();
        String usuario = ventana.getAdminUsuario().getText();
        String contrasena = ventana.getAdminContrasena().getText();
        String cargo = ventana.getCargoComboBox().getSelectedItem().toString();
        //int idusuario = Integer.parseInt(ventana.getAdminIdusuario().getText());
        Usuario u = new Usuario();
        u.setNombre(nombre);
        u.setApellido(apellido);
        u.setUsuario(usuario);
        u.setContrasena(contrasena);
        if(cargo.equals("secretario")){
          cargo_num = 1;   
        }else if(cargo.equals("administrador")){
            cargo_num = 3;
        }else if(cargo.equals("veterinario")){
            cargo_num = 2;
        }
        /*
        secretario
veterinario
administrador
        */
        u.setIdcargo(cargo_num);
        DB db = new DB();
        db.agregarUsuario(u);
        mostrar();
        ventana.getAdminNombre().setText("");
        ventana.getAdminApellido().setText("");
        ventana.getAdminUsuario().setText("");
        ventana.getAdminContrasena().setText("");
    }
    public static void botonEliminar(){
        
    }
}
