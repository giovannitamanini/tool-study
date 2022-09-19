package com.toolstudy.toolstudy.controller;

import com.toolstudy.toolstudy.domain.Beer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class BeerController {

    @GetMapping("/beers")
    public String getAllBeerInformation() {
        Beer beer = new Beer();
        beer.setName("Coruja");
        beer.setColor("black");
        beer.setPrice(BigDecimal.valueOf(10.90));

        return beer.getAllInformation();
    }

}
