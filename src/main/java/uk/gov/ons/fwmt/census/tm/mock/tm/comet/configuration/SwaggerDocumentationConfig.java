package uk.gov.ons.fwmt.census.tm.mock.tm.comet.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-07T11:49:58.389925Z[Europe/London]")

@Configuration
public class SwaggerDocumentationConfig {
  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.any())
        // the line below is the old selector, which limits access heavily, preventing the use of the mock monitoring endpoint
        // .apis(RequestHandlerSelectors.basePackage("uk.gov.ons.fwmt.census.tm.mock.tm.comet.api"))
        .paths(PathSelectors.any())
        .build()
        .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
        .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
        .apiInfo(apiInfo());
  }

  ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("Totalmobile Comet Cases")
        .description(
            "No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)")
        .license("")
        .licenseUrl("http://unlicense.org")
        .termsOfServiceUrl("")
        .version("v1")
        .contact(new Contact("", "", ""))
        .build();
  }

}
