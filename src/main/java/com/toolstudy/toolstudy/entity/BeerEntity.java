package com.toolstudy.toolstudy.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity(name = "beer")
public class BeerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String color;
    @NotNull
    private BigDecimal price;

    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getAllInformation() {
        return name + " " + color + " " + price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}