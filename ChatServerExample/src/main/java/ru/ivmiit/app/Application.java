package ru.ivmiit.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 14.10.2017
 * Application
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@SpringBootApplication
@ComponentScan("ru.ivmiit")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
