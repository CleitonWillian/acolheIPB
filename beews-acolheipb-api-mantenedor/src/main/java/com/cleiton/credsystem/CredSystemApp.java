package com.cleiton.credsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sun.xml.internal.ws.util.StringUtils;

@SpringBootApplication
public class CredSystemApp {

	@SuppressWarnings("restriction")
	public static void main(String[] args) {
		System.out.println(StringUtils.capitalize("ID_TESTE_CARRO"));
		SpringApplication.run(CredSystemApp.class, args);
	}
}
