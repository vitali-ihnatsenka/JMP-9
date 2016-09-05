<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
    <h1>Search result!</h1>
    <table>
        <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Date and time</td>
            <td>Place</td>
            <td>Price</td>
            <td>Owner</td>
        </tr>
        <c:forEach items="${reservations}" var="reservation">
        <tr>
            <td>${reservation.id}</td>
            <td>${reservation.name}</td>
            <td>${reservation.dateTime}</td>
            <td>${reservation.place}</td>
            <td>${reservation.price}</td>
            <td>${reservation.owner.firstName} ${reservation.owner.lastName}</td>
            <td>
                <form action="remove">
                    <input type="hidden" name="id" value="${reservation.id}">
                    <input type="submit" value="remove">
                </form>
            </td>
        </tr>
        </c:forEach>
    </table>
    <div>
        <a href="/">back</a>
    </div>
</body>
</html>
