package com.atomichabits.service;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atomichabits.dao.HabitDao;
import com.atomichabits.model.HabitModel;
import com.atomichabits.pojo.Habit;


public class AddHabitService {
	public static void addHabit(HabitModel habitModel) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		HabitDao habitDao = applicationContext.getBean("habitDaoImpl", HabitDao.class);
		String habitEndDate = "4712-12-31"; 
		Habit habit = new Habit(habitDao.getMaxId()+1, Date.valueOf(habitModel.getHabit_start_date()) , 
				Date.valueOf(habitEndDate), habitModel.getHabit_name());
		habitDao.insert(habit);
	}
}
