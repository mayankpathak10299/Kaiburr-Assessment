package com.springtest.springtest.repo;



import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.springtest.springtest.server.Servers;

public interface ServerRepository extends MongoRepository<Servers, Integer>{

	Optional<Servers> findByName(String name);

	



	

}


