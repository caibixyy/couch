package com.example.demo.controller;

import com.couchbase.client.java.Bucket;
import com.example.demo.entity.BeerSimple;
import com.example.demo.service.BeerSimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class BeerSimpleController {
    @Autowired
    private BeerSimpleService beerSimpleService;
    @Autowired
    private CouchbaseTemplate couchbaseTemplate;

    @GetMapping("/insert")
    public Iterable<BeerSimple> findAll(){
        for (int i = 21; i < 30; i++) {
            BeerSimple b= new BeerSimple("brewery_id"+i,"青岛","崂山真品质",2,"勇闯天涯",i,"big","haha",1,new Date(),7.2);
            beerSimpleService.save(b);
        }
        return null;
    }
}
