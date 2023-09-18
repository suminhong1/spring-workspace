<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="updateMember" method="post">
		ID: <input type="text" name="id" value="${vo.id}" readonly />
		password: <input type="password" name="pwd" value="${vo.pwd}" /><br>
		NAME: <input type="text" name="name" value="${vo.name}" /><br>
		ADDRESS: <input type="text" name="addr" value="${vo.addr}" /><br>
		<input type="submit" value="정보 수정">
	</form>
</body>
</html>