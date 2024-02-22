package com.smart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("title", "Home - Smart Contact Manager");
		return "home";
	}
	
	@RequestMapping("/about")
	public String about(Model model)
	{
		model.addAttribute("title", "Home - Smart Contact Manager");
		return "about";
	}
	
//	@Autowired
//	private UserRepository userRepository;
//	
//	@GetMapping("/test")
//	@ResponseBody		//Html nhi return krna, direct return only response
//	public String test()
//	{
//		User user = new  User();
//		user.setName("Sourabh");
//		user.setEmail("souravbhola123@gmail.com");
//		userRepository.save(user);
//		return "Working...";
//		
//	}

}
