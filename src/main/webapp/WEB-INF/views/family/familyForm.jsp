<%-- 
    Document   : familyForm
    Created on : Feb 3, 2021, 8:42:20 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create your fantastic family</h1>

        <c:if test="${member.fid == null}">
            <c:url value="/family/create?salesmanId=${salesman.scode}" var="link"/>
        </c:if>
        <c:if test="${member.fid != null}">
            <c:url  value="/family/update" var="link"/>
        </c:if>
        <form:form action="${link}" method="POST" modelAttribute="member">
            <form:hidden path="fid"/>
            <br/>
            <label for="fname">Name:</label>
            <form:input id="fname" path="fname"/>
            <form:errors path="fname"/>
            <br/>
            
            <br/>
            <label for="frelationship">Relationship:</label>
            <form:input id="frelationship" path="frelationship" />
            <form:errors path="frelationship"/>
            <br/>
            Date of birth:
            <form:input type="date" path="dob" />
            <br/>
            <input type="submit" value="Submit"/>
        </form:form>
    </body>
</html>
