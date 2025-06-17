package com.realEstate.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("부동산 API")
                        .version("1.0")
                        .description("부동산 어플리케이션 동작을 편리하게 보기 위한 Swagger UI 입니다. ")
                );
    }
}
