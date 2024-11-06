package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.bean.UserData;

@Controller
public class Coontroller {
	@RequestMapping(value = "/show",method = RequestMethod.GET)
	public String show()
	{
		return "UserRegister";
	}
	@PostMapping("/obj")
	
	public String getdata(
			@ModelAttribute UserData userdata,
			Model model
			)
	
	{
		System.out.println(userdata);
		model.addAttribute("obj",userdata);
		return "Data";
	}

}
