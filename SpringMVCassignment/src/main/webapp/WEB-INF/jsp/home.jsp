<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
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
           height: 300px;
           width: 60vw;
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
           padding: 5px 20px;
           margin: 10px;
           border: 2px solid white;
           border-radius: 10px;
           position: relative;
           top: 150px;
           left: 30vw;
       }
   </style>
</head>
<body>
    <header>LearNext</header>
    <div id="advert">
        <div id="inner">
            Welcome to LearNext
        </div>
        <a class="link" href="/SpringMVCassignment/login">Login</a>
        <a  class="link" href="/SpringMVCassignment/register">Register</a>
    </div>
</body>
</html>