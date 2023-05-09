<%-- 
    Document   : course-edit
    Created on : May 9, 2023, 6:52:13 AM
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
        <h1>Edit Course</h1>
    <form action="CourseController" method="POST">
        <input type="hidden" name="action" value="update">
        <input type="hidden" name="id" value="${course.id}">
        <input type="hidden" name="studentId" value="${studentId}">
        <label>Name:</label>
        <input type="text" name="name" value="${course.name}" required><br>
        <input type="submit" value="Update">
    </form>
    <a href="course-list.jsp?studentId=${studentId}">Back to List</a>
    </body>
</html>
