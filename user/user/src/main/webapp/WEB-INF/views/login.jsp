<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="UTF-8">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
	<h2>Login</h2>
    <form method="get" action='<c:url value="/user/login" />'>
        <table>
            <tbody>
                <tr><th align="left">ID</th>
                    <td><input type="text" name="UserId" id="UserId" /></td>
                </tr>
                <tr><th align="left">Password</th>
                    <td><input type="password" name="Password" id="Password" /></td>
                </tr>
                <tr><th></th>
                    <td><input type="submit" value="Submit" /></td>
                </tr>
            </tbody>
        </table>
    </form>
</body>
</html>