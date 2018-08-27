package com.beews.acolheipb.api.repository.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beews.acolhipb.entidades.Igreja;

@RestController
@RequestMapping("igreja")
public class RepositoryIgrejaRest extends RepositoryRest<Igreja> {

	@Autowired
	public RepositoryIgrejaRest(MongoTemplate mongo) {
		super(mongo);
	}

}

