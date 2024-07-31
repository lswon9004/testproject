package user.security.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestBody;


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
	public String login(@RequestParam("no") int no, @RequestParam("pw") String password) {

		Gson gson = new Gson();
		String result = "";
		EmpDto dto = service.login(no);
		if (dto == null) {
			result = "/";
		} else {
			if (service.getCount(no) > 4) {
				result = "/findpw";
			} else {
				if (dto.password.equals(password)) {
					service.loginCount(0);
					if (noCheck(dto.position) < 3) {
						result = "/main";
					} else {
						result = "/adminMain";
					}
				} else {
					result = "/";
					service.loginCount(dto.loginCount + 1);
				}
			}
		}

		return gson.toJson(result);
	}

	@GetMapping("/main")
	public void main() {

	}

	@GetMapping("/adminMain")
	public void adminMain() {

	}

	@GetMapping("/findpw")
	public void findpw() {

	}
	
	@PostMapping("/findpw")
	public String postMethodName() {
		service.loginCount(0);		
		return "/loginform";
	}
	@GetMapping("/loginform")
	public void getMethodName() {
	}
	
	
}
