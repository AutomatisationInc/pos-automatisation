<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <meta charset="UTF-8">
    <title>Pos-Automatisation</title>
    <style>
        body {
            background: url("/static/img/start.jpg") center;
            background-size: cover;
            link: white;
        }

        #transparent-block {
            border-radius: 15px;
            background: black;
            opacity: 0.7;
            position: absolute;
            top: 25%;
            left: 25%;
            width: 50%;
            height: 50%;
            text-align: center;
            padding-top: 5%;
        }

        .button {
            text-transform: uppercase;
            font-weight: bold;
            border-radius: 15px;
            color: white;
            background-color: darkgrey;
            text-align: center;
            text-shadow: black;
            width: 250px;
            height: 40px;
        }
        .button:hover {
            background-color: green;
        }
    </style>
</head>
<body>
<script>

</script>
<div id="transparent-block">
    <form action="/cashier" method="get">
        <input type="submit" class="button" id="cashier-button" value="CASHIER"/>
    </form>
    <form action="" method="get">
        <input type="submit" class="button" id="kitchen-button" value="KITCHEN"/>
    </form>
    <form action="" method="get">
        <input type="submit" class="button" id="admin-button" value="ADMINISTRATION"/>
    </form>
</div>
</body>
</html>
