package ma.isga.depot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FondsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FondsApplication.class, args);
	}

}
