package com.example.joke.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI jokeOpenApi(@Value("{openapi.app.description}") String description,
							   @Value("{aplication-version}") String version,
							   @Value("{aplication-title}") String title
							   ){
		return new OpenAPI()
				.info(new Info()
						.description("This api includes joke operations for Joke project")
						.version("2.2.2.2")
						.title("Joke Api")
						);
	}



	}


