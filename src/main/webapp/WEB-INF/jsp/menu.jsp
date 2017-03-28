<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <meta charset="UTF-8">
    <title>Menu</title>
    <style>

    </style>
</head>
<body>
<div id="content" class="col-md-7">
    <c:forEach items="${dishesByType}" var="dish" varStatus="count">
        <div class="col-md-2">
            <input type="image" src="${dish.url}" class="dish-button" id=${dish.name}>
            <p><strong>${dish.name}</strong></p>
            <p>${dish.weight}g. / ${dish.price}$</p>
        </div>
    </c:forEach>
</div>
</body>
</html>
