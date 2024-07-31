package user.security.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.google.gson.Gson;

@Controller
@SessionAttributes("user")
public class EmpController {
	
	@Autowired
	EmpService service;
		
	public int noCheck(String position) {
		return service.getRight(position);
	}
	@GetMapping("/login")
	@ResponseBody
	public String login(@RequestParam("no")int no,@RequestParam("pw")String password) {
		int i = 0;
		Gson gson = new Gson();
		String result = "";
		EmpDto dto = service.login(no);
		if (dto.password.equals(password)) {
			i = noCheck(dto.position);
			if(i<3) {
				result = "/main";
			}else {
				result = "/adminMain";
			}
		}else {
			result = "/";
		}
		
		
		return gson.toJson(result);
	}
	@GetMapping("/main")
	public void main() {
		
	}
	@GetMapping("/adminMain")
	public void adminMain() {
		
	}
}
