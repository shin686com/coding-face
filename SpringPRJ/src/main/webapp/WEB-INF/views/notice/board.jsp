<%@ page import="kopo.poly.dto.NoticeDTO" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%
    List<NoticeDTO> rList = (List<NoticeDTO>) request.getAttribute("List");
    %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>웹페이지 제목</title>
</head>
<body>
    <h1> 회원가입 목록 상세보기 게시판</h1>
    <form action="insert" method="get">
        <table border="1" width="100%">

    <tr>
        <td>이름</td>
        <td>id</td>
        <td>비밀번호</td>
    </tr>

  <% for (int i =0; i<rList.size(); i++)
  {
      %>

    <tr>
        <td><%= rList.get(i).getUser_seq()%> </td>
        <td><%= rList.get(i).getUser_name()%></td>
        <td> <%= rList.get(i).getUser_gender()%></td>
        <td> <%= rList.get(i).getUser_id()%></td>
        <td> <%= rList.get(i).getUser_pwd()%></td>
        <td> <%= rList.get(i).getUser_email()%></td>
    </tr>
            <% } %>
        </table>

        <button type="submit">로그인하기</button>

    </form>
</body>
</html>