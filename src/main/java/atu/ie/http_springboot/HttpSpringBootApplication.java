package atu.ie.http_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HttpSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HttpSpringBootApplication.class, args);
    }

}
