<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Conta Especial</title>
</head>
<body>
    <h1>Conta Especial</h1>
    <form action="ContaEspecialServlet" method="post">
        <label for="valor">Valor:</label>
        <input type="text" id="valor" name="valor">
        <input type="submit" value="Sacar">
    </form>
    <p>Saldo: <%= request.getAttribute("saldo") %></p>
</body>
</html>