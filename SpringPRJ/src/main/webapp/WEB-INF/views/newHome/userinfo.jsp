<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title> 웹페이지 제목 </title>
</head>
<body>
<h1>Register</h1>

<form action="userHome" method="get">

    <%--이름--%>
    <label for="first-name">First Name:</label>
    <input name="fname" id = "first-name" type="text" placeholder="John" required>
    <label for="last-name">Last Name:</label>
    <input name = "lname" type="text"  id="last-name" placeholder="Smith"  required>
    <br>

    <%--성별--%>
    <label for="male">Male</label>
    <input type="radio" name="gender" id="male">
    <label for="female">Female</label>
    <input type="radio" name="gender" id="female">
    <label for="other">Other</label>
    <input type="radio" name="gender" id="other">



    <br>

    <%--이메일--%>
    <label for="email">Email:</label>
    <input type="email" name="email" id="email" placeholder="your email" required>
    <label for="password">Password:</label>
    <!-- <input type="password" name="password" id="password" minlength="5" maxlength="10" required> -->
    <input type="password" name="pwd" id="password" pattern=.{5,10} required title="=5이상 10이하의 문자를 입력하세연~!">

    <br>

    </select>
    <select name="day" id="day">
        <option >Day</option>
        <option value>1</option>
        <option value>2</option>
        <option value>3</option>
        <option value>4</option>
        <option value>5</option>
        <option value>6</option>
        <option value>7</option>
        <option value>8</option>
        <option value>9</option>
        <option value>10</option>
        <option value>11</option>
        <option value>12</option>
        <option >13</option>
        <option value>14</option>
        <option value>15</option>
        <option value>16</option>
        <option value>17</option>
        <option value>18</option>
        <option value>19</option>
        <option value>20</option>
        <option value>21</option>
        <option value>22</option>
        <option value>23</option>
        <option value>24</option>
        <option value>25</option>
        <option value>26</option>
        <option value>27</option>
        <option value>28</option>
        <option value>29</option>
        <option value>30</option>
        <option value>31</option>

    </select>
    <select name="month" id="month">
        <option value="">Month</option>
        <option value="">01</option>
        <option value="">02</option>
        <option value="">03</option>
        <option value="">04</option>
        <option value="">05</option>
        <option value="">06</option>
        <option value="">07</option>
        <option value="">08</option>
        <option value="">09</option>
        <option value="">10</option>
        <option value="">11</option>
        <option value="">12</option>
    </select>

    <select name="year" id="year">
        <option value="">Year</option>
        <option value="">1990</option>
        <option value="">1991</option>
        <option value="">1992</option>
        <option value="">1993</option>
        <option value="">1994</option>
        <option value="">1995</option>
        <option value="">1996</option>
        <option value="">1997</option>
        <option value="">1998</option>
        <option value="">1999</option>
        <option value="">2000</option>
        <option value="">2001</option>
        <option value="">2002</option>
        <option value="">2003</option>
        <option value="">2004</option>
        <option value="">2005</option>
        <option value="">2006</option>
        <option value="">2007</option>
        <option value="">2008</option>
        <option value="">2009</option>
        <option value="">2010</option>


    </select>
    <br>

    <br>
    <button type="submit">submit</button>

</form>
</body>
</html>