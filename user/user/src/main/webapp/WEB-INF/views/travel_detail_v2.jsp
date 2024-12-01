<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Travel</title>
</head>
<body>
	<h2>Travel Information</h2>
    <table>
        <tbody>
            <tr><td colspan="2">
                    <img src="${TravelImageUrl}" width="400px" height="400px" />
                </td>
            </tr>
            <tr><th>제목</th>
                <td>${TravelTitle}</td>
            </tr>
            <tr><th>관광지</th>
                <td>${TravelArea}</td>
            </tr>
            <tr><th>기간</th>
                <td>${TravelPeriod}</td>
            </tr>
            <tr><th>금액</th>
                <td>${TravelPrice}</td>
            </tr>
        </tbody>
    </table>
</body>
</html>