<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<html>  
<body>  
<h2>Hello World!</h2>  
 ${user.id}<br>  
 ${user.username}<br>  
 ${user.password}<br>  
 
 
 <form action="getuser" method="post">
        username:<input type="text" name="username"><br /> <input type="submit"
            value="登陆">
    </form>
   
</body>  
</html>
