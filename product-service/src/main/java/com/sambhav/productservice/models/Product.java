package com.sambhav.productservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "product")
@Data
@AllArgsConstructor
@ToString
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
