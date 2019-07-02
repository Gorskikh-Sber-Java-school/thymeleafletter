package com.thymeleaf.letter.thymeleafletter.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
    private String firstName;
    private String lastName;
    private Sex sex;
    private boolean registered;
    private long points;
    private List<Order> orders;
}
