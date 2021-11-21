/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static controlador.ControladorMascota.ventana;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Consultas;
import modelo.DB;
import modelo.Mascota;
import modelo.Usuario;
import vista.VistaConsultas;

/**
 *
 * @author lucas
 */
public class ControladorConsultas {
    static VistaConsultas ventana = new VistaConsultas();
    public static void mostrar() throws ParseException{
        ventana.setVisible(true);
        DB db = new DB();
        ArrayList<Consultas> consulta = db.obtenerConsultas();
        DefaultTableModel model = (DefaultTableModel) ventana.getTxtConsultas().getModel();
        model.setNumRows(0);
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
          Date fechaactual = new Date(System.currentTimeMillis() - 86400000);
         System.out.println(fechaactual);
               
         
         for (Consultas consultas : consulta){
            Object[] fila = new Object[5];
            Date fechaInicioDate = date.parse(consultas.getFecha_de_consulta());
            System.out.println(fechaInicioDate);
            if(fechaInicioDate.after(fechaactual)){
            ArrayList<Usuario> us = db.obtenerUsuario();
                for (Usuario u : us) {
                    if(consultas.getUsuario_idUsuarios() == u.getIdusuario()){
                        fila[0] = u.getNombre();
                    }
                    
                }
            ArrayList<Cliente> c = db.obtenerCliente();
                for (Cliente cliente : c) {
                    if(cliente.getIdCliente() == consultas.getCliente_idCliente()){
                        fila[1] = cliente.getNombre();
                        ArrayList<Mascota> m = db.obtenerMascota();
                        for (Mascota mascota : m) {
                            if(mascota.getIdCliente() == cliente.getIdCliente()){
                                fila[4] = mascota.getNombre_mascota();
                            }
                            
                        }
                    }
                }
            fila[2] = consultas.getFecha_de_consulta();
            fila[3] = consultas.getHoraturno();
            model.addRow(fila);
          
        }  
    }
    }
    public static void ocultar(){
        ventana.setVisible(false);
    }
    public static void registrarTurno() throws ParseException{
        String dni = ventana.getTxtDni().getText();
        String fecha = ventana.getTxtFechaTurno().getText();
        String hora = ventana.getTxtHoraTurno().getText();
        String minutos = ventana.getTxtMinuto().getText();
        String Veterinario = ventana.getTxtVeterinario().getText();
        String mascota1 = ventana.getTxtMascota().getText();
        Consultas c = new Consultas();
        String estado_turno = "No atendido";
        int idusuario=0;
        int hora1 = Integer.parseInt(hora);
        if(minutos.equals("")){
            minutos = "00";
        }
        int minutos1 = Integer.parseInt(minutos);
        JOptionPane.showMessageDialog(null, minutos1);
        int bandera3 = 0,bandera5 = 0;
        boolean res;
       res = validarFecha(fecha);
      
        if(res){
            JOptionPane.showMessageDialog(null, "Fecha correcta");
        }else{
            JOptionPane.showMessageDialog(null, "Fecha incorrecta");
        }
        if(hora1 >= 0 && hora1 < 24 && minutos1 == 0 || minutos1 == 30){
            JOptionPane.showMessageDialog(null, "Validado 1");
            bandera3 = 1;
        }else{
            JOptionPane.showMessageDialog(null, "Los turnos se realizan cada 30 minutos !");
        }
//        JOptionPane.showMessageDialog(null, hora1+":"+minutos1);
        int idcliente = 0;
        int idcargo = 2,bandera = 0,bandera1 = 0,bandera2 = 0;
           DB db = new DB();

           ArrayList<Cliente> cliente = db.obtenerCliente();
        for (Cliente cliente1 : cliente) {
            if(dni.equals(cliente1.getDni())){
                idcliente = cliente1.getIdCliente();
                bandera = 1;
                JOptionPane.showMessageDialog(null, "Validacion 2 ");
                String nombrecliente = cliente1.getNombre();
                String apellidocliente = cliente1.getApellido();
            }
        }
  //      JOptionPane.showMessageDialog(null, idcliente);
        ArrayList<Mascota> m = db.obtenerMascota();
        for (Mascota mascota : m) {
            if(idcliente == mascota.getIdCliente() && mascota1.equals(mascota.getNombre_mascota())){
                bandera2 = 1;
                JOptionPane.showMessageDialog(null, "Validacion 3");
            }
        }
        ArrayList<Usuario> us = db.obtenerUsuario();
        for (Usuario u : us) {
            if(Veterinario.equals(u.getNombre()) && idcargo == u.getIdcargo()){
                bandera1 = 1;
                idusuario = u.getIdusuario();
                String nombre = u.getNombre();
                String apellido = u.getApellido();
                JOptionPane.showMessageDialog(null, "Validacion 4");
            }
        }
         ArrayList<Consultas> consulta = db.obtenerConsultas();
     for (Consultas consultas : consulta) {
            if(idusuario == consultas.getUsuario_idUsuarios()){
                String tiempo = consultas.getHoraturno();
               String[] parts = tiempo.split(":");
               String horaconsulta = parts[0];
               int horafinal = Integer.parseInt(horaconsulta);
                String minutoconsulta = parts[1];
                int minutofinal = Integer.parseInt(minutoconsulta);
                JOptionPane.showMessageDialog(null, "Validacion 5");
                JOptionPane.showMessageDialog(null, consultas.getFecha_de_consulta() + fecha + horafinal + hora1 + minutos1 + minutofinal);
                if(consultas.getFecha_de_consulta().equals(fecha) && horafinal == hora1 && minutos1 == minutofinal){
                    bandera5 = 1;
                    JOptionPane.showMessageDialog(null, "Turno ya registrado en ese horario !");
                }
            }
        } 
        JOptionPane.showMessageDialog(null, ""+bandera1+""+bandera2+""+bandera+""+bandera3+""+bandera5);
        if(bandera == 1 && bandera1 == 1 && bandera2 == 1 && bandera3 == 1 && bandera5 == 0){
            JOptionPane.showMessageDialog(null, "Se comparo con exito");
            c.setUsuario_idUsuarios(idusuario);
            c.setCliente_idCliente(idcliente);
            c.setEstado_turno(estado_turno);
            c.setFecha_de_consulta(fecha);
            String horaminuto = hora + ":" + minutos;
            c.setHoraturno(horaminuto);
            db.registrarTurno(c);
            JOptionPane.showMessageDialog(null, "Cliente registrado con exito");
            mostrar();
            
        }else{
            JOptionPane.showMessageDialog(null, "No se detecto");
        }
    }
    
