package com.cursoSpring.web.controller;

import com.cursoSpring.dominio.service.ProductoService;
import com.cursoSpring.persistencia.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoS;

    @GetMapping("/all")
    public ResponseEntity<List<Producto>> getAll() {
        return new ResponseEntity<>(productoS.getAll(), HttpStatus.OK);
    }

    @GetMapping("/idProducto")
    public ResponseEntity<Producto> getProducto(@PathVariable("idProducto") int idProducto) {
        return productoS.getProducto(idProducto)
                .map(producto -> new ResponseEntity<>(producto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    @PostMapping("/save")
    public ResponseEntity<Producto> saveProducto(@RequestBody Producto producto) {
        return new ResponseEntity<>(productoS.saveProducto(producto), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteProducto(@PathVariable("id") int idProducto) {
        if (productoS.deleteProducto(idProducto)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //
//    @GetMapping("/categoria/{idCategoria}")
//    public ResponseEntity<List<Producto>> getByCategoria(@PathVariable("idCategoria") int idCategoria ){
//        return productoS.getByCategoria(idCategoria).map(productos -> new ResponseEntity<>(productos, HttpStatus.OK))
//        ..orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
}

