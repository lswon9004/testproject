package user.security.emp;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface Empdao {
	@Select("select * from `사원 정보` where empno = #{empno}")
	EmpDto login(int empno);
	@Select("select `권한` from `직급` where `직급` = #{position}")
	int getRight(String position);
	@Update("update `사원 정보` set loginCount  = #{loginCount}")
	int loginCount(int loginCount);
	@Select("select loginCount from `사원 정보` where empno = #{empno}")
	int getLoginCount(int empno);
}
