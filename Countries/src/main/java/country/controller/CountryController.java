package country.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import country.entities.Country;
import country.repository.CountryRepository;

@Controller
public class CountryController {
	
	@Autowired
	private CountryRepository countryRepo;
	
	@RequestMapping("/")
	public String showPage(Model model, @RequestParam(defaultValue= "0") int page) {
		
		model.addAttribute("data", countryRepo.
				findAll(new PageRequest(page, 4)));
		model.addAttribute("currentPage", page);
		return "index";
	}
	
	@RequestMapping(value= "/save", method=RequestMethod.POST )
	public String save(Country c) {
		
		countryRepo.save(c);
		
		return "redirect:/";
	}
	
	@RequestMapping(value= "/delete", method=RequestMethod.GET )
	public String deleteCountry(Integer id) {
		
		countryRepo.delete(id);
		
		return "redirect:/";
	}
	
	@RequestMapping(value= "/findOne", method=RequestMethod.GET )
	@ResponseBody
	public Country getCountryById(Integer id) {
		
		return countryRepo.findOne(id);
		
		
	}

}
