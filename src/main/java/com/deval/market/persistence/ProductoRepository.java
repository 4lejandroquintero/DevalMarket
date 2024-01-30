package com.deval.market.persistence;

import com.deval.market.persistence.crud.ProductoCrudRepository;
import com.deval.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
