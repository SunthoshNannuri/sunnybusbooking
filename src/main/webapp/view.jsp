<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>All Info List</title>
<link rel="stylesheet" href="view.css">
</head>
<body>
	<h1>Details List</h1>
	<table>
		<tr>
			<th>Name</th>
			<th>From Location</th>
			<th>To Location</th>
			<th>Email</th>
			<th>Phone Number</th> 
			<th>SeatNo</th>
			<th>Gender</th>
			<th>Date</th>

		</tr>
		<c:forEach var="info" items="${list}">
			<tr>
				<td>${info.name}</td>
				<td>${info.fromloc}</td>
				<td>${info.toloc}</td>
				<td>${info.email}</td>
				<td>${info.number}</td>
				<td>${info.seatno}</td>
				<td>${info.gender}</td>
				<td>${info.date}</td>

			</tr>
		</c:forEach>
	</table>
	<div class="button-container">
		<form action="truncate" method="post">
			<button type="submit">Exit</button>
		</form>
	</div>
</body>
</html>
