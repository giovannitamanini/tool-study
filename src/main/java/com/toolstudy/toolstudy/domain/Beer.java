package com.toolstudy.toolstudy.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    private String name;
    private String color;
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