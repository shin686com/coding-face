<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title> 웹페이지 제목 </title>
</head>
<body>
<h1>로그인</h1>



<form action="login_st" method="post">

    id:<input type="text" name="id"><br>
    비밀번호<input type="password" name="password">
<br>
    <input type="submit" value="로그인">

</form>





<form action="insert" method="get">
    <input type="submit" value="회원가입하기">
</form>


</body>
</html>