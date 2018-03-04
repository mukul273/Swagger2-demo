package com.swagger.springboot.swaggerdemo.config;

import javax.validation.constraints.Null;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.swagger.springboot.swaggerdemo"))
				.paths(PathSelectors.ant("/rest/*"))
				.build()// Until here its all standard configuration..from this line onwards customization starts.
				.apiInfo(getApiInfo());
	}

	private ApiInfo getApiInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"Chimps Swagger Demo - title", 
				"Chimp says this is swagger Demo - Description", 
				"Chimps swagger demo - version", 
				"Chimps swagger demo has NO termsOfServiceUrl", 
				"Chimps Swagger demo has contactName", 
				"Chimps Swagger demo has NO license", 
				"Chimps swagger Demo obviously has no licenseUrl");
		return apiInfo;
	}
}
