package com.atomichabits.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.atomichabits.dao.HabitRecordDao;
import com.atomichabits.pojo.HabitRecord;
import com.atomichabits.rowmapper.HabitRecordRowMapperImpl;


public class HabitRecordDaoImpl implements HabitRecordDao{
JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(HabitRecord habitRecord) {
		String query = "insert into habit_records_f(habit_record_id,effective_date,habit_id) values(?,?,?)";
		int res = jdbcTemplate.update(query, habitRecord.getHabitRecordId(), habitRecord.getEffective_Date()
        		, habitRecord.getHabitId());
	}

	public int getMaxId() {
		String query = "select * from habit_records_f order by habit_record_id desc;";
        List<HabitRecord> habitRecords = jdbcTemplate.query(query, new HabitRecordRowMapperImpl());
        if(habitRecords.isEmpty())		return 0;
        return habitRecords.get(0).getHabitRecordId();
	}

	public List<HabitRecord> getHabitRecords(int habitId) {
		String query = "select * from habit_records_f where habit_id=?;";
        List<HabitRecord> habitRecords = jdbcTemplate.query(query, new HabitRecordRowMapperImpl(), habitId);
        return habitRecords;
	}
	
}