package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsSleuthZipkinAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSleuthZipkinAppApplication.class, args);
	}

}

//Before running this, make sure to start the Zipkin server:
//	To start the Zipkin server, download the jar file and cmd: java -jar zipkin-server-2.24.2-exec.jar
