package com.beews.acolheipb.api.repository.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beews.acolhipb.entidades.Mantenedor;

@RestController
@RequestMapping("mantenedor")
public class RepositoryMantenedorRest extends RepositoryRest<Mantenedor> {
	
	@Autowired
	public RepositoryMantenedorRest(MongoTemplate mongo) {
		super(mongo);
	}

	
	


}
