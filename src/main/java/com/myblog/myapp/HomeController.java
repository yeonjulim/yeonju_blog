package com.myblog.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	
	@RequestMapping(value="/index.do", method=RequestMethod.GET)
		public String index(){
			return "index";
		}
	
	@RequestMapping(value="/about.do", method=RequestMethod.GET)
	public String about(){
		return "about";
	}
	
	@RequestMapping(value="/blog.do", method=RequestMethod.GET)
	public String blog(){
		return "blog";
	}
	
	@RequestMapping(value="/contact.do", method=RequestMethod.GET)
	public String contact(){
		return "contact";
	}
	
}
