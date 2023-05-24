<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert user</title>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		var	$id;
		$("#id").focusout(function(){
			$id = $("#id").val();
			
			$.ajax({
				method: "GET",
				url: "/api/user/idCheck",
				data: {id:$id}
			}).done(function(msg){
				if(msg=="N"){
				$("#idCheck").html("이미 사용 중인 아이디 입니다.");
				$("#idCheck").attr("color","red");
				}else if(msg=="Y"){
					$("#idCheck").html("사용 가능한 아이디 입니다.");
					$("#idCheck").attr("color","green");
				}
			})
		})
	})
</script>
</head>

<body>
	<form action="/api/user/insert" method="post" name="insertForm">
	<ul style="list-style: none;">
		<li> ID : <input type="text" name="id" id="id"></li>
		<li> <font id="idCheck"></font> </li>
		<li> PASSWORD : <input type="text" name="password"></li>
		<li> PASSWORD CHECK : <input type="text" name="password"></li>
		<li> NAME : <input type="text" name="name"></li>
		<li> EMAIL : <input type="text" name="email"></li>
		<li> PHONE : <input type="text" name="phone"></li>
		<li><input type="submit" value="가입완료"></li>
	</ul>
	</form>
</body>
</html>