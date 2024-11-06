package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.bean.user;

@Controller
public class controller {
	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public String show(Model  model)
	
	{
		model.addAttribute("uname","sumit sehgal");
		model.addAttribute("cname","Springboot");
		return "UserHome";
	}
	@RequestMapping(value = "/obj",method = RequestMethod.GET)
	public String showobj(Model model)
	{
		user us=new user(10,"Sumit Sehgal","ters-23");
		model.addAttribute("obj",us);
       List<user>list=Arrays.asList(
    		   new user(10,"sumit","tes45"),
    		   new user(34,"utsav","hwg2341"),
    		   new user(45,"tiwari","2ytygg")
    		   );
       model.addAttribute("list", list);
		
		return "UserData";
		
	}
}
