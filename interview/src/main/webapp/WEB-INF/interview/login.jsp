<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
		<div class="d-flex justify-content-center" style="border: 1px black solid; border-radius: 10px; width: 30%" >
		<div class="col-md-6">
			<form action="/api/user/login" method="post">
				<div class="col-10 m-3">
					<label for="id" class="visually-hidden">ID</label> 
					<input type="text" class="form-control" id="id" name="id">
				</div>
				<div class="col-10 m-3">
					<label for="password" class="visually-hidden">Password</label>
					<input type="password" class="form-control" id="password" placeholder="Password" name="password">
				</div>
				<div class="col-auto">
					<input type="submit" value="로그인">
					<a href="/api/page/insert">회원가입</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>