package com.dandev.spring.pedido;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.dandev.spring.pizza.Pizza;

@Entity
public class Pedido{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Pizza pizza;
    private boolean borde;
    private String observacion;
    private long totalPedido;
    private int cantidad;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public boolean isBorde() {
        return borde;
    }

    public void setBorde(boolean borde) {
        this.borde = borde;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public long getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(long totalPedido) {
        this.totalPedido = totalPedido;
    }
}