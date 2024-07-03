package com.hg.crud.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.hg.crud.models.ProducDTO;

@Repository
public interface IProductDAO extends MongoRepository<ProducDTO, String> {

}
