<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
<link type="text/css" rel="stylesheet" href="css/design.css"/>
</head>
<body style="background-color: wheat;">
<div>
<h2>
	Booking Confirmed, Ticket Summary: <BR>
	Booking Reference ID: ${bookingId} <BR>
	Theater Name: ${bookingDetails.theaterName}<BR>
	Number of Tickets Booked: ${bookingDetails.noOfTickets}<BR>
	Total Price (Inclusive of Internet Booking Fees + Entertainment Tax): ${bookingDetails.totalPrice}<BR>
	Movie Date / Time:  ${bookingDetails.moviePlayTime}<BR>
	Booking Date: ${bookingDetails.bookingDate}<BR>
</h2>
	<h2>Thank You!, visit again</h2><BR>
	<form method="post" action="MovieController">
		<input type="submit" name="action" value="Logout"/>
	</form>
</div>
</body>
</html>