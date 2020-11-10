package com.dandev.spring.pizza;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PizzaRepository extends CrudRepository<Pizza, Long> {

    List<Pizza> findByName(String name);

}