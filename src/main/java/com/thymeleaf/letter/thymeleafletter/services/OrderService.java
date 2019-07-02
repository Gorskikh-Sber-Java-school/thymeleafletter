package com.thymeleaf.letter.thymeleafletter.services;

import com.thymeleaf.letter.thymeleafletter.entities.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderService {
    public static List<Order> generateOrders(long startId) {
        List<Order> orders = new ArrayList<>();

        orders.add(new Order(startId++, LocalDate.now(), ItemService.generateItems(342)));

        return orders;
    }
}
