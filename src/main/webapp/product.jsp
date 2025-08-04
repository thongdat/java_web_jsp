<%--
  Created by IntelliJ IDEA.
  User: DAT
  Date: 8/4/2025
  Time: 8:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/product" method="post">
  <input type="text" name="productDescription" placeholder="mo ta san pham" value="${productDescription}">
  <input type="number" name="listPrice" placeholder="gia niem yet" value ="${listPrice}">
  <input type="number" name="discountPercent" placeholder="ty le chiet khau" value="${discountPercent}">
  <button type ="submit"> Tinh chiet khau </button>

    <h1>kết quả</h1>
    <h3>mô tả: ${productDescription}</h3>
    <h3>Giá niêm yết: ${listPrice}</h3>
    <h3> Tỷ lệ chiết khấu: ${discountPercent}</h3>
    <h3>Giá sau khi chiết khấu: ${calculatedPrice}</h3>

</form>

</body>
</html>
