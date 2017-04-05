<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<style type="text/css">
.paginationDiv {
	margin: 0 auto;
	width: 400px;
	height: 100px;
}

.paginationDiv ul {
	margin-top: 30px;
	margin-left: 80px
}
</style>
</head>
<body>
	<nav class="navbar navbar-inverse" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#home" data-toggle="tab">精品秒杀 </a>
		</div>
		<div class="navbar-right">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">IOS</a></li>
				<li><a href="#">SVN</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">JAVA<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a data-toggle="tab" href="#menu1">菜单1<span
								class="badge pull-right">168</span></a></li>
						<li><a data-toggle="tab" href="#menu2">菜单2</a></li>
						<li class="divider"></li>
						<li><a data-toggle="tab" href="#menu3">菜单3<span
								class="badge pull-right">30</span></a></li>
					</ul></li>
			</ul>
		</div>
	</div>
	</nav>
	<div class="container">
		<ul class="nav nav-tabs nav-justified">
			<li class="active"><a data-toggle="tab" href="#home">主页</a></li>
			<li><a data-toggle="tab" href="#menu1">菜单1</a></li>
			<li><a data-toggle="tab" href="#menu2">菜单2</a></li>
			<li><a data-toggle="tab" href="#menu3">菜单3</a></li>
			<li><a data-toggle="tab" href="#menu4">菜单4</a></li>
		</ul>
		<div class="tab-content">
			<div id="home" class="tab-pane fade in active">
				<ol class="breadcrumb">
					<li><a href="#home" data-toggle="tab">Home</a></li>
					<li><a href="#menu1" data-toggle="tab">2013</a></li>
					<li class="active">十一月</li>
				</ol>
				<h3>首页</h3>
				<p>This is the first page</p>
				<div class="panel panel-primary">
					<div class="panel-heading">Title</div>
					<div class="panel-body">What the fuck is that</div>
					<table class="table">
						<th>产品</th>
						<th>价格</th>
						<tr>
							<td>产品A</td>
							<td>200</td>
						</tr>
						<tr>
							<td>产品B</td>
							<td>300</td>
						</tr>
						<tr>
							<td>产品C</td>
							<td>400</td>
						</tr>
					</table>
					<div class="paginationDiv">
						<ul class="pagination">
							<li><a href="#">&laquo;</a></li>
							<li class="active"><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
							<li><a href="#">&raquo;</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div id="menu1" class="tab-pane fade">
				<h3>Menu1</h3>
				<p>This is menu1</p>
				<button class="btn btn-success" id="openModal">
					<span class="glyphicon glyphicon-pencil">Write Here</span>
				</button>
				<div id="writeModal" class="modal fade">
					<div class="modal-dialog">
						<div class="modal-content"></div>
					</div>
				</div>
			</div>
			<div id="menu2" class="tab-pane fade">
				<h3>Menu2</h3>
				<p>This is menu2</p>
			</div>
			<div id="menu3" class="tab-pane fade">
				<h3>Menu3</h3>
				<p>This is menu3</p>
			</div>
			<div id="menu4" class="tab-pane fade">
				<h3>Menu4</h3>
				<p>This is menu4</p>
			</div>
		</div>
	</div>
	<%@include file="common/bootstrap-common.jsp"%>
	<script type="text/javascript">
		$(function() {
			$('#openModal').click(function() {
				$('#writeModal').modal({
					show : true, //显示弹出层
					backdrop : 'static', //禁止位置关闭
					keyboard : true, //关闭键盘事件
					remote : "checkModal"
				});
			});
			$(function() {
				$('#writeModal').on('hide.bs.modal', function() {
					alert('嘿，我听说您喜欢模态框...');
				})
			});
		});
	</script>
</body>
</html>
