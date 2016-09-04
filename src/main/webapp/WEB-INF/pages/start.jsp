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
            <input type="text" name="name"><br>
            Date and time:<br>
            <input type="datetime-local" name="datetime"><br>
            Place:<br>
            <input type="text" name="place"><br>
            Price:<br>
            <input type="number" name="price"><br>
            Owner first name:<br>
            <input type="text" name="firstName"><br>
            Owner last name:<br>
            <input type="text" name="lastName"><br>
            <input type="submit" value="Create">
        </form>
    </div>
    <div>
        Search Reservation by date
        <form action="searhByDate">
            <input type="date" name="date">
            <input type="submit" value="Search">
        </form>
    </div>
    <div>
        Search reservation by id
        <form action="searchById">
            <input type="text" name="id">
            <input type="submit" value="Search">
        </form>
    </div>
</body>
</html>