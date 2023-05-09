<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Student</h1>
    <form action="StudentController" method="POST">
        <label>ID:</label>
        <input type="number" name="id" required><br>
        <label>Name:</label>
        <input type="text" name="name" required><br>
        <input type="submit" value="Add">
    </form>
    <a href="student-list.jsp">Back to List</a>
    </body>
</html>
