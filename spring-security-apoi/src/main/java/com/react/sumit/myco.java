package com.react.sumit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class myco {
	
	@Autowired
	private Usersrepo userrepo;
	@Autowired
	private PasswordEncoder password;
	@PostMapping("/login")
	public String login(@RequestParam String username,@RequestParam String  password,Model model)
	{
	Users user=	userrepo.findByemail(username);
	
	if(user!=null&& this.password.matches(password,user.getPassword()))
	{
		return "index";
	}
	else
	{
		 model.addAttribute("error", "Invalid username or password");
         return "login"; // Return to login page with error
	}
		
	}

}
