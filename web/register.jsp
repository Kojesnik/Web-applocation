<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kojes
  Date: 2019-03-15
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <br><h1 align="center">Here you can register your self</h1>
    <br><h2 align="center">Write down all necessary information</h2>
    <center>
        <form:form method="post" modelAttribute="userModel">
            <table>
                <tr>
                    <td>FullName:</td>
                    <td><form:input path="fullName" />
                    <td>FullName must be >4 and <21 and contain space</td>
                    <form:errors path = "fullName" cssClass = "error" />
                    </td>

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

                <td colspan="3"><input type="submit" value="Register" /></td>
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
