package in.ineuron;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.service.ICoronaVaccineMgmtService;

@SpringBootApplication
public class DaoSpringDataJpa01Application {

	public static void main(String[] args) {

		ApplicationContext factory = SpringApplication.run(DaoSpringDataJpa01Application.class, args);
		ICoronaVaccineMgmtService service = factory.getBean(ICoronaVaccineMgmtService.class);

//		CoronaVaccine vaccine = new CoronaVaccine("Coronil", "Patanjali", "IND", 450.0, 1);

//		CoronaVaccine vaccine = new CoronaVaccine();
//		vaccine.setPrice(350.0);

//		service.searchVaccinesByGivenData(vaccine, true, "price").forEach(System.out::println);

//		try {
//			CoronaVaccine vaccine = service.getVaccineById(3L);
//			if (vaccine != null) {
//				System.out.println("vaccine details are :: " + vaccine);
//			} else {
//				System.out.println("Record not available for the given id");
//			}
//		} catch (DataAccessException e) {
//			System.out.println(e.getMessage());
//		}

		List<Long> list = new ArrayList<Long>();
		list.add(9L);
		list.add(7L);
		list.add(8L);
		String status = service.removeVaccinesByRegNo(list);
		System.out.println(status);

		((ConfigurableApplicationContext) factory).close();
	}
}
