package com.example.crud_java.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "product")
@Entity(name="product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {


    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
    private Integer price_in_cents;
    private Boolean active;

    public Product(NewProductDTO newProductDTO){
        this.name = newProductDTO.name();
        this.price_in_cents = newProductDTO.price_in_cents();
        this.active = true;
    }
}
