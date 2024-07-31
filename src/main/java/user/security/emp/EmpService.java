package user.security.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
	@Autowired
	Empdao dao;
	
	public EmpDto login(int no) {
		return dao.login(no);
	}
	public int getRight(String position) {
		return dao.getRight(position);
	}
}
