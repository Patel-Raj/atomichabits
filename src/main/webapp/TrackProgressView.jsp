<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.atomichabits.dao.impl.HabitDaoImpl,com.atomichabits.dao.HabitDao,
com.atomichabits.dao.HabitRecordDao,com.atomichabits.dao.impl.HabitRecordDaoImpl" %>
<%@page import="java.util.*,com.atomichabits.pojo.Habit,com.atomichabits.pojo.HabitRecord" %>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Track Progress</title>
</head>
<body>
	<h2>Your Progress!!</h2>
	<%
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		HabitDao habitDao = applicationContext.getBean("habitDaoImpl", HabitDao.class);
		HabitRecordDao habitRecordDao = applicationContext.getBean("habitRecordDaoImpl", HabitRecordDao.class);
		List<Habit> habits = habitDao.getAllTrackedHabits();
		for(int i = 0 ; habits!= null && i < habits.size(); i++) {
			List<HabitRecord> habitRecords = habitRecordDao.getHabitRecords(habits.get(i).getHabit_id());
			%>
			<h3>You have stuck to : <%= habits.get(i).getHabit_name()%> for <%= habitRecords.size()%> 
			days starting from <%= habits.get(i).getEffective_start_date() %></h3>
				<% 
		}
		
		%>
	<hr>
	<form action="updateProgress" type="get">
		<input type="submit" value="Add Progress">
	</form>
	<hr>
	<form action="index" method="get">
		<input type="submit" value="Back to home">
	</form>
</body>
</html>