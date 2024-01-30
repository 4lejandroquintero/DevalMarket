package com.deval.market.persistence.crud;

import com.deval.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}
