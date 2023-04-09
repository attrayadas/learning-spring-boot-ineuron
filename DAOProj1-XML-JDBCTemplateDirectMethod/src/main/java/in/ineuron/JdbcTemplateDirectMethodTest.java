//Explores various JdbcTemplate methods to perform CRUD Operations

package in.ineuron;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.service.IEmployeeMangementService;

public class JdbcTemplateDirectMethodTest {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");

		IEmployeeMangementService service = applicationContext.getBean(IEmployeeMangementService.class);

		try {
			int recordCount = service.fetchEmpsCount();
			System.out.println("No of records are :: " + recordCount);

			String ename = service.getEmployeeNameByNo(2);
			System.out.println("Employee name is :: " + ename);

			Map<String, Object> empDetails = service.getEmployeeDetailsByNo(5);
			System.out.println("Employee details are :: " + empDetails);

			service.getEmployeeDetailsByDesignation("captain", "keeper").forEach(System.out::println);

			int insertEmp = service.insertEmp("Rashid", 24, "Gujarat", "bowler", 5000);
			System.out.println("No. of record(s) inserted :: " + insertEmp);

			int rowForUpdation = service.addBonusToEmpByDesg("bowler", 1005);
			System.out.println("No. of record(s) updated :: " + rowForUpdation);

		} catch (Exception e) {
			System.out.println("The Exception message is :: " + e.getMessage());
		} finally {
		}

		((ConfigurableApplicationContext) applicationContext).close();

	}
}
