package user.security.attendance;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

@Controller
public class AttendanceController {
	@Autowired
	AttendanceService service;
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
	Gson gson = new Gson();
	@GetMapping("/startTime")
	@ResponseBody
	public String startTime(@RequestParam("empno")int empno, @RequestParam("deptno")int deptno) {
		Date startTime = service.startTime(empno);
		String formattedDate = null;
		if(startTime==null) {
			service.insertStartTmie(empno, deptno);
			startTime = service.startTime(empno);
			formattedDate = sdf.format(startTime);
		}		
		return gson.toJson(formattedDate);
	}
	@GetMapping("/endTime")
	@ResponseBody
	public String endTime(@RequestParam("empno")int empno) {
		Date endtime = service.endTime(empno);
		return gson.toJson(sdf.format(endtime));
	}
}
