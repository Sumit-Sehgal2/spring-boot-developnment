package taxibooking.sumit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import taxibooking.sumit.object.Book;

@Controller
//@RequestMapping("/book")

public class bookcontroller {
	@GetMapping("/show")
	private String showdata(Model model)
	{
		Book b1=new Book(101,"harrypooter","james",354.90);
		model.addAttribute("bob",b1);
		 return "BookData";
	}



///we have too send book collection
@GetMapping("/list")
public String showlist(Model model)
{
	List<Book>list=Arrays.asList(new Book(101,"segemnet","charles",357.90),
			new Book(232,"sterferd","jameshe",876.90),
			new Book(321,"testring","ritche",5656.80)
			
			);
	model.addAttribute("bookset",list);
	
	return "BookList";
	
}
}
