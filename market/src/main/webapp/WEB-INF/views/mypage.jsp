
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        ul{
            background-color:white;
            width: 100%;
            list-style-type: none;
            margin: 0;
            padding: 0;
            border: solid 1px gray;
        }
        li{border-bottom: solid 1px gray;}
        li:last-child{border-bottom: none;}
        li a{
            display: block;
            color:black;
            padding: 8px;
            text-align: center;
            text-decoration: none;
            font-weight: bold;
        }
        li a.current{
            color: #DF4D4D;
        }
        li a:hover:not(.current){
            color: #DF4D4D;
        }
        .outer-div1 {
            width : 100%;
            height : 20%;
            background-color: gray;
            text-align: center;
        }
        .outer-div2 {
            width : 100%;
            height : 50%;
            border: 1px solid black;
            text-align: center;
        }
        .name{
            width: 80%;
            height: 80%;
            background-color: white;
            margin: 20px;
            display: inline-block;
        }
        .sidebar {
            width : 15%;
            display: inline-block;
            border: 1px solid red;
        }
        .contents{
            display: inline-block;
            width: 60%;
            border: 1px solid green;
        }
    </style>
</head>
<body>
<div class='outer-div1'>
    <div class='name'>
        <br>
        아이디 : <br><br>
        이메일 : <br><br>
        가입날짜 :
    </div>
</div>
<div class='outer-div2'>
    <div class='sidebar'>
        <ul>
            <li><a>추가 정보 수정</a></li>
            <li><a>개인 정보 수정</a></li>
            <li><a>주소지 관리</a></li>
            <li><a>기간별 판매량조회</a></li>
            <li><a>재고 관리</a></li>
            <li><a>재료 등록</a></li>
            <li><a>고객센터</a></li>
        </ul>
    </div>
    <div class='contents'>

    </div>
</div>
</body>
</html>
