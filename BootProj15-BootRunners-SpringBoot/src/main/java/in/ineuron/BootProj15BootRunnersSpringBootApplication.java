package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootProj15BootRunnersSpringBootApplication {

	public static void main(String[] args) {
		System.out.println("****Container started****");
		ApplicationContext applicationContext = SpringApplication.run(BootProj15BootRunnersSpringBootApplication.class, args);
		System.out.println("****Container stopped****");
		((ConfigurableApplicationContext) applicationContext).close();
	}

}