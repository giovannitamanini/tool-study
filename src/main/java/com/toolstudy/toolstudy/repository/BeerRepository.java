package com.toolstudy.toolstudy.repository;

import com.sun.xml.bind.v2.model.core.ID;
import com.toolstudy.toolstudy.entity.BeerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerRepository extends CrudRepository<BeerEntity, ID> {
    BeerEntity save(BeerEntity beer);

    BeerEntity findById(int beerId);
}


