<%-- 
    Document   : student-delete
    Created on : May 9, 2023, 6:50:19 AM
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
        <h1>Delete Student</h1>
    <form action="StudentController" method="POST">
        <input type="hidden" name="action" value="delete">
        <input type="hidden" name="id" value="${student.id}">
        <label>Name:</label>
        ${student.name}
        <br>
        <input type="submit" value="Delete">
    </form>
    <a href="student-list.jsp">Back to List</a>
    </body>
</html>
