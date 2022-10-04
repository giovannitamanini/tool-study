package com.toolstudy.toolstudy.service;

import com.toolstudy.toolstudy.entity.BeerEntity;
import com.toolstudy.toolstudy.repository.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BeerService {
    private final BeerRepository beerRepository;
    //private final BeerRepositoryImpl BeerRepositoryImpl;

    public BeerEntity saveBeer(BeerEntity beer) {
        return beerRepository.save(beer);
    }

    public BeerEntity findById(int beerId) {
        return beerRepository.findById(beerId);
    }
}
