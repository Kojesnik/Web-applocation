<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
    <head>
        <title>Main page</title>
    </head>
    <body>
        <br>
        <h1 align="center">WELCOME TO MY WEB APPLICATION</h1>
        <br><h2 align="center">Here you can register yourself like a user and enter to your own page</h2>
        <h3 align="center">sorry how it looks like, but im not a disigner</h3>
        <br><h2 align="center">Now you can choose what to do: Enter to your page or register a new user</h2>
        <br>
        <center>
            <a href = "/register">
                <button style="width:130px;height:40px">Registretion</button>
            </a>

            <a href = "/enter">
                <button style="width:130px;height:40px">Entering</button>
            </a>
        </center>
    </body>
</html>
