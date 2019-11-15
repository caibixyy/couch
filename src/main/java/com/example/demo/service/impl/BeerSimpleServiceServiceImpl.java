package com.example.demo.service.impl;

import com.example.demo.dao.BeerSimpleDao;
import com.example.demo.entity.BeerSimple;
import com.example.demo.service.BeerSimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BeerSimpleServiceServiceImpl implements BeerSimpleService {

    @Autowired
    BeerSimpleDao beerSimpleDao;

    @Override
    public Iterable<BeerSimple> findAll() {
        return beerSimpleDao.findAll();
    }

    @Override
    public BeerSimple save(BeerSimple var1) {
        return beerSimpleDao.save(var1);
    }

    @Override
    public boolean existsById(String brewery_id) {
        return beerSimpleDao.existsById(brewery_id);
    }

    @Override
    public void deleteById(String brewery_id) {
        beerSimpleDao.deleteById(brewery_id);
    }
}

