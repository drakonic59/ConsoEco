package ecoconso.api.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ecoconso.api.application.entity.User;
import ecoconso.api.application.service.IUserService;

@Controller
public class RegisteringController {
	
    @Autowired
    private IUserService users;
	
	@RequestMapping(value = { "/users" }, method = RequestMethod.POST)
    public @ResponseBody boolean manageSchoolsAdd(@RequestBody User user) {
		
		User u = new User();
		u.setAddress(user.getAddress());
		u.setCourses(u.getCourses());
		users.getRepository().save(u);
		return true;
        
    }
	
}
