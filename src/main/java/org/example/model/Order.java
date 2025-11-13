package org.example.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Order {
    private Long id;
    private Long petId;
    private Integer quantity;
    private LocalDateTime shipDate;
    private OrderStatus status;
    private Boolean complete;
}
