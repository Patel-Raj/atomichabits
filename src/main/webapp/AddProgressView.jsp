<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="com.atomichabits.dao.impl.HabitDaoImpl,com.atomichabits.dao.HabitDao" %>
<%@page import="java.util.*,com.atomichabits.pojo.Habit" %>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Progress</title>
</head>
<body>
	<%
		ApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
		HabitDao habitDaoImpl = app.getBean("habitDaoImpl", HabitDaoImpl.class);
		List<Habit> habitsTracked = habitDaoImpl.getAllTrackedHabits();
	%>
	<h2>Add today's progress :</h2>
		<form action="addProgressService" method = "get">
			 Date : <input type="date" name="habit_date" placeholder="Enter Date"><br><br>
			 <%
			 	for(Habit habit: habitsTracked) {
			 %>
			 <input type="checkbox" name="habit_name" value="<%= habit.getHabit_name()%>"> <%= habit.getHabit_name()%><br>
			 <%} %>
			 <br>
			<input type="submit"> <input type="Reset">
		</form>
	<hr> 
	<form action="index" method="get">
		<input type="submit" value="Back to home">
	</form>
</body>
</html>