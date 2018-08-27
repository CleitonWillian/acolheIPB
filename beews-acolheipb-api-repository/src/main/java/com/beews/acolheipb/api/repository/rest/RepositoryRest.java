package com.beews.acolheipb.api.repository.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.beews.acolhipb.enums.StatusDB;
import com.beews.webstart.anntotion.Delete;
import com.beews.webstart.anntotion.Get;
import com.beews.webstart.anntotion.Post;
import com.beews.webstart.properties.AppProperties;
import com.beews.webstart.rest.Resposta;

public abstract class RepositoryRest<T> {

	private MongoTemplate mongo;
	private Class<T> tipoEntidade;

	@Autowired
	AppProperties appProperties;

	@SuppressWarnings("unchecked")
	@Autowired
	public RepositoryRest(MongoTemplate mongo) {
		this.mongo = mongo;
		this.tipoEntidade = (Class<T>) GenericTypeResolver.resolveTypeArgument(getClass(), RepositoryRest.class);

	}

	@Post
	public ResponseEntity<Resposta> salvar(@RequestBody T entidade) {
		mongo.save(entidade);
		return new ResponseEntity<>(new Resposta().salvar(), HttpStatus.OK);
	}

	@Delete("/{id}")
	public ResponseEntity<Resposta> delete(@PathVariable("id") String id) {

		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		Update update = new Update();
		update.push("status", StatusDB.DELETADO);
		System.out.println(tipoEntidade);
		return new ResponseEntity<>(new Resposta(mongo.updateFirst(query, update, tipoEntidade)),
				HttpStatus.OK);
	}

	@Get
	public ResponseEntity<List<T>> buscarTodos() {
		return new ResponseEntity<>(mongo.findAll(tipoEntidade), HttpStatus.OK);
	}

	@Get("/{id}")
	public ResponseEntity<T> buscarPorId(@PathVariable("id") String id) {
		return new ResponseEntity<>(mongo.findById(id, tipoEntidade), HttpStatus.OK);
	}

	@Get("/ping")
	public ResponseEntity<AppProperties> pingApp() {
		return new ResponseEntity<>(appProperties, HttpStatus.OK);
	}

}
