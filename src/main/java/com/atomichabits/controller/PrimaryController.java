package com.atomichabits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PrimaryController {

	@RequestMapping(path="/createNewHabit", method=RequestMethod.GET)
	public String addHabitHandler() {
		return "AddHabitView";
	}
	
	@RequestMapping(path="/updateProgress", method=RequestMethod.GET)
	public String addProgressHandler() {
		return "AddProgressView";
	}
	
	@RequestMapping(path="/trackProgress", method=RequestMethod.GET)
	public String trackProgressHandler() {
		return "TrackProgressView";
	}
	
	@RequestMapping(path="/index", method=RequestMethod.GET)
	public String backToHomeHandler() {
		return "index";
	}
}
