package com.venta.sistema_pantallas.business.api.exceptions;

public class SkuDuplicadoException extends RuntimeException {
    public SkuDuplicadoException(String sku) {
        super("El SKU " + sku + " ya se encuentra registrado");
    }
}
