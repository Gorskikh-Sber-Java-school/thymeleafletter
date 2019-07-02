package com.thymeleaf.letter.thymeleafletter.services;

import com.thymeleaf.letter.thymeleafletter.entities.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ItemService {

    public static List<Item> generateItems(long startId) {
        List<Item> items = new ArrayList<>();

        items.add(new Item(startId++, "Шкаф", BigDecimal.valueOf(42324.2), 1));
        items.add(new Item(startId++, "Стул", BigDecimal.valueOf(6454.0), 5));
        items.add(new Item(startId++, "Стол", BigDecimal.valueOf(12324.4), 2));
        items.add(new Item(startId, "Полка", BigDecimal.valueOf(1324.4), 2));

        return items;
    }
}
