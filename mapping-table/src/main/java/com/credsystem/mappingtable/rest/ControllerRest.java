package com.credsystem.mappingtable.rest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beews.webstart.anntotion.Get;
import com.credsystem.mappingtable.entity.UserTabColumns;

@RestController
@RequestMapping(value = "/api")
public class ControllerRest {

	@Autowired
	EntityManager entityManager;

	@Get
	@Transactional
	public List<UserTabColumns> getAlltables() {
		return entityManager.createQuery("SELECT a FROM " + UserTabColumns.class.getName() + " a ORDER BY a.tableName , a.columnName").getResultList();

	}

}
