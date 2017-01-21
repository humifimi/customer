package controller;

import javax.validation.Valid;

import model.Customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EntryController {

	@RequestMapping(value = "/Customer/add", method = RequestMethod.GET)
	public String getAddNewProductForm(Model model) {

		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "entryCustomer";
	}

	@RequestMapping(value = "/Customer/add", method = RequestMethod.POST)
	public String processAddNewCustomerForm(@Valid Customer customer,
			BindingResult result,Model model) {
		
		if (result.hasErrors()) {
			return "entryCustomer";
		}
		model.addAttribute("customer", customer);
		return "viewCustomer";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "redirect:/Customer/add";
	}

}
