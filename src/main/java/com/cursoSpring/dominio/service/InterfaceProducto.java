package com.cursoSpring.dominio.service;

import com.cursoSpring.persistencia.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface InterfaceProducto {
    public List<Producto> getAll();
    public Optional<List<Producto>> getEscasos(int stock);
    public Optional <Producto> getProducto(int idProducto);
    public Producto saveProducto(Producto producto);
    public boolean deleteProducto(int idProducto);
    public List<Producto> getByCategoria (int idCategoria);



}
