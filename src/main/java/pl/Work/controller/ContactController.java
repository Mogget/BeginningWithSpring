package pl.Work.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.validation.Valid;

import pl.Work.model.UserData;
import pl.Work.service.UserDataService;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes
@RequestMapping("/contacts")
public class ContactController {
	
	@Resource(name="userDataService")
	UserDataService userDataService;
	
	protected static Logger logger = Logger.getLogger("controller");
	
	@RequestMapping(method = RequestMethod.POST)
	public String addContact(@Valid UserData userData, 
			BindingResult result, Map model) {
		
		logger.debug("Received request to show addcontact");
		
		if(result.hasErrors()){
			return "contact";
		}
		
		userDataService.create(userData);

		System.out.println("First Name:" + userData.getFirstname()
				+ "Last Name:" + userData.getDate());
		model.put("userData", userData);
		return "redirect:contacts.html";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showContacts(Map model) {
		logger.debug("Received request to show contact");
		UserData userData = new UserData();
		model.put("userData", userData);
		return "contact";
	}
}
