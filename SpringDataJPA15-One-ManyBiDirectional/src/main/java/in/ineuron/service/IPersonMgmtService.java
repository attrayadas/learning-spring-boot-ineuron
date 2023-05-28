package in.ineuron.service;

import in.ineuron.model.Person;
import in.ineuron.model.PhoneNumber;

public interface IPersonMgmtService {

	public String savePerson(Person person);

	public String savePhoneNumbers(Iterable<PhoneNumber> numbers);
}
