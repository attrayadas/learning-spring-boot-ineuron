package in.ineuron;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.dto.StudentDTO;
import in.ineuron.service.IStudentMgmtService;

@SpringBootApplication
public class BootProj17DaoUsingJdbcTemplateDirectMethodsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication
				.run(BootProj17DaoUsingJdbcTemplateDirectMethodsApplication.class, args);

		IStudentMgmtService service = applicationContext.getBean(IStudentMgmtService.class);

		StudentDTO student = service.fetchStudentByNo(1);
		System.out.println(student);

		System.out.println();

		List<StudentDTO> list = service.fetchStudentByName("sachin", "dhoni");
		list.forEach(System.out::println);

		System.out.println();

		service.fetchStudentByCities("CSK", "LSG", "Ranchi").forEach(System.out::println);

		((ConfigurableApplicationContext) applicationContext).close();
	}

}

//Output:
//	StudentDTO [sno=0, grade=A, srNo=1, sname=Attraya, saddress=Bokaro, avg=87.0]
//
//	StudentDaoImpl.StudentRowMapper.mapRow()
//	StudentDaoImpl.StudentRowMapper.mapRow()
//	StudentDTO [sno=0, grade=A, srNo=1, sname=Dhoni, saddress=Ranchi, avg=45.0]
//	StudentDTO [sno=0, grade=A, srNo=2, sname=Sachin, saddress=Mumbai, avg=54.0]
//
//	StudentDTO [sno=0, grade=A, srNo=1, sname=Dhoni, saddress=Ranchi, avg=45.0]
//	StudentDTO [sno=0, grade=B, srNo=2, sname=Raydu, saddress=CSK, avg=35.0]
//	StudentDTO [sno=0, grade=C, srNo=3, sname=Rahane, saddress=CSK, avg=34.0]
//	StudentDTO [sno=0, grade=C, srNo=4, sname=Jadeja, saddress=CSK, avg=31.0]
//	StudentDTO [sno=0, grade=C, srNo=5, sname=Mayer, saddress=LSG, avg=32.0]