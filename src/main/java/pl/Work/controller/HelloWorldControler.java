package pl.Work.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldControler {
            @RequestMapping("/hello.html")
            public ModelAndView printWelcome() {
                        ModelAndView modelAndView = new ModelAndView();
                        modelAndView.addObject("message", "Spring 3 MVC Hello World");
                        modelAndView.setViewName("hello");
                        return modelAndView;
            }
} 