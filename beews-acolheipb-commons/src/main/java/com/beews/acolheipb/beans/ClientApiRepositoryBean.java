package com.beews.acolheipb.beans;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.core.GenericTypeResolver;

import com.beews.webstart.rest.Resposta;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

public abstract class ClientApiRepositoryBean<T> {

	private final Class<T> tipoEntidade;
	private final String baseUrl;
	private static final String CONTEXTO = "http://localhost:8020/api/repository/";

	@SuppressWarnings("unchecked")
	public ClientApiRepositoryBean() {
		this.tipoEntidade = (Class<T>) GenericTypeResolver.resolveTypeArgument(getClass(),
				ClientApiRepositoryBean.class);
		this.baseUrl =  CONTEXTO + tipoEntidade.getClass().getCanonicalName();
	}

	private WebResource getConexao(String path) {

		Client client = Client.create();
		WebResource resource = client.resource(baseUrl);
		resource.path(path).accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON);
		return resource;

	}

	public Resposta salvar(T entidade) {
		Resposta entity = getConexao("").post(ClientResponse.class, entidade).getEntity(Resposta.class);
		System.out.println(entity);
		return entity;

	}

	public Resposta delete(String id) {
		return getConexao("/" + id).delete(ClientResponse.class).getEntity(Resposta.class);
	}

	public List<T> buscarTodos() {
		return getConexao("").type(MediaType.APPLICATION_JSON).get(ClientResponse.class)
				.getEntity(new GenericType<List<T>>() {
				});
	}

	public T buscarPorId(String id) {
		return getConexao("/" + id).type(MediaType.APPLICATION_JSON).get(ClientResponse.class).getEntity(tipoEntidade);
	}

}
