<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal"
			aria-hidden="true">&times;</button>
		<h3 class="modal-title text-center">
			<span class="glyphicon glyphicon-user"></span>
		</h3>
	</div>
	<div class="modal-body">
		<div class="row">
			<div class="col-xs-8 col-xs-offset-2">
				<input type="text" name="killPhone" id="killPhoneKey"
					placeholder="请填写手机号" class="form-control" />
			</div>
		</div>
	</div>
	<div class="modal-footer">
		<!-- 验证信息 -->
		<span id="killPhoneMessage" class="glyphicon"></span>
		<button id="killPhoneBtn" type="button" class="btn btn-success">
			<span class="glyphicon glyphicon-phone"></span> 提交
		</button>
		<button id="killPhoneCloseBtn" type="button" class="btn btn-primary"
			data-dismiss="modal">关闭</button>
	</div>
</body>
</html>