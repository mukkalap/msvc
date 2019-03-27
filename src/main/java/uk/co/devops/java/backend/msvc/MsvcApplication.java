package uk.co.devops.java.backend.msvc;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@EnableAutoConfiguration
public class MsvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsvcApplication.class, args);

	}

}
