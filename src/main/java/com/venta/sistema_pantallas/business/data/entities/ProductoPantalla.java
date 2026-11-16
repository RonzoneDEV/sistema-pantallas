package com.venta.sistema_pantallas.business.data.entities;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Table(name = "productos_pantalla")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ProductoPantalla {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true,length = 30)
    private String sku;

    @Column(nullable = false,length = 50)
    private String marca;

    @Column(nullable = false,length = 100)
    private String nombreBase;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private CalidadPantalla calidad;

    @Column(nullable = false)
    private boolean tieneMarco;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal precioVenta;

    @Builder.Default
    @Column(nullable = false)
    private Integer stockDisponible = 0;

    @Builder.Default
    @Column(nullable = false)
    private Integer stockCondicion = 0;

}
