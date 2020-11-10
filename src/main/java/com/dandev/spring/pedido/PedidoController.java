package com.dandev.spring.pedido;

import com.dandev.spring.AbstractController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends AbstractController<Pedido> {
   
}
