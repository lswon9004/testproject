package user.security.approval;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApprovalController {
	
	@Autowired
	ApprovalService aService;
	@GetMapping("/approvalWrite")
	public String approvalWrite() {
		return "/approvalWrite";
	}
}
