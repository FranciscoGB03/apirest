package com.pgonbo.apirest.services;

import java.util.List;

import com.pgonbo.apirest.entities.ProductoEntity;

public interface ProductService {
    public List<ProductoEntity> getProductos();

    public ProductoEntity getProductoPorNombre(String nombre);
}
