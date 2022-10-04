package com.toolstudy.toolstudy.controller;

import com.toolstudy.toolstudy.entity.BeerEntity;
import com.toolstudy.toolstudy.service.BeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BeerController {
    private final BeerService beerService;

    @PostMapping("/beers")
    public ResponseEntity<BeerEntity> saveBeer(@RequestBody BeerEntity beer) {
        BeerEntity savedBeer = beerService.saveBeer(beer);
        return ResponseEntity.ok(savedBeer);
    }

    @GetMapping("/beers/{beerId}")
    public ResponseEntity<BeerEntity> findById(@PathVariable int beerId) {
        BeerEntity beer = beerService.findById(beerId);
        return ResponseEntity.ok(beer);
    }
}
