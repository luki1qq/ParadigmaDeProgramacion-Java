/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DB;
import modelo.Veterinario;
import vista.VistaVeterinario;

/**
 *
 * @author lucas
 */
public class ControladorVeterinario {
    static VistaVeterinario ventana = new VistaVeterinario();
    public static void mostrar(String nombre){
        ventana.setVisible(true);
        DB db = new DB();
        ArrayList<Veterinario> vet =  db.obtenerPacientes();
        DefaultTableModel model = (DefaultTableModel) ventana.getTxtTabla().getModel();
        // El model tendrá los datos que muestra la grilla
        model.setNumRows(0);
        for (Veterinario veterinario : vet) {
            Object[] fila = new Object[6];
            if(nombre.equals(veterinario.getVeterinario()) && "no atendido".equals(veterinario.getEstado_del_turno())){
                fila[0] = veterinario.getNombre();
                fila[1] = veterinario.getApellido();
                fila[2] = veterinario.getNombre_mascota();
                fila[3] = veterinario.getFecha_del_turno();
                fila[4] = veterinario.getHora_del_turno(); 
                fila[5] = veterinario.getAnimal();
            }

            model.addRow(fila);
        }
    }
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void botonAtendido(){
        String historiaClinica = ventana.getTxtHistoriaClinica().getText();
        String duenomascota = ventana.getTxtDueno().getText();
        String apellidodueno = ventana.getTxtDuenoApellido().getText();
        DB db = new DB();
        int bandera = 0;
        ArrayList<Veterinario> us =  db.obtenerPacientes();
         Veterinario v = new Veterinario();
        // El model tendrá los datos que muestra la grilla
        for (Veterinario u : us) {
            if(duenomascota.equals(u.getNombre()) && apellidodueno.equals(u.getApellido())){
                bandera = 1;
                v.setHistoria_clinica(historiaClinica);
                db.usuarioAtendido(historiaClinica,duenomascota,apellidodueno);
            }else{
                System.out.println("");
            }
        }
        //falta boton atendido xdxd
        if(bandera == 1){
                   JOptionPane.showMessageDialog(null, "Atendido pa");
        }else{
            JOptionPane.showMessageDialog(null, "No atendido pa");
        }
        
       ventana.getTxtHistoriaClinica().setText("");
       ventana.getTxtDueno().setText("");
       ventana.getTxtDuenoApellido().setText("");
    }
    
}
