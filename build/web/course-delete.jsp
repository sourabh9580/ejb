<%-- 
    Document   : course-delete
    Created on : May 9, 2023, 6:52:57 AM
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
        <h1>Delete Course</h1>
    <form action="CourseController" method="POST">
        <input type="hidden" name="action" value="delete">
        <input type="hidden" name="id" value="${course.id}">
        <input type="hidden" name="studentId" value="${studentId}">
        <label>Name:</label>
        ${course.name}
        <br>
        <input type="submit" value="Delete">
    </form>
    <a href="course-list.jsp?studentId=${studentId}">Back to List</a>
    </body>
</html>
