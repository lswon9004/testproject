package user.security.emp;

import java.util.Date;

import lombok.Data;
import user.security.attendance.Attendance;
@Data
public class EmpDto {
	int empno;
	int deptno;
	String email;
	String ename;
	int sal;
	String address;
	String detailAddr;
	boolean approval;
	String jop;
	String password;
	Date hiredate;
	String position;
	int right;
	int annual;
	String imgPath;
	Date birthday;
	String memo;
	int loginCount;
	Attendance att;
	
}
