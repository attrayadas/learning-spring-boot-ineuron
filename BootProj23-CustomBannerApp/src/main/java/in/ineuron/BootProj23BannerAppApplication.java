package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootProj23BannerAppApplication {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		SpringApplication application = new SpringApplication();
		ConfigurableApplicationContext context = application.run(BootProj23BannerAppApplication.class, args);
		context.close();
	}

}

//Output:
//	 _____ _____ _____ _____ _____ __ __ _____ 
//	 |  _  |_   _|_   _| __  |  _  |  |  |  _  |
//	 |     | | |   | | |    -|     |_   _|     |
//	 |__|__| |_|   |_| |__|__|__|__| |_| |__|__|
//
//
//	 [2m2023-05-27 17:16:33.288[0;39m [32m INFO[0;39m [35m16420[0;39m [2m---[0;39m [2m[           main][0;39m [36mi.i.BootProj23BannerAppApplication      [0;39m [2m:[0;39m Starting BootProj23BannerAppApplication using Java 16.0.2 on DESKTOP-JND6QN9 with PID 16420 (C:\Users\Attraya\Documents\Learning-Spring-Boot1\BootProj23-BannerApp\target\classes started by Attraya in C:\Users\Attraya\Documents\Learning-Spring-Boot1\BootProj23-BannerApp)
//	 [2m2023-05-27 17:16:33.291[0;39m [32m INFO[0;39m [35m16420[0;39m [2m---[0;39m [2m[           main][0;39m [36mi.i.BootProj23BannerAppApplication      [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
//	 [2m2023-05-27 17:16:33.801[0;39m [32m INFO[0;39m [35m16420[0;39m [2m---[0;39m [2m[           main][0;39m [36mi.i.BootProj23BannerAppApplication      [0;39m [2m:[0;39m Started BootProj23BannerAppApplication in 0.908 seconds (JVM running for 1.769)
