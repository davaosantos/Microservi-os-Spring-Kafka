package org.casadocodigo.shoppingvalidator.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopItemDTO {
    private String productIdentifier;
    private Integer amount;
    private Float price;
}
