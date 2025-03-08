<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="https://cdn.jsdelivr.net/npm/@emailjs/browser@4/dist/email.min.js"></script>
<script type="text/javascript">
	(function() {
		emailjs.init("Z9_UqlTY1chBwRsWk");
	})();
</script>
<script>
function mail() {
    event.preventDefault();
	console.log("came to mail func")
	const parms = {
		name: document.getElementById("name").value,
		email: document.getElementById("email").value,
		message: "You Ticket was Booked Successfully",
		from: document.getElementById("from").value,
		to: document.getElementById("to").value,

		seatno:document.getElementById("seat").value
	};

	// Send the email using EmailJS
	emailjs.send("service_jjixvpl", "template_y4tm9v5", parms)
		.then(function(response) {
			alert("Email sent successfully!");

		}, function(error) {
			alert("Error sending email: " + error.text);

		});
	
  
}

</script>
</head>
<body>
 <c:forEach var="user" items="${list}">
        <div>
      
             <input type="text" id="email" name="username_${user.fromloc}" value="${user.email}">
           
            <input type="text" id="from" name="username_${user.fromloc}" value="${user.fromloc}">
            
           
            <input type="text" id="to" name="username_${user.toloc}" value="${user.toloc}">
            
           
            <input type="text" id="name" name="username_${user.name}" value="${user.name}">
            
             <input type="text" id="seat" name="username_${user.fromloc}" value="${user.seatNo}">
         
        </div>
    </c:forEach>
<form action="otpthere" method="post" >
<input type="text" name="otp" id="otp" placeholder="enter recevied otp from email">
<br>
<br>
<button onclick="mail()">submit</button>
</form>
</body>
</html>