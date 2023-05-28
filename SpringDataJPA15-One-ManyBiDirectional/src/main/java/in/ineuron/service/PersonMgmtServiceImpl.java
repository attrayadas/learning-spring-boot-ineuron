package in.ineuron.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.model.Person;
import in.ineuron.model.PhoneNumber;
import in.ineuron.repo.IPersonRepo;
import in.ineuron.repo.IPhoneNumberRepo;

@Service
public class PersonMgmtServiceImpl implements IPersonMgmtService {

	@Autowired
	private IPersonRepo personRepo;

	@Autowired
	private IPhoneNumberRepo phoneRepo;

	@Override
	public String savePerson(Person person) {
		Integer idValue = personRepo.save(person).getPid();
		return "Person and his phone numbers are saved with id value: " + idValue;
	}

	@Override
	public String savePhoneNumbers(Iterable<PhoneNumber> numbers) {
		for (PhoneNumber phoneNumber : numbers) {
			phoneRepo.save(phoneNumber);
		}
		return "No. of phone numbers saved are: " + ((Set<PhoneNumber>) numbers).size();
	}

}
