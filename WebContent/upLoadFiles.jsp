<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传多文件</title>
</head>
<body>

	<form action="upLoadFiles.action" method="post"
		enctype="multipart/form-data">

		<input type="file" name="uploadfile"> 
		<input type="file" name="uploadfile"> 
		<input type="submit" value="上传">

	</form>
	
	<h1>${result }</h1>

</body>
</html>