    public static void buscarCliente(){
        int bandera = 1,idcliente = 0;
        String nombrecliente = "",apellidocliente = "";
        String dni = ventana.getTxtDni().getText();
        String mascota1 = "";
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
       ArrayList<Mascota> m = db.obtenerMascota();
        for (Mascota mascota : m) {
            if(idcliente == mascota.getIdCliente() ){
                mascota1 = mascota1 + " " + mascota.getNombre_mascota();
            }
        }
        if(bandera == 0){
            JOptionPane.showMessageDialog(null, "Cliente encontrado ! : \n" + "Su nombre es : " + nombrecliente + "\n Su apellido es : \n" + apellidocliente + " sus mascotas son : "+mascota1);
            
        }else{
            JOptionPane.showMessageDialog(null, "Cliente no encontrado, intente nuevamente !");
        }
            
    }
    public static void validarVeterinario(){
        String veterinario = ventana.getTxtVeterinario().getText();
        String nombre = "";
        String apellido = ""; 
        int idcargo = 2;
        int bandera = 0;
        String veterionarios_disponibles = "";
        DB db = new DB();
        ArrayList<Usuario> us = db.obtenerUsuario();
        for (Usuario u : us) {
            if(veterinario.equals(u.getNombre()) && idcargo == u.getIdcargo()){
                bandera = 1;
                nombre = u.getNombre();
                apellido = u.getApellido();
            }else if(idcargo == u.getIdcargo()){
                veterionarios_disponibles = veterionarios_disponibles + " " + u.getNombre();
                bandera = 2;
            }
        }
        if (bandera == 1){
            JOptionPane.showMessageDialog(null, "Veterinario encontrado "+nombre+" "+apellido);
            
        }else if(bandera == 2){
            JOptionPane.showMessageDialog(null, "Los veterinarios disponibles son : " + veterionarios_disponibles);
        }
    }
   public static boolean validarFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
}

