package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoRestAppApplication.class, args);
	}

}

// Go to: Run Configurations > Arguments > VM Arguments > -Dserver.port=6060 > -Dserver.port=7777 > -Dserver.port=8888