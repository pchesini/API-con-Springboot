package com.cursoSpring.persistencia.entity;


import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="compras_productos")
public class CompraProducto {

    @EmbeddedId
    private ComprasProductosPk id;
    private Integer cantidad;
    private Double total;
    private Boolean estado;

    public ComprasProductosPk getId() {
        return id;
    }

    public void setId(ComprasProductosPk id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
