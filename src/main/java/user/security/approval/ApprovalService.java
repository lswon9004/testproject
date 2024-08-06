package user.security.approval;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApprovalService {
	@Autowired
	ApprovalDao dao;
	
	public int Acount(int empno) {
		return dao.Acount(empno);
	}
	public List<ApprovalDto> alist(int empno){
		return dao.alist(empno);
	}
}
