package mx.edu.utez.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "mx.edu.utez.hospital.repository")
public class ConsultorioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsultorioApplication.class, args);
	}

}