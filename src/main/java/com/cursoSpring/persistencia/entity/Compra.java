package com.cursoSpring.persistencia.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name ="compras")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idCompra")
    private Integer idCompra;
    @Column(name="id_cliente")
    private String idCliente;
    private LocalDateTime fecha;
    @Column(name ="medio_pago")
    private Integer medioPago;
    private String comentario;
    private String estado;

    @ManyToOne
    @JoinColumn(name="id_cliente",insertable = false, updatable= false)
    private Cliente cliente;

    @OneToMany(mappedBy = "compra")
    private List<CompraProducto> productos;


    public Integer getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(Integer medioPago) {
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

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
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
