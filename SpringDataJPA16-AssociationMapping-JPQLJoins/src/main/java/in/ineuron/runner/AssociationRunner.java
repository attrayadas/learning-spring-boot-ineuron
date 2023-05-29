package in.ineuron.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ineuron.service.IPersonMgmtService;

@Component
public class AssociationRunner implements CommandLineRunner {

	@Autowired
	private IPersonMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		service.fetchDataByJoinsUsingParent().forEach(row->{
			for (Object obj : row) {
				System.out.print(obj+" ");
			}
			System.out.println();
		});
	}

}
