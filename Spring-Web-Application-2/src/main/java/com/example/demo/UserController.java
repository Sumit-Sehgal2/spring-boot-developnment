package com.example.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@RequestMapping(value = "/path",method = RequestMethod.GET)
	public String showUser(Map<String,Object> model)
	{
		System.out.println(model.getClass().getName());
//		model.addAttribute("uname","sumit Sehgal");
//		model.addAttribute("cname","springboot");
		model.put("uname","sumit Sehgal");
		model.put("cname","microservices");
		// this is also a pattern but now day its not being in used
		//and also we cam use model map
		
		return "Home";
	}
	@RequestMapping(value = "/obj",method = RequestMethod.GET)
	public String getobj(Model model)
	{
		UserData useer=new UserData(12,"sahil bhist","ge-23111");
		model.addAttribute("obj",useer);
		return "UserData";
		
	}
	
	

}
