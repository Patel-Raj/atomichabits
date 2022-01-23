package com.atomichabits.controller;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atomichabits.model.HabitModel;
import com.atomichabits.service.AddHabitService;
import com.atomichabits.service.AddProgressService;

@Controller
public class ServiceController {
	
	@RequestMapping(path="/addHabitService", method=RequestMethod.GET)
	public String addHabitServiceHandler(@ModelAttribute HabitModel habitModel, Model model) {
		AddHabitService.addHabit(habitModel);
		return "AddHabitView";
	}
	
	@RequestMapping(path="/addProgressService", method=RequestMethod.GET)
	public String addProgressServiceHandler(HttpServletRequest req) {
		String[] habits = req.getParameterValues("habit_name");
		Date effective_date = Date.valueOf(req.getParameter("habit_date"));
		AddProgressService.addProgress(habits, effective_date);
		return "AddProgressView";
	}
}
