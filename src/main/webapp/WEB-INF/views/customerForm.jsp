<%-- 
    Document   : customerForm
    Created on : Feb 3, 2021, 8:42:20 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create your fantastic customer</h1>
        <form action="${pageContext.request.contextPath}/customer/create" method="POST">
            <label for="ccode">Code:</label>
            <input id="ccode" type="number" name="ccode"/>
            <br/>
            <label for="cname">Name:</label>
            <input id="cname" type="text" name="cname"/>
            <br/>
            <input type="submit" value="Submit"/>
        </form>
    </body>
</html>
