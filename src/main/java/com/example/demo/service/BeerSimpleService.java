package com.example.demo.service;

import com.example.demo.entity.BeerSimple;



public interface BeerSimpleService {

    Iterable<BeerSimple> findAll();

    BeerSimple save(BeerSimple var1);

    boolean existsById(String brewery_id);

    void deleteById(String brewery_id);

}
