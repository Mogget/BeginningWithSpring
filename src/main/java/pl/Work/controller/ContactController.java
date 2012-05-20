package pl.Work.controller;

import pl.Work.form.Contact;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes
//@RequestMapping("/tiles")
public class ContactController {
	
	protected static Logger logger = Logger.getLogger("controller");
	
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact") Contact contact,
			BindingResult result) {
		logger.debug("Received request to show pets page");

		System.out.println("First Name:" + contact.getFirstname()
				+ "Last Name:" + contact.getLastname());

		return "redirect:contacts.html";
	}

	@RequestMapping("/contacts")
	public ModelAndView showContacts() {
		logger.debug("Received request to show pets page");

		return new ModelAndView("contact", "command", new Contact());
	}
}
