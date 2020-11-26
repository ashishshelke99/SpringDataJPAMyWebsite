package com.datajpawebsite.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactUsController {

	@RequestMapping(value = "/contactUs")
	public ModelAndView contactUs() {
		ModelAndView mv = new ModelAndView("contactUs.jsp");
		return mv;
	}
	
}
