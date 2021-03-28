<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta charset="UTF-8">
    <link rel="stylesheet" href="style.css" />
    <style> <%@include file="style.css"%> </style>
    <title>Vasco Ferraz</title>

</head>

<body>

<div class="topnav">
    <a class="active" href="/hello">Home</a>
    <a href="/hello/news">News</a>
    <a href="/hello/contact">Contact</a>
    <a href="/hello/about">About</a>
</div>

<h1>My name is ${user.name}</h1>
<h1>${user.email}</h1>

<div class="footer">
    <p>Time of request: ${date}</p>
    <p>Number of visits: ${visits}</p>
</div>


</body>
</html>
