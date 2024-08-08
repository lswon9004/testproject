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
	public int getApproval_no(int empno) {
		return dao.getApproval_no(empno);
	}
	public int insertApproval(ApprovalDto dto) {
		return dao.insertApproval(dto);
	}
	public ApprovalDto oneApproval(int approval_no) {
		return dao.oneApproval(approval_no);
	}
	public int updateApproval(String approval_content,int approval_no,int approval_type) {
		return dao.updateApproval(approval_content, approval_no, approval_type);
	}
}
