package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.Employee;

@SpringBootApplication
public class BootProj06ConfigurationPropertiesAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootProj06ConfigurationPropertiesAppApplication.class, args);
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);
		((ConfigurableApplicationContext) context).close();
	}

}

//Output:
//	Employee [name=sachin, id=10, company=Company [name=MI, location=Bandra, size=35], skillSets=[java, jee, ORM, SpringBoot], projectNames=[IND, World1X, Mumbai, Asia1X], mobileNumbers=[9997778886, 6667778889, 5556667776], idDetails={adharNo=7645345, panNo=232345, voterId=2323454}]