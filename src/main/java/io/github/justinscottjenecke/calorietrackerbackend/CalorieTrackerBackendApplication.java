package io.github.justinscottjenecke.calorietrackerbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CalorieTrackerBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalorieTrackerBackendApplication.class, args);
	}
}
