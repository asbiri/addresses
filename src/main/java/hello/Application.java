package hello;

import com.mongodb.Mongo;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoTemplate;

@ComponentScan
@EnableAutoConfiguration
public class Application {


    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(new Mongo("localhost:27017"), "addresses");

    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}