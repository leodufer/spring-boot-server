package com.dandev.spring.cliente;

import com.dandev.spring.AbstractController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController extends AbstractController<Cliente> {
   
}
