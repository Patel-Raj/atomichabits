<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Habit</title>
</head>
<body>
	<h2>Existing Habits being tracked : </h2>
	
	<ul>
		<li></li>
		<li></li>
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