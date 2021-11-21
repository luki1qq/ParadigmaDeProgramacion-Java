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
public class Mascota {
    int idMascota;
    int idCliente;
    String nombre_mascota;
    String peso;
    String animal;
    String hora_del_turno;
    String estado_del_turno;
    String historia_clinica;

    public Mascota() {
    }

    public Mascota(int idMascota, int idCliente, String nombre_mascota, String peso, String animal, String hora_del_turno, String estado_del_turno, String historia_clinica) {
        this.idMascota = idMascota;
        this.idCliente = idCliente;
        this.nombre_mascota = nombre_mascota;
        this.peso = peso;
        this.animal = animal;
        this.hora_del_turno = hora_del_turno;
        this.estado_del_turno = estado_del_turno;
        this.historia_clinica = historia_clinica;
    }


    @Override
    public String toString() {
        return "Mascota{" + "idMascota=" + idMascota + ", idCliente=" + idCliente + ", nombre_mascota=" + nombre_mascota + ", peso=" + peso + ", animal=" + animal + ", hora_del_turno=" + hora_del_turno + ", estado_del_turno=" + estado_del_turno + ", historia_clinica=" + historia_clinica + '}';
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
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
    
    
}
