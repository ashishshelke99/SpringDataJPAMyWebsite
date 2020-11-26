package com.datajpawebsite.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProjectsController {

	@RequestMapping(value = "/projects")
	public ModelAndView showProjects() {
		ModelAndView mv = new ModelAndView("projects.jsp");
		return mv;
	}
	
}
