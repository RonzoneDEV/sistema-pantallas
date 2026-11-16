package com.venta.sistema_pantallas.business.api.Dtos;
import com.venta.sistema_pantallas.business.data.entities.CalidadPantalla;
import jakarta.validation.constraints.*;
import lombok.*;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ProductoPantallaResponseDto {
    private Long id;
    private String sku;
    private String marca;
    private String nombreBase;
    private CalidadPantalla calidad;
    private boolean tieneMarco;
    private BigDecimal precioVenta;
    private Integer stockDisponible;
    private Integer stockCondicion;
}