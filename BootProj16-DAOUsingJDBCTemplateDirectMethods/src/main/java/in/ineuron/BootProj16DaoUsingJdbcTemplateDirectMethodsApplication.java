package in.ineuron;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.service.IEmployeeMangementService;

@SpringBootApplication
public class BootProj16DaoUsingJdbcTemplateDirectMethodsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication
				.run(BootProj16DaoUsingJdbcTemplateDirectMethodsApplication.class, args);

		IEmployeeMangementService service = applicationContext.getBean(IEmployeeMangementService.class);
		List<Map<String, Object>> employeeDetailsByDesignation = service.getEmployeeDetailsByDesignation("captain",
				"coach");
		employeeDetailsByDesignation.forEach(System.out::println);

		((ConfigurableApplicationContext) applicationContext).close();
	}

}