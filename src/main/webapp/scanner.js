function getotp()
{
	console.log("hi i am in getotp")
	const parms = {
		         name:document.getElementById("name").value,
			     email:document.getElementById("email").value,
			     message:"Send otp",
			   };
			 
			   // Send the email using EmailJS
			   emailjs.send("service_jjixvpl", "template_y4tm9v5", parms)
			     .then(function(response) {
			       alert("Email sent successfully!");
			      
			     }, function(error) {
			       alert("Error sending email: " + error.text);
			      
			     });

}

