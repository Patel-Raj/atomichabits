package com.atomichabits.dao.impl;

import java.util.List;

import com.atomichabits.dao.HabitDao;
import com.atomichabits.pojo.Habit;
import com.atomichabits.rowmapper.HabitRowMapperImpl;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;


public class HabitDaoImpl implements HabitDao {

	JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(Habit habit) {
		String query = "insert into habit_types(habit_id,effective_start_date,effective_end_date,habit_name) values(?,?,?,?)";
        int res = jdbcTemplate.update(query, habit.getHabit_id(), habit.getEffective_start_date()
        		, habit.getEffective_end_date(), habit.getHabit_name());
	}

	public int getMaxId() {
		String query = "select * from habit_types order by habit_id desc;";
        List<Habit> habits = jdbcTemplate.query(query, new HabitRowMapperImpl());
        if(habits.isEmpty())		return 0;
        return habits.get(0).getHabit_id();
	}

	public List<Habit> getAllTrackedHabits() {
		String query = "select * from habit_types order by habit_id;";
        List<Habit> habits = jdbcTemplate.query(query, new HabitRowMapperImpl());
        return habits;
	}

	public int getIdFromName(String habit_name) {
		String query = "select * from habit_types order by habit_id desc;";
        List<Habit> habits = jdbcTemplate.query(query, new HabitRowMapperImpl());
        if(habits.isEmpty())		return 0;
        for(Habit habit : habits) {
        		if(habit.getHabit_name().equals(habit_name)) return habit.getHabit_id();
        }
        return 0;
	}

}
