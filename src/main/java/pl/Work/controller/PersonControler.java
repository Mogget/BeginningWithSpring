package pl.Work.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import pl.Work.service.UserDataService;

@Controller
@SessionAttributes
public class PersonControler {
	@Resource(name="userDataService")
	UserDataService userDataService;
	
	protected static Logger logger = Logger.getLogger("controller");
	
	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public ModelAndView showContacts() {
		logger.debug("Received request to show person");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("persons",  userDataService.getAll());
		return new ModelAndView("person", model);
	}
}
