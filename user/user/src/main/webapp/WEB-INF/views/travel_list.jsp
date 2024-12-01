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
            <tr><td>규슈 3,4일 #100% 출발확정 #온천 여행 #유후인 산책</td>
                <td>유후,벳푸,후쿠오카,다자이후,구마모토,오이타</td>
                <td>여행기간 3/4일</td>
                <td>539,900~</td>
                <td><a href='<c:url value="/user/travel/v2/123" />'><img src="https://image.hanatour.com/usr/cms/resize/400_0/2016/12/19/10000/854690ab-5c8e-48f3-aefa-c1ed4085c2d0.png" width="100px" height="100px" /></a></td>
            </tr>
            <tr><td>튀르키예(터키) 일주 8~10일 #베스트셀러 #이스탄불 시내호텔1박 #루프탑레스토랑 #동굴호텔</td>
                <td>터키 국내선 이동으로 편안한 장거리 이동, 이스탄불 시내호텔, 루프탑 레스토랑, 동굴호텔, 온천호텔 등으로 구성된 터키일주 BEST 상품</td>
                <td>여행기간 9/10/12일</td>
                <td>2,919,000~</td>
                <td><a href='<c:url value="/user/travel/v2/456" />'><img src="https://image.hanatour.com/usr/cms/resize/400_0/2020/01/23/10000/9a28c458-ee80-4890-bc49-8ebb3bf96383.jpg"  width="100px" height="100px" /></td>
            </tr>
        </tbody>
    </table>
</body>
</html>