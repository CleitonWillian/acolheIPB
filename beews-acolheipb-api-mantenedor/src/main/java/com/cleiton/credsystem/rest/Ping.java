package com.cleiton.credsystem.rest;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beews.webstart.anntotion.Get;
import com.beews.webstart.anntotion.Post;
import com.beews.webstart.properties.AppProperties;
import com.beews.webstart.properties.AppPropertiesFactory;

@RestController
@RequestMapping(value = "/api/ping")
public class Ping {
	
	private static final Logger LOG = LogManager.getLogger(Ping.class);

	@Autowired
	AppProperties appProperties;
	
	@Get
	public ResponseEntity<AppProperties> pingApp() {
		return new ResponseEntity<AppProperties>(appProperties, HttpStatus.OK);
	}
	
	@Post
	public ResponseEntity<String> pingApp(@RequestBody String objeto) {
		LOG.info(objeto);
		return new ResponseEntity<String>("", HttpStatus.OK);
	}
	
	@Get("payload")
	public ResponseEntity<String> payload() {
		return new ResponseEntity<String>("{ \"bureau\":{\r\n" + 
				"  \"bvs\":{  \r\n" + 
				"   \"aproveitada\":false,\r\n" + 
				"   \"cpf\":\"00916966666\",\r\n" + 
				"   \"erro\":false,\r\n" + 
				"   \"retorno601\":[  \r\n" + 
				"      {  \r\n" + 
				"         \"classificacao_alfabetica\":\"\",\r\n" + 
				"         \"classificacao_numerica\":\"00\",\r\n" + 
				"         \"codigo_natureza_modelo\":\"101\",\r\n" + 
				"         \"descricao_natureza\":\"CREDITO\",\r\n" + 
				"         \"modelo_plano\":\"S6\",\r\n" + 
				"         \"modelo_score\":\"S6\",\r\n" + 
				"         \"nome_plano\":\"\",\r\n" + 
				"         \"nome_score\":\"S6\",\r\n" + 
				"         \"plano_execucao\":\"N\",\r\n" + 
				"         \"probabilidade\":\"00000\",\r\n" + 
				"         \"registro\":\"S\",\r\n" + 
				"         \"score\":\"413\",\r\n" + 
				"         \"tamanho_registro\":450,\r\n" + 
				"         \"texto_explicativo\":\"\",\r\n" + 
				"         \"texto_natureza\":\"\",\r\n" + 
				"         \"tipo_registro\":601,\r\n" + 
				"         \"tipo_score\":\"\"\r\n" + 
				"      },\r\n" + 
				"      {  \r\n" + 
				"         \"classificacao_alfabetica\":\"\",\r\n" + 
				"         \"classificacao_numerica\":\"00\",\r\n" + 
				"         \"codigo_natureza_modelo\":\"101\",\r\n" + 
				"         \"descricao_natureza\":\"CREDITO\",\r\n" + 
				"         \"modelo_plano\":\"S5\",\r\n" + 
				"         \"modelo_score\":\"S5\",\r\n" + 
				"         \"nome_plano\":\"\",\r\n" + 
				"         \"nome_score\":\"S5\",\r\n" + 
				"         \"plano_execucao\":\"N\",\r\n" + 
				"         \"probabilidade\":\"00000\",\r\n" + 
				"         \"registro\":\"S\",\r\n" + 
				"         \"score\":\"272\",\r\n" + 
				"         \"tamanho_registro\":450,\r\n" + 
				"         \"texto_explicativo\":\"\",\r\n" + 
				"         \"texto_natureza\":\"\",\r\n" + 
				"         \"tipo_registro\":601,\r\n" + 
				"         \"tipo_score\":\"\"\r\n" + 
				"      },\r\n" + 
				"      {  \r\n" + 
				"         \"classificacao_alfabetica\":\"\",\r\n" + 
				"         \"classificacao_numerica\":\"00\",\r\n" + 
				"         \"codigo_natureza_modelo\":\"101\",\r\n" + 
				"         \"descricao_natureza\":\"CREDITO\",\r\n" + 
				"         \"modelo_plano\":\"S4\",\r\n" + 
				"         \"modelo_score\":\"S4\",\r\n" + 
				"         \"nome_plano\":\"\",\r\n" + 
				"         \"nome_score\":\"S4\",\r\n" + 
				"         \"plano_execucao\":\"N\",\r\n" + 
				"         \"probabilidade\":\"00000\",\r\n" + 
				"         \"registro\":\"S\",\r\n" + 
				"         \"score\":\"170\",\r\n" + 
				"         \"tamanho_registro\":450,\r\n" + 
				"         \"texto_explicativo\":\"\",\r\n" + 
				"         \"texto_natureza\":\"\",\r\n" + 
				"         \"tipo_registro\":601,\r\n" + 
				"         \"tipo_score\":\"\"\r\n" + 
				"      },\r\n" + 
				"      {  \r\n" + 
				"         \"classificacao_alfabetica\":\"\",\r\n" + 
				"         \"classificacao_numerica\":\"01\",\r\n" + 
				"         \"codigo_natureza_modelo\":\"103\",\r\n" + 
				"         \"descricao_natureza\":\"RENDA PRESUMIDA\",\r\n" + 
				"         \"modelo_plano\":\"41\",\r\n" + 
				"         \"modelo_score\":\"41\",\r\n" + 
				"         \"nome_plano\":\"\",\r\n" + 
				"         \"nome_score\":\"RENDA PRESUM FAIXA\",\r\n" + 
				"         \"plano_execucao\":\"N\",\r\n" + 
				"         \"probabilidade\":\"00000\",\r\n" + 
				"         \"registro\":\"S\",\r\n" + 
				"         \"score\":\"1\",\r\n" + 
				"         \"tamanho_registro\":450,\r\n" + 
				"         \"texto_explicativo\":\"Não possui informações relevantes para cálculo da renda\",\r\n" + 
				"         \"texto_natureza\":\"Renda estimada a partir de informações comportamentais e cadastrais do consumidor.\",\r\n" + 
				"         \"tipo_registro\":601,\r\n" + 
				"         \"tipo_score\":\"\"\r\n" + 
				"      },\r\n" + 
				"      {  \r\n" + 
				"         \"classificacao_alfabetica\":\"\",\r\n" + 
				"         \"classificacao_numerica\":\"00\",\r\n" + 
				"         \"codigo_natureza_modelo\":\"101\",\r\n" + 
				"         \"descricao_natureza\":\"CREDITO\",\r\n" + 
				"         \"modelo_plano\":\"S7\",\r\n" + 
				"         \"modelo_score\":\"S7\",\r\n" + 
				"         \"nome_plano\":\"\",\r\n" + 
				"         \"nome_score\":\"S7\",\r\n" + 
				"         \"plano_execucao\":\"N\",\r\n" + 
				"         \"probabilidade\":\"00000\",\r\n" + 
				"         \"registro\":\"S\",\r\n" + 
				"         \"score\":\"97\",\r\n" + 
				"         \"tamanho_registro\":450,\r\n" + 
				"         \"texto_explicativo\":\"\",\r\n" + 
				"         \"texto_natureza\":\"\",\r\n" + 
				"         \"tipo_registro\":601,\r\n" + 
				"         \"tipo_score\":\"\"\r\n" + 
				"      }\r\n" + 
				"   ],\r\n" + 
				"   \"retorno603\":[  \r\n" + 
				"      {  \r\n" + 
				"         \"aprova\":\"N\",\r\n" + 
				"         \"documento\":\"00000916966666\",\r\n" + 
				"         \"registro\":\"S\",\r\n" + 
				"         \"score\":\"0002\",\r\n" + 
				"         \"tamanho_registro\":224,\r\n" + 
				"         \"texto\":\"NEGOCIAÇÃO NÃO RECOMENDADA\",\r\n" + 
				"         \"tipo_documento\":\"1\",\r\n" + 
				"         \"tipo_registro\":603\r\n" + 
				"      }\r\n" + 
				"   ]\r\n" + 
				"}\r\n" + 
				"}\r\n" + 
				"}", HttpStatus.OK);
	}
	
}
