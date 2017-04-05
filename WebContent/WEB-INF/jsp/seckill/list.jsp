<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
 	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
	<title>秒杀列表</title>
</head>
<body>
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading text-center">
				<h2>秒杀列表</h2>
			</div>
			<div class="panel-body">
				<table class="table table-hover">
					<thead>
						<tr>
							<th class="text-center">名称</th>
							<th class="text-center">库存</th>
							<th class="text-center">开始时间</th>
							<th class="text-center">结束时间</th>
							<th class="text-center">创建时间</th>
							<th class="text-center">详情页</th>
						</tr>
					</thead>
					<tbody class="text-center">
						<c:forEach var="seckill" items="${seckillList }" varStatus="index">
							<tr>
								<td>${seckill.name}</td>
								<td>${seckill.number}</td>
								<td><fmt:formatDate value="${seckill.startTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
								<td><fmt:formatDate value="${seckill.endTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
								<td><fmt:formatDate value="${seckill.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
								<td><a class="btn btn-info" href="/SeckillProject/seckill/${seckill.seckillId}/detail" target="_blank">link</a></td>
							</tr>
						</c:forEach>
					</tbody> 
				</table>
			</div>
		</div>
	</div>
	
	
	
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>