package com.beews.acolheipb.api.repository.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beews.acolhipb.entidades.Missionario;

@RestController
@RequestMapping("missionario")
public class RepositoryMissionarioRest extends RepositoryRest<Missionario> {
	
	@Autowired
	public RepositoryMissionarioRest(MongoTemplate mongo) {
		super(mongo);
	}

	
	


}
