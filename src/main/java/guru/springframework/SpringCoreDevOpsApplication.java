package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreDevOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDevOpsApplication.class, args);

		System.out.println("Should trigger jenkins build - again - I think it was a problem with AWS Security Groups");

	}
}
