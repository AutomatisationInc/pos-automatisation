<%--
  Created by IntelliJ IDEA.
  User: Man
  Date: 21.03.2017
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <script src="../../static/js/cashier.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <meta charset="UTF-8">
    <title>Cashier</title>
    <style>
        @import url('https://fonts.googleapis.com/css?family=Lobster');
        @import url('https://fonts.googleapis.com/css?family=Bitter');

        #header {
            margin-top: -1px;
            border: 2px solid white;
            background: #f6ca47;
            text-align: center;
            border-bottom-right-radius: 15px;
            border-bottom-left-radius: 15px;
            margin-bottom: -1px;
        }

        #header-cashier, #header-bill {

            font-family: Bitter, serif;
            font-size: x-large;
            text-shadow: 1px 1px 1px black;

        }

        #corporation-name {
            font-family: Lobster, cursive;
            font-size: xx-large;
        }

        #container {
            margin: 0 auto; /* Выравнивание по центру */
        }

        #nav {
            text-align: center;
            background: darkgrey;
            width: 20%; /* Ширина левой колонки */
            float: left;
        }

        #aside {
            background: darkgrey;
            width: 30%; /* Ширина правой колонки */
            float: right;
        }

        #content {
            box-sizing: content-box;
            padding-top: 15px;
        }

        .category-button {
            border-radius: 5px;
            width: 170px;
            height: 120px;
        }

        .dish-button {
            border-radius: 5px;
            width: 200px;
            height: 150px;
        }

        .dish-table {
            text-align: center;
            border-collapse: separate;
            border-spacing: 40px 10px;
        }
    </style>
</head>
<body>
<table class="table table-bordered" id="header">
    <tr>
        <td id="header-cashier">Cashier</td>
        <td id="corporation-name">Automatisation Inc.</td>
        <td id="header-bill">Check №</td>
    </tr>
</table>
<div id="container">
    <div id="nav" class="col-md-2">
        <c:forEach items="${dishTypes}" var="dishType" varStatus="count">
            <input type="image" src="/img/${dishType}.jpg" class="category-button" id="${dishType}">
            <p><strong>${dishType}</strong></p>
        </c:forEach>
    </div>
    <div id="aside">Правая колонка</div>
    <div id="content" class="col-md-7">
        <c:forEach items="${dishesByType}" var="dish" varStatus="count">
            <div class="col-md-2">
                <input type="image" src="${dish.url}" class="dish-button" id=${dish.name}>
                <p><strong>${dish.name}</strong></p>
                <p>${dish.weight}g. / ${dish.price}$</p>
            </div>
        </c:forEach>
    </div>
</div>
</body>
</html>
