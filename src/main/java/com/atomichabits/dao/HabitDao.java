package com.atomichabits.dao;

import java.util.List;

import com.atomichabits.pojo.Habit;


public interface HabitDao {
	public void insert(Habit habit);
	public int getMaxId();
	public List<Habit> getAllTrackedHabits();
	public int getIdFromName(String habit_name);
}
