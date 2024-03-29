package com.thymeleaf.letter.thymeleafletter.controller;

import com.thymeleaf.letter.thymeleafletter.entities.User;
import com.thymeleaf.letter.thymeleafletter.services.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LetterController {

    @GetMapping("/")
    public String startPage() {
        return "redirect:introduction";
    }

    @GetMapping("/introduction")
    public String introduceForm(Model model) {
        model.addAttribute("user", new User());
        return "introduction";
    }

    @GetMapping("/letter")
    public String getLetter() {
        return "redirect:introduction";
    }

    @PostMapping(value = "/letter")
    public String letter(@ModelAttribute(name = "user") User user, Model model) {
        user.setOrders(OrderService.generateOrders(453772));
        user.setRegistered(true);
        user.setPoints(534);
        return "letter";
    }
}
