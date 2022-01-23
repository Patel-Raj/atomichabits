package com.atomichabits.model;

import java.sql.Date;

public class Habit {
	int habit_id;
	Date effective_start_date;
	Date effective_end_date;
	String habit_name;
	
	public Habit(int habit_id, Date effective_start_date, Date effective_end_date, String habit_name) {
		super();
		this.habit_id = habit_id;
		this.effective_start_date = effective_start_date;
		this.effective_end_date = effective_end_date;
		this.habit_name = habit_name;
	}
	public Habit() {
		super();
	
	}
	public int getHabit_id() {
		return habit_id;
	}
	public void setHabit_id(int habit_id) {
		this.habit_id = habit_id;
	}
	public Date getEffective_start_date() {
		return effective_start_date;
	}
	public void setEffective_start_date(Date effective_start_date) {
		this.effective_start_date = effective_start_date;
	}
	public Date getEffective_end_date() {
		return effective_end_date;
	}
	public void setEffective_end_date(Date effective_end_date) {
		this.effective_end_date = effective_end_date;
	}
	public String getHabit_name() {
		return habit_name;
	}
	public void setHabit_name(String habit_name) {
		this.habit_name = habit_name;
	}
	@Override
	public String toString() {
		return "Habit [habit_id=" + habit_id + ", effective_start_date=" + effective_start_date
				+ ", effective_end_date=" + effective_end_date + ", habit_name=" + habit_name + "]";
	}
}