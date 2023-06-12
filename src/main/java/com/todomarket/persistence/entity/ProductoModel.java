package com.todomarket.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class ProductoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto", nullable = false)
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_categoria", nullable = false)
    private Integer idCategoria;

    @Column(name = "codigo_barras", nullable = false)
    private String codigoBarras;

    @Column(name = "precio_venta", nullable = false)
    private Double precioVenta;

    @Column(name = "cantidad_stock", nullable = false)
    private Integer cantidadStock;

    private Boolean estado;
}
