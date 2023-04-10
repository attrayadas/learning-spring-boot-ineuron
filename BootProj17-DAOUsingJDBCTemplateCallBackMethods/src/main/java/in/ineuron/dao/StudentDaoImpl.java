package in.ineuron.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.StudentBO;

@Repository
public class StudentDaoImpl implements IStudentDao {

	private static final String GET_STUDENT_BY_NO = "SELECT SID, SNAME, AVG, SADDRESS FROM STUDENT WHERE SID=?";

	private static final String GET_STUDENT_BY_NAME = "SELECT SID, SNAME, AVG, SADDRESS FROM STUDENT WHERE SNAME IN (?, ?)";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public StudentBO getStudentByNo(int sno) {
		return jdbcTemplate.queryForObject(GET_STUDENT_BY_NO, new BeanPropertyRowMapper<StudentBO>(StudentBO.class),
				sno);
	}

	@Override
	public List<StudentBO> getStudentByName(String name1, String name2) {
		return jdbcTemplate.query(GET_STUDENT_BY_NAME, (rs, num) -> {
			System.out.println("StudentDaoImpl.StudentRowMapper.mapRow()");
			StudentBO bo = null;
			bo = new StudentBO();
			bo.setSid(rs.getInt(1));
			bo.setSname(rs.getString(2));
			bo.setAvg(rs.getFloat(3));
			bo.setSaddress(rs.getString(4));
			return bo;
		}, name1, name2);
	}

}
