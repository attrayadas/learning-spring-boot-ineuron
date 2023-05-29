package in.ineuron.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@AllArgsConstructor
@Table(name = "OTM_PERSON")
@RequiredArgsConstructor
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;

	@NonNull
	private String pname;

	@NonNull
	private String paddess;

	@OneToMany(targetEntity = PhoneNumber.class, cascade = CascadeType.ALL, mappedBy = "person", fetch = FetchType.EAGER)
	private Set<PhoneNumber> contactDetails;

	Person() {
		System.out.println("Person 0 param constructor :: " + this.getClass());
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddess=" + paddess + "]";
	}
}
