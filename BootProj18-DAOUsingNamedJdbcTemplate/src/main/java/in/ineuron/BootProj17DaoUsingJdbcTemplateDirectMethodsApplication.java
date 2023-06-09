package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import in.ineuron.dto.EmployeeDTO;
import in.ineuron.service.IEmployeeMgmtService;

@SpringBootApplication
public class BootProj17DaoUsingJdbcTemplateDirectMethodsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication
				.run(BootProj17DaoUsingJdbcTemplateDirectMethodsApplication.class, args);

		IEmployeeMgmtService service = applicationContext.getBean(IEmployeeMgmtService.class);
		System.out.println(service);

		String name = null;
		int id = 12;
		try {
			name = service.fetchEmployeeByNo(id);
			System.out.println(name);

			service.fetchEmployeeByDesg("coach", "keeper", "allrounder").forEach(System.out::println);

			EmployeeDTO dto = new EmployeeDTO();
			dto.setDesg("umpire");
			dto.setEaddress("RCB");
			dto.setEage(75);
			dto.setEname("Dravid");
			dto.setSalary(4000);
			String status = service.registerEmployee(dto);
			System.out.println(status);

		} catch (DataAccessException e) {
			System.out.println("Record not available for the given id:: " + id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		((ConfigurableApplicationContext) applicationContext).close();
	}

}