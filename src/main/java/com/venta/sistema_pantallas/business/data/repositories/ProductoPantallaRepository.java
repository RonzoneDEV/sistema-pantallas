package com.venta.sistema_pantallas.business.data.repositories;

import com.venta.sistema_pantallas.business.data.entities.ProductoPantalla;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProductoPantallaRepository extends JpaRepository<ProductoPantalla, Long> {
    boolean existsBySku(String sku);

    Optional<ProductoPantalla> findBySku(String sku);
}
