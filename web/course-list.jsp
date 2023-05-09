<%-- 
    Document   : course-list
    Created on : May 9, 2023, 6:50:53 AM
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
        <h1>Course List</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Action</th>
        </tr>
        <c:forEach var="course" items="${courses}">
            <tr>
                <td>${course.id}</td>
                <td>${course.name}</td>
                <td>
                    <a href="course-edit.jsp?id=${course.id}&studentId=${studentId}">Edit</a>
                    <a href="course-delete.jsp?id=${course.id}&studentId=${studentId}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="course-add.jsp?studentId=${studentId}">Add Course</a>
    <a href="student-list.jsp">Back to Student List</a>

    </body>
</html>
