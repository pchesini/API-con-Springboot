package com.cursoSpring.web.controller;

import com.cursoSpring.dominio.service.ProductoService;
import com.cursoSpring.persistencia.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoS;

    @GetMapping("/all")
    public List<Producto> getAll() {
        return productoS.getAll();
    }

    @GetMapping("/idProducto")
    public Optional<Producto> getProducto(@PathVariable("idProducto") int idProducto) {
        return productoS.getProducto(idProducto);

    }
    @PostMapping("/save")
    public Producto saveProducto(@RequestBody Producto producto){
        return productoS.saveProducto(producto);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteProducto(@PathVariable("id") int idProducto){
         productoS.deleteProducto(idProducto);
    }
    //@GetMapping("/categoria/idCategoria{}")
    //public Optional<List<Producto>> getByCategoria(@PathVariable("idCategoria") int idCategoria ){
     //   return productoS.getByCategoria(idCategoria);
    //}
}

