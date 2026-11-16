package com.venta.sistema_pantallas.business.api.exceptions;

public class ProductoPantallaNoEncontradoException extends RuntimeException {
    public ProductoPantallaNoEncontradoException(Long id) {
        super("No se encontró el producto con ID: " + id);
    }
}
