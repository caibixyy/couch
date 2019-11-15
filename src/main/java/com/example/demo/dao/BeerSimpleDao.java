package com.example.demo.dao;


import com.example.demo.entity.BeerSimple;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BeerSimpleDao extends CrudRepository<BeerSimple,String> {
}
