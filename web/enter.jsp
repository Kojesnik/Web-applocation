<%--
  Created by IntelliJ IDEA.
  User: kojes
  Date: 2019-03-15
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Enter</title>
</head>
<body>
    <h1 align = "center">Enter information needed and enter your account page</h1>
    <center>
        <form:form method="post" modelAttribute="userModel">
            <table>

                <tr>
                    <td>NikName:</td>
                    <td><form:input path="nikName" /></td>
                </tr>

                <tr>
                    <td>Password:</td>
                    <td><form:input path="password" /></td>
                </tr>

                <td colspan="3"><input type="submit" value="Enter" /></td>
                </tr>
            </table>
        </form:form>
    </center>
</body>
</html>
