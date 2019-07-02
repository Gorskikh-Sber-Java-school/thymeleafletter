package com.thymeleaf.letter.thymeleafletter.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Item {
    private long id;
    private String name;
    private BigDecimal price;
    private int count;
}
