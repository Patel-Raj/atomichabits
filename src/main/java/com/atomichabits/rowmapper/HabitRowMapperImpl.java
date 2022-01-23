package com.atomichabits.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.atomichabits.pojo.Habit;


public class HabitRowMapperImpl implements RowMapper<Habit>{
	public Habit mapRow(ResultSet rs, int rowNum) throws SQLException {
		Habit habit = new Habit();
		habit.setHabit_id(rs.getInt(1));
		habit.setEffective_start_date(rs.getDate(2));
		habit.setEffective_end_date(rs.getDate(3));
		habit.setHabit_name(rs.getString(4));
		return habit;
	}

}
