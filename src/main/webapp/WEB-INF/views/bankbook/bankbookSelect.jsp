<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<c:import url="../temp/boot_head.jsp"></c:import>
</head>
<body>
<c:import url="../temp/boot_nav.jsp"></c:import>
<h1>Select Page</h1>
	
	<div class="container-fluid">
		<h3>BookNumber : ${dto.bookNumber}</h3>
		<h3>BookName : ${dto.bookName}</h3>
		<h3>BookRate : ${dto.bookRate} </h3>
		<h3>BookSale : ${dto.bookSale}</h3>
		
		<a href="./bankbookDelete?bookNumber=${dto.bookNumber}">Delete</a>
		<a href="./bankbookUpdate?bookNumber=${dto.bookNumber}">Update</a>
	</div>

</body>
</html>