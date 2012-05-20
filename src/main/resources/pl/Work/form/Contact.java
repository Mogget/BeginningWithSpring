package pl.Work.form;

public class Contact {

	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact") Contact contact,
			BindingResult result) {

		System.out.println("First Name:" + contact.getFirstname()
				+ "Last Name:" + contact.getLastname());

		return "redirect:contacts.html";
	}

	@RequestMapping("/contacts")
	public ModelAndView showContacts() {

		return new ModelAndView("contact", "command", new Contact());
	}

}
