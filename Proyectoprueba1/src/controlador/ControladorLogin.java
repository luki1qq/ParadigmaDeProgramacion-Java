/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.DB;
import modelo.Usuario;
import vista.VistaLogin;

/**
 *
 * @author lucas
 */
public class ControladorLogin {
    static VistaLogin ventana = new VistaLogin();
    public static void mostrar(){
        ventana.setVisible(true);
    }
    public static void ocultar(){
        ventana.setVisible(false);
    }
    public static void botonIniciarSesion(){ // Estos serán los que van a manejar el evento de la ventana
        int bandera = 0;
        String usuario = ventana.getTxtUsuario().getText(); // Pedir un meotod getter en ventana para poder utilizarlo
        String contrasena = ventana.getTxtContrasena().getText();
        int administrador = 3;
        int secretario = 1;
        int veterinario = 2;
        String nombre_veterinario = "";
        DB db = new DB();
        ArrayList<Usuario> us =  db.obtenerUsuario();
        // El model tendrá los datos que muestra la grilla
        for (Usuario u : us) {
            if(usuario.equals(u.getUsuario()) && contrasena.equals(u.getContrasena()) && secretario == u.getIdcargo()){
                bandera = 1;
            }else if(usuario.equals(u.getUsuario()) && contrasena.equals(u.getContrasena()) && administrador == u.getIdcargo()){
                bandera = 2;
            }else if (usuario.equals(u.getUsuario()) && contrasena.equals(u.getContrasena()) && veterinario == u.getIdcargo()){
                bandera = 3;
                nombre_veterinario = u.getNombre();
            }
        }
        if(bandera == 1){
            JOptionPane.showMessageDialog(null, "Ingreso correctamente ! ");
            JOptionPane.showMessageDialog(null, "Ingreso secretario");
            ControladorSecretario.mostrar();
        }else if(bandera == 2){
            JOptionPane.showMessageDialog(null, "Ingreso correctamente");
            JOptionPane.showMessageDialog(null, "ingreso administrador");
            ControladorAdmin.mostrar();
        }
        else if(bandera ==3){
            JOptionPane.showMessageDialog(null, "Ingreso correctamente");
            JOptionPane.showMessageDialog(null, "Ingreso Veterinario");
            ControladorVeterinario.mostrar(nombre_veterinario);
        }else{
            JOptionPane.showMessageDialog(null, "No ingreso correctamente");
        }
      /* if(usuario.equals("lucassasd") && contrasena.equals("Lukev_156299502?")){
           JOptionPane.showMessageDialog(null,"Ingreso correctamente !");
           ocultar();
       }else{
           JOptionPane.showMessageDialog(null,"Usuario o clave incorrecto !");
       }
    }*/
    }
}
