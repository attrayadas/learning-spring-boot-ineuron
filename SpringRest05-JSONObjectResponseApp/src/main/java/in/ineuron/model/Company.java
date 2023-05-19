package in.ineuron.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Company {
	private String cname;
	private String ctype;
	private String caddress;
	private Integer size;

}
