package in.ineuron.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import in.ineuron.bo.CoronaVaccine;

public interface ICoronaVaccineRepo extends CrudRepository<CoronaVaccine, Long> {

	public List<CoronaVaccine> findByCompany(String company);

	public List<CoronaVaccine> findByCompanyEquals(String company); // same method as above

	public List<CoronaVaccine> findByCompanyIs(String company); // same method as above

	public List<CoronaVaccine> findByPriceLessThan(Double price);

	public List<CoronaVaccine> findByCountryInAndPriceBetween(Collection<String> countries, double startRange,
			double endRange);

	public List<CoronaVaccine> findByCountryNotIn(Collection<String> countries);
}
