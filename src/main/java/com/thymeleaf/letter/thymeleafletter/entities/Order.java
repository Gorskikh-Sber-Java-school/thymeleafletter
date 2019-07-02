package com.thymeleaf.letter.thymeleafletter.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Order {
    private long id;
    private LocalDate date;
    private List<Item> items;
}
