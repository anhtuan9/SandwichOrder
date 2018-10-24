<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>đặt sandwich</title>
    <meta charset="UTF-8">
</head>
<body>
<h1>Sandwich Condiments</h1>
<form method="post">
    <table>
        <tr>
            <td><input type="checkbox" name="check" value="muoi">muối</td>
            <td><input type="checkbox" name="check" value="ot">tương ớt</td>
            <td><input type="checkbox" name="check" value="tieu">hạt tiêu</td>
            <td><input type="checkbox" name="check" value="duong">đường</td>
        </tr>
        <tr>
            <td><label for="save"></label> <input type="submit" name="save" id="save" value="lưu"></td>
        </tr>
    </table>
</form>
<p>${str}</p>
</body>
</html>
