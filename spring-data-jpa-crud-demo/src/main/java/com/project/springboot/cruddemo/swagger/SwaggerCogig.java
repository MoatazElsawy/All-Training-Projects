package com.project.springboot.cruddemo.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;
*/

@Configuration
@EnableSwagger2
public class SwaggerCogig {
	
	
	public static final Contact DEFAULT_CONTACT = new Contact("Moataz Elsawy", "https://www.facebook.com/moataz.elsawy1499", "moatazelsawy45@gmail.com");
	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Api Documentation","Api Documentation for Emplyees", "1.0", "https://www.facebook.com/moataz.elsawy1499",
	          DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");


 
	    

	@Bean public Docket postsApi() { return new
	   Docket(DocumentationType.SWAGGER_2)
	   .apiInfo(DEFAULT_API_INFO); 
	   
	   
	   
	   
	   
	   }
	
	   
	   
	   
	   
	/*
	 * @Bean public Docket postsApi() { return new
	 * Docket(DocumentationType.SWAGGER_2).groupName("public-api")
	 * .apiInfo(apiInfo()).select().paths(postPaths()).build(); }
	 * 
	 * private Predicate<String> postPaths() { return or(regex("/api/posts.*"),
	 * regex("/api/javainuse.*")); }
	 * 
	 * private ApiInfo apiInfo() { return new
	 * ApiInfoBuilder().title("JavaInUse API")
	 * .description("JavaInUse API reference for developers")
	 * .termsOfServiceUrl("http://javainuse.com")
	 * .contact("moatazelsawy45@gmail.com") .license("JavaInUse License")
	 * .licenseUrl("javainuse@gmail.com").version("1.0").build(); }
	 */

}
