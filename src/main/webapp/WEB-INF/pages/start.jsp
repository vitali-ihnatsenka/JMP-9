<html>
<head>
    <script src="js/script.js"></script>
</head>
<body>
    <h1>Hello!</h1>
    <div>${message}</div>
	<div>
        Create Reservation
        <form action="create">
            Movie Name:<br>
            <input type="text" name="name" required><br>
            Date and time:<br>
            <input type="datetime-local" name="datetime" required><br>
            Place:<br>
            <input type="text" name="place" required><br>
            Price:<br>
            <input type="number" name="price" required><br>
            Owner first name:<br>
            <input type="text" name="firstName" required><br>
            Owner last name:<br>
            <input type="text" name="lastName" required><br>
            <input type="submit" value="Create">
        </form>
    </div>
    <div>
        Search Reservation by date
        <form action="searchByDate">
            <input type="date" name="date" required>
            <input type="submit" value="Search">
        </form>
    </div>
    <div>
        Search reservation by id
        <form action="searchById">
            <input type="text" name="id" required>
            <input type="submit" value="Search">
        </form>
    </div>
</body>
</html>