package co.edu.unilibre.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LaboratoriesServiceProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaboratoriesServiceProductsApplication.class, args);
	}

}
