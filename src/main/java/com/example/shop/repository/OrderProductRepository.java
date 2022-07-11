package com.example.shop.repository;

import com.example.shop.model.OrderProduct;
import com.example.shop.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}