package com.bezkoder.spring.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGraphqlApplication.class, args);
	}

	@Bean
  public graphql.schema.GraphQLScalarType extendedScalarLong() {
    return graphql.scalars.ExtendedScalars.GraphQLLong;
  }
}
