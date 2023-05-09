<%-- 
    Document   : student-list
    Created on : May 9, 2023, 6:47:12 AM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Student List</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Action</th>
        </tr>
        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>
                    <a href="student-edit.jsp?id=${student.id}">Edit</a>
                    <a href="student-delete.jsp?id=${student.id}">Delete</a>
                    <a href="course-list.jsp?studentId=${student.id}">View Courses</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="student-add.jsp">Add Student</a>
    </body>
</html>
