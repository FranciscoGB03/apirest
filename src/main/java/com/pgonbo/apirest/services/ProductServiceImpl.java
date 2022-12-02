package com.pgonbo.apirest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pgonbo.apirest.entities.ProductoEntity;
import com.pgonbo.apirest.repositories.ProductoRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<ProductoEntity> getProductos() {
        List<ProductoEntity> productos = productoRepository.findAll();
        return productos;
    }

    @Override
    public ProductoEntity getProductoPorNombre(String nombre) {
        Optional<ProductoEntity> producto = productoRepository.findOneByNombre(nombre);
        return producto.get();

    }

}
