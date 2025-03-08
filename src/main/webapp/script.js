let selectedSeatIds = []
let j = 0;
let x = 0;
let y = 0;
let btnid = "";
const seatsContainer = document.getElementById('seatsContainer');
const paymentBtn = document.getElementById('paymentBtn');

// Number of seats (can be changed dynamically)
const totalSeats = 30;

// Load employeeed seats from local storage
const employeeedSeats = JSON.parse(localStorage.getItem('employeeedSeats')) || [];

// Create seat buttons dynamically
for (i = 1; i <= totalSeats; i++) {
	const seat = document.createElement('button');
	seat.classList.add('seat');
	seat.textContent = i;
	seat.id = `seats-${i}`;

	//document.getElementById("seatno").style.cursor="not-allowed"
	// Mark seat as employeeed if it exists in local storage
	if (employeeedSeats.includes(seat.id)) {
		j++;

		console.log(j)
		btnid = "seat number-" + i;
		console.log(btnid);
		seat.classList.add('employeeed');
	}

	// Add click event to select seats
	seat.addEventListener('click', () => {
		console.log(j);

		if (!seat.classList.contains('employeeed')) {
			x++;
			console.log(x);
			console.log(y);

			if (y > 0) {
				document.getElementById("container").style.display = "none";
			}

			seat.classList.toggle('selected');

			// Store the seat button ID when selected
			const seatId = seat.id;
			if (seat.classList.contains('selected')) {
				selectedSeatIds.push(seatId);  // Add seat ID to array when selected
			} else {
				const index = selectedSeatIds.indexOf(seatId);
				if (index > -1) {
					selectedSeatIds.splice(index, 1);  // Remove seat ID if unselected
				}
			}
			console.log(selectedSeatIds);
			console.log("Selected Seat IDs: ", selectedSeatIds);
		}

		if (seat.classList.contains('employeeed')) {
			x--;
			console.log(x);
		}
	});


	seatsContainer.appendChild(seat);
}

// Payment button click event
paymentBtn.addEventListener('click', function() {

	console.log("I am in payment");
	console.log("i am in payment");

	const selectedSeats = document.querySelectorAll('.seat.selected');
	const seatIds = [];

	selectedSeats.forEach(seat => {
		seat.classList.remove('selected');
		seat.classList.add('employeeed');
		seatIds.push(seat.id);
		//window.location.href="finalpage.html";

	});

	// Save employeeed seats to local storage
	localStorage.setItem('employeeedSeats', JSON.stringify([...employeeedSeats, ...seatIds]));




});
// Prepare parameters to send

function show() {
	console.log("sesats")
	document.getElementById("seatdiv").style.display = "block";
	window.location.href = "#seatdiv"
}
function bus(event) {
	// Prevent form from submitting and refreshing the page
	event.preventDefault();

	// Get input values
	const from = document.getElementById('fromloc').value;
	const to = document.getElementById('toloc').value;
	const date = document.getElementById('dateof').value;
	// Check if both fields are filled
	if (from && to && date) {
		// Display buses section if fields are filled
		document.getElementById('from').value = from;
		document.getElementById('to').value = to;
		document.getElementById('date').value = date; 
		window.location.href = "#buses"
		document.getElementById("buses").style.display = "block";
		  console.log(`From: ${from}, To: ${to}, Date: ${date}`);
	} else {
		alert('Please fill in both fields.');
	}
}
function succ() {


	console.log(selectedSeatIds.length)
	if (selectedSeatIds.length!=0) {

		
		window.location.href = "#container"

		document.getElementById("seat").value=selectedSeatIds;
			document.getElementById("container").style.display = "block";

	}
	else {
		
		alert("book atleast one ticket");


	}
}

