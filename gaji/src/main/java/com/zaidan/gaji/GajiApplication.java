package com.zaidan.gaji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GajiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GajiApplication.class, args);
	}
        @Bean
        public RestTemplate restTemplate(){
            return new RestTemplate();
        }
}