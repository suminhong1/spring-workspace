<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>회원 관리 기능</h1>
	
	<ul>
		<li><a href="search">회원검색</a>
		<c:choose>
			<c:when test="${empty vo}">
				<li><a href="register">회원가입</a></li>
				<li><a href="login">로그인</a></li>
			</c:when>
			<c:otherwise>
				<li><a href="allMember">전체 회원 보기</a></li>
				<li><a href="logout">로그아웃</a></li>
				<li><a href="update">회원 정보 수정</a></li>
			</c:otherwise>
		</c:choose>
	</ul>

</body>
</html>