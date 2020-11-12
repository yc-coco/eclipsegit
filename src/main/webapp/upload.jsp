<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="good/upload" method="post" enctype="multipart/form-data">
	<input type="file" name="upload" value="文件">
	<input type="submit" value="文件提交">
</form>

<a href="good/beanBD?name=good&age=14">hhh</a>

<form action="good/body" method="post" >
	<input name="name"  value="haha">
	<input name="age"value="15">
	<input type="submit" value="提交">
</form>

<form action="good/stringBody" method="post" >
	<input name="name"  value="haha">
	<input name="age"value="15">
	<input type="submit" value="提交">
</form>




</body>
</html>