package pl.Work.controller;

import javax.annotation.Resource;

import pl.Work.model.UserData;
import pl.Work.service.UserDataService;

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
	
	@Resource(name="userDataService")
	UserDataService userDataService;
	
	protected static Logger logger = Logger.getLogger("controller");
	
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("userData") UserData userData, 
			BindingResult result) {
		logger.debug("Received request to show addcontact");
		
		userDataService.create(userData);

		System.out.println("First Name:" + userData.getFirstname()
				+ "Last Name:" + userData.getLastname());

		return "redirect:contacts.html";
	}

	@RequestMapping("/contacts")
	public ModelAndView showContacts() {
		logger.debug("Received request to show contact");

		return new ModelAndView("contact", "command", new UserData());
	}
}
