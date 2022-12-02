package com.pgonbo.apirest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pgonbo.apirest.entities.ProductoEntity;
import com.pgonbo.apirest.models.ProductoRequestModel;

@RequestMapping("/productos")
public interface ProductController {
    @GetMapping() // Consulta de todos los productos
    public List<ProductoEntity> getProducts();

    @PostMapping()
    public List<ProductoEntity> getProdutoPorNombre(@RequestBody ProductoRequestModel producto);

}
