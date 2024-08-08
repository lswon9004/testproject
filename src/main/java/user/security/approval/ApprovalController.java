package user.security.approval;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

import user.security.emp.EmpDto;
import user.security.emp.EmpService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@SessionAttributes("user")
public class ApprovalController {
	@ModelAttribute("user")
	   public EmpDto getDto() {
	      return new EmpDto();
	   }
	@Autowired
	ApprovalService aService;
	@Autowired
	EmpService eService;
	@GetMapping("/approvalWrite")
	public String approvalWrite(@ModelAttribute("user")EmpDto dto, Model m) {
		int approval_no = aService.getApproval_no(dto.getEmpno());
		List<Integer> elist = eService.getNoList(dto.getDeptno());
		m.addAttribute("elist", elist);
		m.addAttribute("approval_no", approval_no);
		return "/approvalWrite";
	}
	@PostMapping("/approval/insert")
	public String insert(ApprovalDto dto,@ModelAttribute("user")EmpDto edto) {
		
		dto.setEmpno(edto.getEmpno());
		dto.setDeptno(edto.getDeptno());
		aService.insertApproval(dto);
		return "redirect:/approval/"+edto.getEmpno();
	}
	@GetMapping("/approval/content/{no}")
	public String content(@PathVariable("no")int no, Model m) {
		ApprovalDto dto = aService.oneApproval(no);
		m.addAttribute("dto", dto);
		return "/approval/content";
	}
	@GetMapping("/approval/update/{no}")
	public String updatecontent(@PathVariable("no")int no, Model m) {
		ApprovalDto dto = aService.oneApproval(no);
		m.addAttribute("dto", dto);
		return "/approval/upadte";
	}
	@PostMapping("/approval/update/{no}")
	public String update(@PathVariable("no")int no,@ModelAttribute("user")EmpDto edto,
						 @RequestParam("approval_type")int approval_type,@RequestParam("approval_content")String approval_content) {
		aService.updateApproval(approval_content, no, approval_type);
		System.out.println(no);
		System.out.println(approval_content);
		System.out.println(approval_type);
		return"redirect:/approval/"+edto.getEmpno();
	}
}
