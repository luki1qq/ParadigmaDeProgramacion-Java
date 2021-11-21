/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class DB {
    Connection conexion;
    String cadenaConexion = "jdbc:mysql://localhost/mydb?serverTimezone=UTC";
    String usuario = "root";
    String clave = "root";
    public DB(){
        try{
            conexion = DriverManager.getConnection(cadenaConexion,usuario,clave);
            System.out.println("conexion exitosa");
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public void registrarTurno(Consultas c){
         try{
            PreparedStatement s = conexion.prepareStatement(
                    "INSERT into Consultas (Usuarios_idUsuarios,Cliente_idCliente,Fecha_de_consulta,horaturno,estado_turno) values (?,?,?,?,?)"
            );
            s.setInt(1, c.getUsuario_idUsuarios());
            s.setInt(2, c.getCliente_idCliente());
            s.setString(3, c.getFecha_de_consulta());
            s.setString(4, c.getHoraturno());
            s.setString(5, c.getEstado_turno());
            s.executeUpdate();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void solicitarTurno(Veterinario vet){
        try{
            PreparedStatement s = conexion.prepareStatement(
                    "INSERT into paciente (nombre,apellido,dni,nombre_mascota,Animal,telefono,veterinario,fecha_del_turno,hora_del_turno,estado_del_turno,historia_clinica) values (?,?,?,?,?,?,?,?,?,'no atendido', '');"
            );
            s.setString(1, vet.getNombre());
            s.setString(2, vet.getApellido());
            s.setString(3, vet.getDni());
            s.setString(4, vet.getNombre_mascota());
            s.setString(5, vet.getAnimal());
            s.setString(6, vet.getTelefono());
            s.setString(7, vet.getVeterinario());
            s.setString(8, vet.getFecha_del_turno());
            s.setString(9, vet.getHora_del_turno());
            s.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void usuarioAtendido(String historiaclincia,String nombre_dueno,String apellido_dueno){
        try{
            PreparedStatement s = conexion.prepareStatement(
                "UPDATE paciente SET historia_clinica = ? , estado_del_turno = 'Atendido' where nombre = ? and apellido = ?"
             );
                s.setString(1, historiaclincia);
                s.setString(2, nombre_dueno);
                s.setString(3, apellido_dueno);
                s.executeUpdate();
                JOptionPane.showMessageDialog(null, "A");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void agregarMascota(Mascota m){
        try{
            PreparedStatement s = conexion.prepareStatement(
                    "INSERT INTO Mascota (idCliente,nombre_mascota,peso, animal,hora_del_turno, estado_del_turno, historia_clinica) values (?,?,?,?,?,?,?)"
            );
            s.setInt(1, m.getIdCliente());
            s.setString(2, m.getNombre_mascota());
            s.setString(3, m.getPeso());
            s.setString(4, m.getAnimal());
            s.setString(5, "");
            s.setString(6, "No atendido");
            s.setString(7, "");
            s.executeUpdate();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void agregarUsuario(Usuario us){
        try{
            PreparedStatement s = conexion.prepareStatement(
                    "INSERT into Usuarios (nombre,apellido,usuario,contraseña,idcargo) values (?,?,?,?,?)"
            );
            s.setString(1, us.getNombre());
            s.setString(2, us.getApellido());
            s.setString(3, us.getUsuario());
            s.setString(4, us.getContrasena());
            s.setInt(5, us.getIdcargo());
            s.executeUpdate();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void agregarCliente(Cliente c){
        try{
            PreparedStatement s = conexion.prepareStatement(
                    "INSERT INTO Cliente (nombre,apellido,dni,telefono,correo) values (?,?,?,?,?)"
            );
            s.setString(1, c.getNombre());
            s.setString(2, c.getApellido());
            s.setString(3, c.getDni());
            s.setString(4, c.getTelefono());
            s.setString(5, c.getCorreo());
            s.executeUpdate();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public ArrayList<Consultas> obtenerConsultas(){
        ArrayList<Consultas> obtener = new ArrayList<>();
        try{
            Statement s = conexion.createStatement();
            ResultSet res = s.executeQuery("SELECT * from Consultas");
            while(res.next()){
                Consultas c = new Consultas(
                        res.getInt("idConsulta"),
                        res.getInt("Usuarios_idUsuarios"),
                        res.getInt("Cliente_idCliente"),
                        res.getString("Fecha_de_consulta"),
                        res.getString("horaturno"),
                        res.getString("estado_turno")
                );
                obtener.add(c);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return obtener;
    }
    public ArrayList<Cliente> obtenerCliente(){
        ArrayList<Cliente> obtener = new ArrayList<>();
                try{
            Statement s = conexion.createStatement();
            ResultSet res = s.executeQuery("Select * from Cliente ");
            while(res.next()){
                Cliente c = new Cliente(
                        res.getInt("idCliente"),
                        res.getString("nombre"),
                        res.getString("apellido"),
                        res.getString("dni"),
                        res.getString("telefono"),
                        res.getString("direccion"),
                        res.getString("correo")
                
                );
               obtener.add(c);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        return obtener;
    }
    public ArrayList<Usuario> obtenerUsuario(){
        ArrayList<Usuario> login = new ArrayList<>();
        try{
            Statement s = conexion.createStatement();
            ResultSet res = s.executeQuery("Select * from usuarios ");
            while(res.next()){
                Usuario us = new Usuario(
                        res.getString("nombre"),
                        res.getString("apellido"),
                        res.getString("usuario"),
                        res.getString("contraseña"),
                        res.getInt("idUsuarios"),
                        res.getInt("idcargo")
                
                );
               login.add(us);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        return login;
    }
    public ArrayList<Veterinario> obtenerPacientes(){
        ArrayList<Veterinario> obtener = new ArrayList<>();
        try{
            Statement s = conexion.createStatement();
            ResultSet res = s.executeQuery("Select * from paciente");
            while(res.next()){
                Veterinario v = new Veterinario(
                        res.getString("nombre"),
                        res.getString("apellido"),
                        res.getString("dni"),
                        res.getString("nombre_mascota"),
                        res.getString("Animal"),
                        res.getString("telefono"),
                        res.getString("fecha_del_turno"),
                        res.getString("hora_del_turno"),
                        res.getString("estado_del_turno"),
                        res.getString("historia_clinica"),
                        res.getString("veterinario")
                );
                obtener.add(v);
                
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return obtener;
    }
    public ArrayList<Mascota> obtenerMascota(){
        ArrayList<Mascota> obtener = new ArrayList<>();
        try{
            Statement s = conexion.createStatement();
            ResultSet res = s.executeQuery("SELECT * from Mascota");
            while(res.next()){
                Mascota m = new Mascota(
                        res.getInt("idMascota"),
                        res.getInt("idCliente"),
                        res.getString("nombre_mascota"),
                        res.getString("peso"),
                        res.getString("animal"),
                        res.getString("hora_del_turno"),
                        res.getString("estado_del_turno"),
                        res.getString("historia_clinica")
                ); 
               obtener.add(m);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return obtener;
    }
    public void eliminarUsuario(int idusuario){
        Statement s;
        try{
            s = conexion.createStatement();
            s.executeUpdate("DELETE FROM Usuarios where idUsuarios = "+ idusuario);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
