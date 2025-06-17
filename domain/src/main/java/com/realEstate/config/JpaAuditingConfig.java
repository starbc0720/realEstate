package com.realEstate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@Configuration
@EnableJpaAuditing
public class JpaAuditingConfig {

    // 나중에 @CreatedBy, @LastModfiedBy 사용 시에 필요
    @Bean
    public AuditorAware<String> auditorProvider() {
        return () -> Optional.of("system"); // 또는 SecurityContext에서 사용자 ID 추출
    }
}
