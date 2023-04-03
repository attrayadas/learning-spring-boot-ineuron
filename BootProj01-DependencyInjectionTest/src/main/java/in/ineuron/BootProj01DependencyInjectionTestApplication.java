package in.ineuron;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import in.ineuron.comp.WishMessageGenerator;

@SpringBootApplication
public class BootProj01DependencyInjectionTestApplication {

	static {
		System.out.println("BootProj01DependencyInjectionApplication.class file loading...");
	}

	public BootProj01DependencyInjectionTestApplication() {
		System.out.println("BootProj01DependencyInjectionApplication :: Zero param constructor...");
	}

	@Bean
	public LocalDateTime createLocalDateTimeObj() {
		System.out.println("BootProj01DependencyInjectionApplication.createLocalDateTimeObj()");
		LocalDateTime ldt = LocalDateTime.now();
		return ldt;
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootProj01DependencyInjectionTestApplication.class, args);
		System.out.println("Implementation class is :: " + context.getClass().getName());

		System.out.println("******Container started******\n");
		WishMessageGenerator wmg = context.getBean(WishMessageGenerator.class);
		String msg = wmg.generateWishMessage("Attraya");
		System.out.println(msg);

		System.out.println("Bean id are ::" + Arrays.toString(context.getBeanDefinitionNames()));

		((ConfigurableApplicationContext) context).close();
		System.out.println("\n******Container stopped******");
	}

}
