package com.example.crud_java.domain.product;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record NewProductDTO(

        String id,
        @NotBlank
        String name,
        @NotNull
        Integer price_in_cents
)

{
}
