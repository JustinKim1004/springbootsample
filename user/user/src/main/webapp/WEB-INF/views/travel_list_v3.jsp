<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Travel</title>
</head>
<body>
	<h2>List of Travel</h2>    
    <table>
        <thead>
            <tr><th>제목</th>
                <th>관광지</th>
                <th>기간</th>
                <th>금액</th>
                <th>이미지</th>
            </tr>
        </thead>
        <tbody>
<c:forEach var="item" items="${TravelList}">
            <tr><td>${item.getTitle()}</td>
                <td>${item.getArea()}</td>
                <td>여행기간 ${item.getPeriod()}</td>
                <td>${item.getPrice()}</td>
                <td><a href='<c:url value="/user/travel/v3/${item.getId()}" />'><img src="${item.getImageUrl()}" width="100px" height="100px" /></a></td>
            </tr>
</c:forEach>
        </tbody>
    </table>
</body>
</html>