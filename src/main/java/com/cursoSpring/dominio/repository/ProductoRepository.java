package com.cursoSpring.dominio.repository;

import com.cursoSpring.persistencia.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface ProductoRepository extends JpaRepository<Producto ,Integer> {
    List<Producto> findByIdCategoria(int id_categoria);
    //me trae los prodcutos con un stock minimo
    Optional<List<Producto>> findByStockLessThan(int stock);
}
