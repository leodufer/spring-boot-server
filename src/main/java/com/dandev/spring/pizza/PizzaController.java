package com.dandev.spring.pizza;

import com.dandev.spring.AbstractController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pizzas")
public class PizzaController extends AbstractController<Pizza> {
   
}
