package com.bolton.esdgrocerystore.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bolton.esdgrocerystore.models.UserRegister;
import com.bolton.esdgrocerystore.repositories.UserRepository;
import com.bolton.esdgrocerystore.services.UserService;

@Controller
@SessionAttributes("userName")
public class UserController {
	@Autowired
	UserRepository userRepository;
	@Autowired
	UserService userService;
	
	@GetMapping("/registeruser")
	public String userRegistrationPage() {

		return "register";
	}
	@PostMapping("/register")
	public String userRegister(@RequestParam String uname, String upass, String uemail, String uaddress) {

			
		UserRegister newUser = new UserRegister(uname, upass, uemail, uaddress);
		System.out.println(newUser);
		userRepository.save(newUser);
		return "redirect:/";
	}
	@GetMapping("/")
	public String loginPage() {
		
		return "login";
	}
	@PostMapping("/login")
	public String userLogin(@RequestParam String userEmail, String password, ModelMap model) {
	
		String userName = userService.validateRegisteredUser(userEmail, password);
		System.out.println("Controller says "+userEmail+" password "+password);
		System.out.println("says user name  = " +userName);
		if(userName==null) {
			model.put("errorMessage", "Not a valid user");
			return "login";
		}
		model.put("userName", userName);
		
	
		return "home";
	}
	@GetMapping("/home") 
	public String home (){
		return "home";
	}
	
	@GetMapping("/logout")
	public String userLogOut(ModelMap model, HttpSession session) {
		session.invalidate();
		model.put("loggedout", "Your are successfully logged out!");
		return "login";
	}

}
