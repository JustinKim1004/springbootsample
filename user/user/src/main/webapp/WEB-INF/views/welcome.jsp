<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome After Login</title>
</head>
<body>
	<h2>Welcome to ${Name}</h2>
    <a href='<c: urlvalue="/user/travel" />'>
        <img src="https://www.koreanair.com/wwwupload/maincontents/serviceguide/241113_web_bonus_hotpick.jpg"  />
    </a>
</body>
</html>