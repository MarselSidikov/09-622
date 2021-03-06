package ru.ivmiit.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 14.10.2017
 * Application
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@SpringBootApplication
@ComponentScan("ru.ivmiit")
@EnableJpaRepositories(basePackages = "ru.ivmiit.repositories")
@EntityScan(basePackages = "ru.ivmiit.models")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
