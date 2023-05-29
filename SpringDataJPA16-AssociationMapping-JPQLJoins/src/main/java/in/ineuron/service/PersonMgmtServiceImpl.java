package in.ineuron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.repo.IPersonRepo;
import in.ineuron.repo.IPhoneNumberRepo;

@Service
public class PersonMgmtServiceImpl implements IPersonMgmtService {

	@Autowired
	private IPersonRepo personRepo;

	@Autowired
	private IPhoneNumberRepo phoneRepo;

	@Override
	public List<Object[]> fetchDataByJoinsUsingParent() {
		return personRepo.fetchDataUsingJoinsByParent();
	}

	

}
