/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author lucas
 */
public class Veterinario {
    String nombre;
    String apellido;
    String dni;
    String nombre_mascota;
    String Animal;
    String telefono;
    String fecha_del_turno;
    String hora_del_turno;
    String estado_del_turno;
    String historia_clinica;
    String veterinario;

    @Override
    public String toString() {
        return "Veterinario{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", nombre_mascota=" + nombre_mascota + ", Animal=" + Animal + ", telefono=" + telefono + ", fecha_del_turno=" + fecha_del_turno + ", hora_del_turno=" + hora_del_turno + ", estado_del_turno=" + estado_del_turno + ", historia_clinica=" + historia_clinica + ", veterinario=" + veterinario + '}';
    }

    public Veterinario(String nombre, String apellido, String dni, String nombre_mascota, String Animal, String telefono, String fecha_del_turno, String hora_del_turno, String estado_del_turno, String historia_clinica, String veterinario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nombre_mascota = nombre_mascota;
        this.Animal = Animal;
        this.telefono = telefono;
        this.fecha_del_turno = fecha_del_turno;
        this.hora_del_turno = hora_del_turno;
        this.estado_del_turno = estado_del_turno;
        this.historia_clinica = historia_clinica;
        this.veterinario = veterinario;
    }

    public Veterinario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public String getAnimal() {
        return Animal;
    }

    public void setAnimal(String Animal) {
        this.Animal = Animal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha_del_turno() {
        return fecha_del_turno;
    }

    public void setFecha_del_turno(String fecha_del_turno) {
        this.fecha_del_turno = fecha_del_turno;
    }

    public String getHora_del_turno() {
        return hora_del_turno;
    }

    public void setHora_del_turno(String hora_del_turno) {
        this.hora_del_turno = hora_del_turno;
    }

    public String getEstado_del_turno() {
        return estado_del_turno;
    }

    public void setEstado_del_turno(String estado_del_turno) {
        this.estado_del_turno = estado_del_turno;
    }

    public String getHistoria_clinica() {
        return historia_clinica;
    }

    public void setHistoria_clinica(String historia_clinica) {
        this.historia_clinica = historia_clinica;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

            
}
