<%-- 
    Document   : course-add
    Created on : May 9, 2023, 6:51:41 AM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Course</h1>
    <form action="CourseController" method="POST">
        <input type="hidden" name="studentId" value="${studentId}">
        <label>ID:</label>
        <input type="number" name="id" required><br>
        <label>Name:</label>
        <input type="text" name="name" required><br>
        <input type="submit" value="Add">
    </form>
    <a href="course-list.jsp?studentId=${studentId}">Back to List</a>
    </body>
</html>
