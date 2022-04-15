<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Courses</title>
<style type="text/css">
        * {
            margin: 0px;
            box-sizing: border-box;
            padding: none;
            background-color: rgb(206, 206, 206);
        }
        header {
            background-color: rgb(72, 72, 255);
            height: 80px;
            font-size: 45px;
            text-align: center;
            padding: 10px;
            font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
            color: rgb(245, 245, 245);
        }
        #advert {
            background-color: rgb(72, 72, 255);
            width: 60vw;
            padding: 20px;
            margin: 60px auto;
            color: white;
            font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
            border-radius: 50px;
        }
        #inner{
            background-color: inherit;
            line-height: 40px;
            top: 20px;
            position: relative;
            width: 40vw;
            text-align: center;
            font-size: 40px;
            margin: auto;
        }
        .link{
            text-decoration: none;
            background-color: inherit;
            color: white;
            font-size: 25px;
            padding: 5px 30px;
            border: 2px solid white;
            border-radius: 10px;
            position: relative;
            left: 250px;
        }
        .info{
            background-color: blue;
            width: 50vw;
            border: 1px solid white;
            border-radius: 20px;
            font-size: 24px;
            margin: 20px auto;
            padding: 20px;
            line-height: 50px;
        }
    </style>
</head>
<body>
<header>LearNext</header>
	<div id="advert">
        <div id="inner">Courses</div><br><br><hr>
        <c:forEach items="${courseList}" var="course">
        <div class="info">
            Course Name : ${course.getCourseName()}<br>
            Fees : Rs.${course.getFees()}<br>
            Duration : ${course.getDuration()} weeks <br>
            Start Date : ${course.getStartDate()}
            <a href="" class="link">Enroll</a>
        </div>
        </c:forEach>
    </div>

</body>
</html>