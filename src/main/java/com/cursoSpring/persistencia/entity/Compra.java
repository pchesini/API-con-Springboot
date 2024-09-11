package com.cursoSpring.persistencia.entity;

import jakarta.persistence.*;

import java.awt.*;
import java.time.LocalDateTime;

@Entity
@Table(name ="compras")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idCompra")
    private Long idCompra;
    @Column(name="id_cliente")
    private String idCliente;
    private LocalDateTime fecha;
    @Column(name ="medio_pago")
    private String medioPago;
    private String comentario;
    private String estado;

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Long idCompra) {
        this.idCompra = idCompra;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
