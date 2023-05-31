package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRegisteryEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRegisteryEurekaServerApplication.class, args);
	}

}

// Go to: http://localhost:8761/