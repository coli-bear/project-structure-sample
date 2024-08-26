package de.v.gom.package_struct.config;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.security.ConditionalOnDefaultWebSecurity;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Security Configuration
 *
 * 해당 클래스는 Spring Security 설정을 위한 클래스입니다.
 * - {@link ConditionalOnDefaultWebSecurity} 어노테이션을 사용하여 기본적인 웹 보안 설정이 적용되어 있는지 확인합니다.
 * - 만약 기본적인 웹 보안 설정이 적용되어 있지 않다면 해당 클래스가 빈으로 등록되지 않습니다.
 * - 다시말해 `org.springframework.boot:spring-boot-starter-security` 의존성이 추가되지 않으면 Bean으로 등록되지 않습니다.
 */
@Slf4j
@Configuration
@ConditionalOnDefaultWebSecurity
public class SecurityConfig {
    @PostConstruct
    public void postConstruct() {
        log.info("[Security][Initialize]Spring SecurityConfig Bean Created");
        log.info(">> this bean is created only when spring-boot-starter-security is added");
    }
}
