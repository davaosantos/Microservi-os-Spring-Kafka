package org.casadocodigo.shoppingvalidator.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "product", schema = "shop") // FORÇA O USO DO SCHEMA SHOP
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_identifier")
    private String identifier;
    private Integer amount;
}

