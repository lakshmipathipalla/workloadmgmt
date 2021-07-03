package com.mcronalds.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcronalds.order.entities.Order;

public interface IOrderUpdateRepository extends JpaRepository<Order, Integer> {

}
