<%--
  Created by IntelliJ IDEA.
  User: Man
  Date: 21.03.2017
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css">

    <meta charset="UTF-8">
    <title>Cashier</title>
    <style>
        @import url('https://fonts.googleapis.com/css?family=Lobster');
        @import url('https://fonts.googleapis.com/css?family=Bitter');
        #header {
            border: 2px solid white;
            background: #f6ca47;
            text-align: center;
            border-bottom-right-radius: 15px;
            border-bottom-left-radius: 15px;
        }
        #header-cashier, #header-bill {

            font-family: Bitter, serif;
            font-size: x-large;
            text-shadow:  1px 1px 1px black;

        }
        #corporation-name {
            font-family: Lobster,cursive;
            font-size: xx-large;
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
</body>
</html>
