package com.atomichabits.dao;

import java.util.List;

import com.atomichabits.pojo.HabitRecord;


public interface HabitRecordDao {
	public void insert(HabitRecord habitRecord);
	public int getMaxId();
	public List<HabitRecord> getHabitRecords(int habitId);
}
