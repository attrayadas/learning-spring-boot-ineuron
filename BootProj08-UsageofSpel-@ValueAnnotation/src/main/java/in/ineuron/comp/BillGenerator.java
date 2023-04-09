package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bill")
public class BillGenerator {

	@Value("#{info.idlyPrice+info.vadaPrice+info.dosaPrice}")
	private Float billAmount; //SPEL[SpringExpressionLanguage] is used

	@Value("A2B")
	private String hotelName;

	@Autowired
	private ItemsInfo info;

	@Override
	public String toString() {
		return "BillGenerator [billAmount=" + billAmount + ", hotelName=" + hotelName + ", info=" + info + "]";
	}

}
