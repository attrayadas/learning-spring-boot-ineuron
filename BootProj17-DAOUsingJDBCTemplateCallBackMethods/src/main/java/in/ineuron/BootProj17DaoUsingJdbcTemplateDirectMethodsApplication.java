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
		System.out.println("============");
		List<StudentDTO> list = service.fetchStudentByName("sachin", "Dhoni");
		list.forEach(System.out::println);

		((ConfigurableApplicationContext) applicationContext).close();
	}

}

//Output:
//	StudentDaoImpl.StudentMapper.mapRow()
//	StudentBO [sid=1, sname=Attraya, saddress=Bokaro, avg=87.0]
//	StudentDTO [sno=0, grade=A, srNo=1, sname=Attraya, saddress=Bokaro, avg=87.0]
//	============
//	StudentDaoImpl.StudentRowMapper.mapRow()
//	StudentDaoImpl.StudentRowMapper.mapRow()
//	StudentDTO [sno=0, grade=A, srNo=1, sname=Dhoni, saddress=Ranchi, avg=45.0]
//	StudentDTO [sno=0, grade=A, srNo=2, sname=Sachin, saddress=Mumbai, avg=54.0