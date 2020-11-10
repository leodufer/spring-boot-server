package com.dandev.spring.orden;

import com.dandev.spring.AbstractController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ordenes")
public class OrdenController extends AbstractController<Orden> {
   
}
