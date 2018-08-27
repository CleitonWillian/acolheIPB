package com.beews.webstart.doc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beews.webstart.properties.AppProperties;
import com.google.common.collect.Ordering;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiDescription;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Operation;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.Orderings;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public abstract class Documentacao {
	
	@Autowired
	AppProperties appProperties;
	
	protected String pathsRastreados() {
		return "/api/*";
	}
	
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo())
				.useDefaultResponseMessages(false) 
				.globalResponseMessage(RequestMethod.GET,configMenssagemDeRespostas())
				.globalResponseMessage(RequestMethod.POST,configMenssagemDeRespostas())
				.globalResponseMessage(RequestMethod.PUT,configMenssagemDeRespostas())
				.globalResponseMessage(RequestMethod.PATCH,configMenssagemDeRespostas())
				.globalResponseMessage(RequestMethod.DELETE,configMenssagemDeRespostas())
				
				
				;                    
	}
	
	private ApiInfo apiInfo() {
	     return new ApiInfo(
	       appProperties.getDescricao().toUpperCase(), 
	       "Descrição dos endpoints da aplicação " + appProperties.getDescricao(), 
	       "API TOS", 
	       "Uso exclusivo para", 
	       new Contact("Cleiton Willian", "www.beews.com", "cleiton.devcode@gmail.com"), 
	       "", "API license URL", Collections.emptyList());
	}
	
	private List<ResponseMessage> configMenssagemDeRespostas(){
		List<ResponseMessage> mensagensReposta = new ArrayList<ResponseMessage>();
		mensagensReposta.add(new ResponseMessageBuilder()   
				    .code(500)
				    .message("Ocorreu um erro interno")
				    .responseModel(new ModelRef("Error"))
				    .build());
		
		mensagensReposta.add(new ResponseMessageBuilder()   
			    .code(403)
			    .message("Acesso não autorizado")
			    .build());
		
		
		return mensagensReposta;
		
	}

}
