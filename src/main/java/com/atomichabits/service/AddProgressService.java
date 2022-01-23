package com.atomichabits.service;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atomichabits.dao.HabitDao;
import com.atomichabits.dao.HabitRecordDao;
import com.atomichabits.model.HabitModel;
import com.atomichabits.pojo.Habit;
import com.atomichabits.pojo.HabitRecord;

public class AddProgressService {
	public static void addProgress(String[] habits, Date effective_date) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		HabitDao habitDao = applicationContext.getBean("habitDaoImpl", HabitDao.class);
		HabitRecordDao habitRecordDao = applicationContext.getBean("habitRecordDaoImpl", HabitRecordDao.class);
		HabitRecord habitRecord = null;
		for(String habitName : habits) {
			int habitId = habitDao.getIdFromName(habitName);
			habitRecord = new HabitRecord(habitRecordDao.getMaxId()+1, effective_date , habitId);
		}
		if(habitRecord != null)
			habitRecordDao.insert(habitRecord);
	}
}
