package com.apirest.confrariaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class ConfrariawsApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(ConfrariawsApplication.class, args);
			System.out.println("Ola mundo com webflux!!! ");
		} catch(Exception e) {
			System.out.println("Excessão: "+e.getMessage());
		}

//		Flux<String> colorFlux = Flux.just("black", "white", "blue");
//
//			colorFlux
//				.log()
//				.map(String::toUpperCase);		
//		
//		System.out.println("Ola mundo, to aqui !");
	}

}
