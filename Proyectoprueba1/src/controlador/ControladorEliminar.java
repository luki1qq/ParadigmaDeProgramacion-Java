/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import modelo.DB;
import vista.VistaEliminar;

/**
 *
 * @author lucas
 */
public class ControladorEliminar {
    static VistaEliminar ventana = new VistaEliminar();
    public static void mostrar(){
        ventana.setVisible(true);
    }
    public static void ocultar(){
        ventana.setVisible(false);
    }
    public static void botonEliminar(){
        int idusuario = Integer.parseInt(ventana.getTxtEliminar().getText());
        DB db = new DB();
        db.eliminarUsuario(idusuario);
        JOptionPane.showMessageDialog(null, "Usuario eliminado con exito !");
        ocultar();
        ControladorAdmin.mostrar();
    }
}
