<%--
  Created by IntelliJ IDEA.
  User: kojes
  Date: 2019-03-15
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Welcome to your account page, ${fullname}</h1>
    <br><h2>Here you can see information about you, update it and delete your account</h2>
    <br><br>
    Full Name : ${fullname} <br>
    Nikname   : ${nikname} <br>
    E-mail    : ${email} <br>
    Age       : ${age} <br>
    Password  : ${password} <br><br>
    <a href = "/main">
        <button style="width:130px;height:20px">Main page</button>
    </a>
    <a href = "/update">
        <button style="width:130px;height:20px">Update</button>
    </a>
    <a href = "/delete">
        <button style="width:130px;height:20px">Delete</button>
    </a>
</body>
</html>
