<%@page import="com.atomichabits.dao.impl.HabitDaoImpl,com.atomichabits.dao.HabitDao" %>
<%@page import="java.util.*,com.atomichabits.pojo.Habit" %>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Habit</title>
</head>
<body>
	<h2>Existing Habits being tracked :</h2>
	<%
		ApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
		HabitDao habitDaoImpl = app.getBean("habitDaoImpl", HabitDaoImpl.class);
		List<Habit> habitsTracked = habitDaoImpl.getAllTrackedHabits();
	%>
	<ul>
		<%
			for(Habit habit : habitsTracked) {
		%>		
		<li><%= habit.getHabit_name()%></li>
		<%} %>
	</ul>
	
	<hr>
	<form action="addHabitService" method = "get">
		 Habit Name : <input type="text" name="habit_name" placeholder="Enter Habit"><br><br>
		 Start Date : <input type="date" name="habit_start_date" placeholder="Enter Date"><br><br>
		<input type="submit"> <input type="Reset">
	</form>
	<hr> 
	<form action="index" method="get">
		<input type="submit" value="Back to home">
	</form>
</body>
</html>