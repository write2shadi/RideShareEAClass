package mum.ea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mum.ea.RideshareApplication;
import mum.ea.model.User;
import mum.ea.service.UserService;
import mum.ea.service.impl.UserServiceImpl;

@Controller
public class UserController {

	
	private UserService userService;
	
	public UserController(){
	   userService = 
			   (UserService) RideshareApplication.xmlContext.getBean("userService");
	}
	
	 @RequestMapping(value = { "/register" }, method = RequestMethod.GET)
	    public String registerNewUser(Model model) {
	    
		 return "registerUser";
	   }
	 
	 @RequestMapping(value = { "/register" }, method = RequestMethod.POST)
	    public String registerNewUser(@Validated User dataItem, BindingResult result) {

		 String view = "redirect:/dashboard";
		 
		 if(!result.hasErrors()){
			 userService.registerUser(dataItem);
			 // redirectAttr.addFlashAttribute("message" , "User was added and given id:" + dataItem.getId());
		 }else{
			 view = "registerUser";
		 }
			 
		 return view;
	   }	 
	 
	 @RequestMapping(value = { "/dashboard" }, method = RequestMethod.GET)
	    public String dashbaord(Model model) {
	    
		 return "dashboard";
	   }
}
