package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootMvcProj1DisplayingHomePageApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(BootMvcProj1DisplayingHomePageApplication.class,
				args);
		System.out.println("Container name is: " + applicationContext.getClass().getName());
		

	}

}

//Output:
//	Container name is: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext

//Request:
//	http://localhost:8080/FirstApp/index.jsp