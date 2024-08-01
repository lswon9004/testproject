package user.security.emp;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface Empdao {
	@Select("select * from emp where empno = #{empno}")
	EmpDto login(int empno);
	@Select("select authority from position where position = #{position}")
	int getRight(String position);
	@Update("update emp set loginCount  = #{loginCount}")
	int loginCount(int loginCount);
	@Select("select loginCount from emp where empno = #{empno}")
	int getLoginCount(int empno);
}
