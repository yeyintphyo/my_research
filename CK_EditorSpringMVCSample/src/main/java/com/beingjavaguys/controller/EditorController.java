package com.beingjavaguys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EditorController {

	@RequestMapping(value = "/show", method=RequestMethod.POST)
	public ModelAndView showMessageText(@RequestParam(value = "editor1") String editor) {
		return new ModelAndView("show", "editor", editor);
	}
	
}
