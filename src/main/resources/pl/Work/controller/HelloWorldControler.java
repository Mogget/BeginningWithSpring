package pl.Work.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldControler {
	@RequestMapping("/hello.html")
	public ModelAndView helloWorld() {
		String message = "Hello World, Spring 3.0!";
		return new ModelAndView("hello", "message", message);
	}

}