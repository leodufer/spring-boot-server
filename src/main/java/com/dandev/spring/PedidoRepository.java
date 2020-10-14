package com.dandev.spring;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PedidoRepository extends CrudRepository<Pedido, Long> {

    List<Pedido> findByName(String name);

}