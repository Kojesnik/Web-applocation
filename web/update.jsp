<%--
  Created by IntelliJ IDEA.
  User: kojes
  Date: 2019-03-16
  Time: 00:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Update info</title>
</head>
<body>
    <h1 align="center">Write all information that you want to change</h1>
    <br>
    <center>
        <form:form method="post" modelAttribute="userModel">
            <table>
                <tr>
                    <td>FullName:</td>
                    <td><form:input path="fullName" /></td>
                    <td>FullName must be >4 and <21 and contain space</td>
                </tr>

                <tr>
                    <td>NikName:</td>
                    <td><form:input path="nikName" /></td>
                    <td>NikName must be >3 and <15</td>
                </tr>

                <tr>
                    <td>Age:</td>
                    <td><form:input path="age" /></td>
                    <td>Age must be >0 and <101 and be a number</td>
                </tr>

                <tr>
                    <td>Email:</td>
                    <td><form:input path="email" /></td>
                    <td>It must be an email</td>
                </tr>

                <tr>
                    <td>Password:</td>
                    <td><form:input path="password" /></td>
                </tr>

                <td colspan="3"><input type="submit" value="Update info" /></td>
                </tr>
            </table>
        </form:form>
    </center>
    <h2>${errorFN}</h2>
    <h2>${errorNN}</h2>
    <h2>${errorA}</h2>
    <h2>${errorE}</h2>
</body>
</html>
