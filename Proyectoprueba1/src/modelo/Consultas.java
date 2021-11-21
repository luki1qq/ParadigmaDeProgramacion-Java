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
public class Consultas {
    int idConsulta;
    int Usuario_idUsuarios;
    int Cliente_idCliente;
    String Fecha_de_consulta;
    String horaturno;
    String estado_turno;

    @Override
    public String toString() {
        return "Consultas{" + "idConsulta=" + idConsulta + ", Usuario_idUsuarios=" + Usuario_idUsuarios + ", Cliente_idCliente=" + Cliente_idCliente + ", Fecha_de_consulta=" + Fecha_de_consulta + ", horaturno=" + horaturno + ", estado_turno=" + estado_turno + '}';
    }

    public Consultas(int idConsulta, int Usuario_idUsuarios, int Cliente_idCliente, String Fecha_de_consulta, String horaturno, String estado_turno) {
        this.idConsulta = idConsulta;
        this.Usuario_idUsuarios = Usuario_idUsuarios;
        this.Cliente_idCliente = Cliente_idCliente;
        this.Fecha_de_consulta = Fecha_de_consulta;
        this.horaturno = horaturno;
        this.estado_turno = estado_turno;
    }

    public Consultas() {
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public int getUsuario_idUsuarios() {
        return Usuario_idUsuarios;
    }

    public void setUsuario_idUsuarios(int Usuario_idUsuarios) {
        this.Usuario_idUsuarios = Usuario_idUsuarios;
    }

    public int getCliente_idCliente() {
        return Cliente_idCliente;
    }

    public void setCliente_idCliente(int Cliente_idCliente) {
        this.Cliente_idCliente = Cliente_idCliente;
    }

    public String getFecha_de_consulta() {
        return Fecha_de_consulta;
    }

    public void setFecha_de_consulta(String Fecha_de_consulta) {
        this.Fecha_de_consulta = Fecha_de_consulta;
    }

    public String getHoraturno() {
        return horaturno;
    }

    public void setHoraturno(String horaturno) {
        this.horaturno = horaturno;
    }

    public String getEstado_turno() {
        return estado_turno;
    }

    public void setEstado_turno(String estado_turno) {
        this.estado_turno = estado_turno;
    }
    
}
