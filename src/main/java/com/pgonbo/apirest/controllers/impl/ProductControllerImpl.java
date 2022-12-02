package com.pgonbo.apirest.controllers.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pgonbo.apirest.controllers.ProductController;
import com.pgonbo.apirest.entities.ProductoEntity;
import com.pgonbo.apirest.models.ProductoRequestModel;
import com.pgonbo.apirest.services.ProductService;

@RestController
public class ProductControllerImpl implements ProductController {
    @Autowired
    ProductService productService;

    @Override
    public List<ProductoEntity> getProducts() {
        return productService.getProductos();
    }

    @Override
    public List<ProductoEntity> getProdutoPorNombre(ProductoRequestModel producto) {
        List<ProductoEntity> productos = new ArrayList<ProductoEntity>();
        if (producto.getNombre().isEmpty())
            return productService.getProductos();
        else {
            productos.add(productService.getProductoPorNombre(producto.getNombre()));
            return productos;
        }
    }

}
