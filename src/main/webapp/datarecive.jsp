<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Email Confirmation</title>
<script type="text/javascript"
    src="https://cdn.jsdelivr.net/npm/@emailjs/browser@4/dist/email.min.js"></script>
<script type="text/javascript">
    (function() {
        emailjs.init("Z9_UqlTY1chBwRsWk");
    })();
</script>
<script>
function mail() {
    console.log("came to mail func")
    const parms = {
        name: document.getElementById("name").value,
        email: document.getElementById("email").value,
        message: "Your Ticket was Booked Successfully",
        from: document.getElementById("from").value,
        to: document.getElementById("to").value,
        seatno: document.getElementById("seat").value,
        date: document.getElementById("date").value
    };

    // Send the email using EmailJS
    emailjs.send("service_ys610ze", "template_waqsuwk", parms)
        .then(function(response) {
            alert("Email sent successfully!");
            window.location.href = "finalpage.html";
        }, function(error) {
            alert("Error sending email: " + error.text);
        });
}
</script>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f9f9f9;
        margin: 0;
        padding: 0;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100vh;
    }

    h1 {
        color: #333;
        margin-bottom: 20px;
        text-align: center;
    }

    .container {
        background-color: #fff;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        border-radius: 8px;
        padding: 20px;
        width: 100%;
        max-width: 500px;
        text-align: center;
    }

    .container div {
        margin-bottom: 15px;
    }

    input[type="text"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 10px;
        font-size: 14px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    input[type="text"]:focus {
        outline: none;
        border-color: #007bff;
        box-shadow: 0 0 5px rgba(0, 123, 255, 0.5);
    }

    button {
        background-color: #007bff;
        color: white;
        border: none;
        padding: 10px 20px;
        font-size: 16px;
        border-radius: 4px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }

    button:hover {
        background-color: #0056b3;
    }

    button:active {
        transform: scale(0.98);
    }
</style>
</head>
<body>
    <h1>Email Confirmation</h1>
    <div class="container" style="display: block;">
        <c:forEach var="user" items="${list}">
            <div>
                <input type="text" id="email" name="username_${user.email}" value="${user.email}" >
                <input type="text" id="from" value="${user.fromloc}" >
                <input type="text" id="to"  value="${user.toloc}" >
                <input type="text" id="name" value="${user.name}" >
                <input type="text" id="seat"  value="${user.seatno}">
                <input type="text" id="date" value="${user.date}" >
            </div>
        </c:forEach>
      
    </div>
      <button onclick="mail()">Send Email</button>
</body>
</html>
