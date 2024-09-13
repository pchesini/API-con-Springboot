package com.cursoSpring.dominio.service;

import com.cursoSpring.dominio.repository.ProductoRepository;
import com.cursoSpring.persistencia.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements InterfaceProducto{

    @Autowired
    private ProductoRepository productoR;
    public List<Producto> getAll() {
        return productoR.findAll();
    }

    @Override
    public Optional<List<Producto>> getEscasos(int stock) {
        return productoR.findByStockLessThan(stock);
    }

    @Override
    public Optional<Producto> getProducto(int idProducto) {
        return productoR.findById(idProducto);
    }

    @Override
    public Producto saveProducto(Producto producto) {
        return productoR.save(producto);
    }

    @Override
    public void deleteProducto(int idProducto) {
        productoR.deleteById(idProducto);
    }

    @Override
    public List<Producto> getByCategoria(int id_categoria ) {
        return productoR.findByIdCategoria(id_categoria);
    }
}
