<%-- 
    Document   : student-edit
    Created on : May 9, 2023, 6:49:39 AM
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
        <h1>Edit Student</h1>
    <form action="StudentController" method="POST">
        <input type="hidden" name="action" value="update">
        <input type="hidden" name="id" value="${student.id}">
        <label>Name:</label>
        <input type="text" name="name" value="${student.name}" required><br>
        <input type="submit" value="Update">
    </form>
    <a href="student-list.jsp">Back to List</a>

    </body>
</html>
