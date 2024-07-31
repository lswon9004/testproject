package user.security.emp;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Empdao {
	@Select("select * from `사원 정보` where empno = #{empno}")
	EmpDto login(int empno);
	@Select("select `권한` from `직급` where `직급` = #{position}")
	int getRight(String position);
}
