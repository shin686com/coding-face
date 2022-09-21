<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title> 웹페이지 제목 </title>
</head>
<body>


<form action="update_st" method="get">


    이름 : <input type="text" name="user_name">
    <br>
    성별 : <input type="radio" name="user_gender" value="man">남자
    <input type="radio" name="user_gender" value="woman">여자

    <br>
    ID : <input type="text" name="user_id">
    <br>
    비밀번호 : <input type="password" name="user_pwd">
    <br>
    email : <input type="email" name="user_email">

    <br>

    <input type="submit" value="회원정보 수정하기">

</form>

<form action="delete" method="get">
    <input type="submit" value="삭제하기">
</form>
</body>
</html>