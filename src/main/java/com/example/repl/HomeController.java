package com.example.repl;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private HomeService service;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("listR", service.selectListR());
		model.addAttribute("listW", service.selectListW());
		
		return "home";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Locale locale, Model model) {
		TestTb testTb = new TestTb();
		testTb.setVal1("val55");
		testTb.setVal2("val66");
	
		service.insertTestTb(testTb);		
		try {
			service.selectOneId(testTb.getId());	
			logger.info(">>> INSERT ID ==> {}", testTb.getId());
		} catch (Exception e) {
			logger.error(">>>>> EXIST NOT ID ==> {}", e.toString());
		}
		return "redirect:/";
	}
	
	@RequestMapping(value = "/deleteAll", method = RequestMethod.GET)
	public String deleteAll(Locale locale, Model model) {
		service.deleteAll();
		return "redirect:/";
	}	
	
	
	
}
