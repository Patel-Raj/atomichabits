package com.atomichabits.pojo;

import java.sql.Date;

public class HabitRecord {
	
	int habitRecordId;
	Date effective_Date;
	int habitId;
	
	@Override
	public String toString() {
		return "HabitRecord [habitRecordId=" + habitRecordId + ", effective_Date=" + effective_Date + ", habitId="
				+ habitId + "]";
	}
	public int getHabitRecordId() {
		return habitRecordId;
	}
	public void setHabitRecordId(int habitRecordId) {
		this.habitRecordId = habitRecordId;
	}
	public Date getEffective_Date() {
		return effective_Date;
	}
	public void setEffective_Date(Date effective_Date) {
		this.effective_Date = effective_Date;
	}
	public int getHabitId() {
		return habitId;
	}
	public void setHabitId(int habitId) {
		this.habitId = habitId;
	}
	public HabitRecord(int habitRecordId, Date effective_Date, int habitId) {
		super();
		this.habitRecordId = habitRecordId;
		this.effective_Date = effective_Date;
		this.habitId = habitId;
	}
	
	public HabitRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
}