package legalcasemanage.legalcase.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping({"/"," "})
	 public String home() {
		 return "index";
	 }
	@GetMapping({"/about"})
	 public String about() {
		 return "about";
	 }
	
	@GetMapping({"/contact"})
	 public String contact() {
		 return "contact";
	 }
	
	@GetMapping({"/admin"})
	 public String admin() {
		 return "Admin";
	 }
	@GetMapping({"/login"})
	 public String Login() {
		 return "Login";
	 }
	@GetMapping({"/add_lawyer",})
	 public String addlawyer() {
		 return "add_lawyer";
	 }
	@GetMapping({"/add_client"})
	 public String addclient() {
		 return "add_client";
	 }
	

}
