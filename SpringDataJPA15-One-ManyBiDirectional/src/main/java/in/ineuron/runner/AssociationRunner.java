package in.ineuron.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ineuron.model.Person;
import in.ineuron.model.PhoneNumber;
import in.ineuron.service.IPersonMgmtService;

@Component
public class AssociationRunner implements CommandLineRunner {

	@Autowired
	private IPersonMgmtService service;

	@Override
	public void run(String... args) throws Exception {

		/* Save Operation Parent to Child */

//		// Create a parent object
//		Person person = new Person("Chandrakala", "GT");
//
//		// Create a child object
//		PhoneNumber p1 = new PhoneNumber(1212121212L, "Reliance", "residence");
//		PhoneNumber p2 = new PhoneNumber(2121212121L, "Jio", "office");
//		
//		// Link parent to child
//		p1.setPerson(person);
//		p2.setPerson(person);
//
//		Set<PhoneNumber> contactDetails = Set.of(p1, p2);
//
//		// Link child to parent
//		person.setContactDetails(contactDetails);
//
//		System.out.println(service.savePerson(person));

		/* Save operation Child to Parent */

//		PhoneNumber p1 = new PhoneNumber(7070707070L, "DOCOMO", "office");
//		PhoneNumber p2 = new PhoneNumber(5050505050L, "Indocom", "business");
//
//		Person person = new Person("Hyder Abbas", "BLR");
//		p1.setPerson(person);
//		p2.setPerson(person);
//
//		Set<PhoneNumber> phoneSet = Set.of(p1, p2);
//		person.setContactDetails(phoneSet);
//		System.out.println(service.savePhoneNumbers(phoneSet));

		/* Load Operation from Parent to Child (One to Many) */

//		service.fetchByPerson().forEach(person -> {
//			System.out.println("Parent ::" + person);
//			Set<PhoneNumber> childs = person.getContactDetails();
//			childs.forEach(contact -> {
//				System.out.println("	Child ::" + contact);
//			});
//		});

		/* Load Operation from Child to Parent (Many to One) */

//		System.out.println();
//		service.fetchByPhoneNumber().forEach(phone -> {
//			System.out.println("Child ::" + phone);
//			Person person = phone.getPerson();
//			System.out.println("	"+person);
//		});

		/* Delete Operation from Parent to Child */

//		System.out.println(service.deleteByPerson(1));
		
		System.out.println(service.deleteAllPhoneNumbersOfAPerson(2));
	}

}
