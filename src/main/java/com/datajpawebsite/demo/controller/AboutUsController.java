package com.datajpawebsite.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AboutUsController {
	
	@RequestMapping(value = "/aboutUs")
	public ModelAndView aboutUs() {
		ModelAndView mv  = new ModelAndView("aboutUs.jsp");
		return mv;
	}

}
