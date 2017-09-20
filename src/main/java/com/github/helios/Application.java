package com.github.helios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.ReactiveMongoClientFactoryBean;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@Configuration
@EnableMongoAuditing
@EnableReactiveMongoRepositories
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    /*
     * Factory bean that creates the com.mongodb.reactivestreams.client.MongoClient instance
     */
    public @Bean
    ReactiveMongoClientFactoryBean mongoClient() {
        ReactiveMongoClientFactoryBean clientFactory = new ReactiveMongoClientFactoryBean();
        clientFactory.setHost("localhost");
        return clientFactory;
    }
}