package com.cursoSpring.persistencia.mapper;

import com.cursoSpring.dominio.Product;
import com.cursoSpring.persistencia.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel ="spring" ,uses  = {CategoryMapper.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "idProducto", target = "productId"),
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "precioVenta", target = "price"),
            @Mapping(source = "stock", target = "stock"),
            @Mapping(source = "estado", target = "active"),
            //@Mapping(source = "idCategoria", target = "category"), solucionar eso (deuda codigo)
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);

    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras" , ignore = true)
    Producto toProducto(Product product);
}
