<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here </title>
<link rel="stylesheet" href="./home.css">
</head>
<body>
    <% 
        @Autowired
        KundeRepo repo;
        out.print(repo.findByName("test"));
    %>
</body>
</html>