package hello;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
    @RequestMapping("/student")
        public String studentdetails(@RequestParam(value="name", defaultValue="Student") String name) {
    	    	
    	SpreadsheetData spreadSheetService = new SpreadsheetData();
    	StudentService studentService = new StudentService();
    	try {
			String values = spreadSheetService.getSheetData("1Zy90ZL5RnCcF728PbbeGi_lUHs02EULjU1KJyHj4FXQ");
			String result = studentService.getStudentData(values, name);
			return result;
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
		
    }
}
