<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원조회</h1>

	<table border="1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>주소</th>
		</tr>
		<c:forEach items="${list}" var="item">
			<tr>
				<td>${item.id}</td>
				<td>${item.name}</td>
				<td>${item.addr}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>