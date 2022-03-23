package org.riot.apicore.config;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.OperationsSorter;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;

/**
 * 사용중인 Spring boot Version과 호환되지 않아 에러 발생.
 */
// @Configuration
// @EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket api(){
		System.out.println("swagger in");
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("org.riot"))
				.paths(PathSelectors.regex("(?!/error.*).*"))
				.paths(PathSelectors.any())
				.build()
				.useDefaultResponseMessages(false)
				.apiInfo(apiInfo());
	}

	ApiInfo apiInfo() {
		return new ApiInfoBuilder() 
				.title("RIOT API")
				.description("Riot Data 제공")
				.termsOfServiceUrl("localhost:8080/")
				.version("1.0.0")
				.build();
	}

	@Bean
	UiConfiguration uiconfig() {
		return UiConfigurationBuilder
				.builder().operationsSorter(OperationsSorter.ALPHA)
				.build();
	}

}
