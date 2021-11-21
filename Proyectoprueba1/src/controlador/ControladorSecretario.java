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
import modelo.Veterinario;
import vista.VistaSecretario;

/**
 *
 * @author lucas
 */
public class ControladorSecretario {
    static VistaSecretario ventana = new VistaSecretario();
    public static void mostrar(){
        ventana.setVisible(true);
    }
    public static void ocultar(){
        ventana.setVisible(false);
    }
    public static void registrarTurno(){
        String nombre = ventana.getTxtNombre().getText();
        String apellido = ventana.getTxtApellido().getText();
        String dni = ventana.getTxtDni().getText();
        String correo = ventana.getTxtCorreo().getText();
        String telefono = ventana.getTxtTelefono().getText();
        String nombre_mascota = ventana.getTxtNombreMascota().getText();
        String Animal = ventana.getTxtTipoAnimal().getText();
        String veterinario = ventana.getTxtVeterinario().getText();
        String Fecha = ventana.getTxtFecha().getText();
        String hora = ventana.getTxtHora().getText();
        Veterinario v = new Veterinario();
    //    INSERT into paciente (nombre,apellido,dni,nombre_mascota,Animal,telefono,veterinario,fecha_del_turno,hora_del_turno,estado_del_turno,historia_clinica) values ('lucas','juarez','43845723','pedrito','perro','3816410281','bovi','08/11/2021','22:00','no atendido', '');

        DB db = new DB();
        ArrayList<Usuario> us =  db.obtenerUsuario();
        int bandera = 0;
        for (Usuario u : us) {
            if(veterinario.equals(u.getNombre()) && u.getIdcargo() == 2){
                bandera = 1;
            }else{
                bandera = 2;
            }


        }
        if(bandera == 1){
            v.setNombre(nombre);
            v.setApellido(apellido);
            v.setDni(dni);
            v.setNombre_mascota(nombre_mascota);
            v.setTelefono(telefono);
            v.setAnimal(Animal);
            v.setVeterinario(veterinario);
            v.setFecha_del_turno(Fecha);
            v.setHora_del_turno(hora);
            db.solicitarTurno(v);
            JOptionPane.showMessageDialog(null, "Turno solicitado con exito !");
        }else if(bandera == 2){
            JOptionPane.showMessageDialog(null,"El veterinario no existe !");
        }
        mostrar();
    }
    public static void borrarTurno(){
        
    }
}
