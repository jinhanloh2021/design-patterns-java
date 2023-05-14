package com.company.intersegrega.entity;

import java.util.HashMap;
import java.util.Map;
import com.company.intersegrega.service.PersistenceService;

public class OrderPersistenceService implements PersistenceService<Order> {

    private static final Map<Long, Order> ORDERS = new HashMap<>();

    @Override
    public void delete(Order entity) {
        synchronized (ORDERS) {
            ORDERS.remove(entity.getId());
        }
    }

    @Override
    public Order findById(Long id) {
        synchronized (ORDERS) {
            return ORDERS.get(id);
        }
    }

    // findByName makes sense for a user database, but not for order. But this
    // method is defined in the PersistenceService interface. This is a problem.

    // @Override
    // public List<Order> findByName(String name) {
    // throw new UnsupportedOperationException("Orders have no name.");
    // }

    @Override
    public void save(Order entity) {
        synchronized (ORDERS) {
            ORDERS.put(entity.getId(), entity);
        }
    }

}
