<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Second Kill</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<style type="text/css">

hr {
	width: 60%;
	border-top: 1px ridge black;
	margin: 5px;
}

.dropDownPanel_Big {
	width: 700px;
}

.dropDownPanel_Mid {
	width: 530px;
}

.navhover li:hover {
	display: block;
	background: #080808;
}
</style>
<link rel="stylesheet" href="../css/style.css" type="text/css">
<link rel="stylesheet" href="../css/login.css" type="text/css">
</script>
</head>
<body>
	<%@include file="common/bootstrap-common.jsp"%>
	<div class="header">
		<nav class="navbar navbar-inverse" role="navigation">
		<div class="navbar-header">
			<a class="navbar-brand" href="#home" data-toggle="tab">精品秒杀 </a>
		</div>
		<div class="collapse navbar-collapse" id="seckill_navbar_collapse">
			<ul class="nav navbar-nav navhover">
				<li><a href="index" class="active">秒杀专场</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">家电<b class="caret"></b></a>
					<ul class="dropdown-menu multi-column columns-4">
						<div class="row dropDownPanel_Big" align="center">
							<div class="col-sm-3">
								<h4>By Relation</h4>
								<ul class="multi-column-dropdown" align="left">
									<li><a class="list" href="products.html">Friend</a></li>
									<li><a class="list" href="products.html">Lover</a></li>
									<li><a class="list" href="products.html">Sister</a></li>
									<li><a class="list" href="products.html">Brother</a></li>
									<li><a class="list" href="products.html">Kids</a></li>
									<li><a class="list" href="products.html">Parents</a></li>
								</ul>
							</div>
							<div class="col-sm-3">
								<h4>By Flavour</h4>
								<ul class="multi-column-dropdown" align="left">
									<li><a class="list" href="products.html">Chocolate</a></li>
									<li><a class="list" href="products.html">Mixed Fruit</a></li>
									<li><a class="list" href="products.html">Butterscotch</a></li>
									<li><a class="list" href="products.html">Strawberry</a></li>
									<li><a class="list" href="products.html">Vanilla</a></li>
									<li><a class="list" href="products.html">Eggless Cakes</a></li>
								</ul>
							</div>
							<div class="col-sm-3">
								<h4>By Theme</h4>
								<ul class="multi-column-dropdown" align="left">
									<li><a class="list" href="products.html">Heart shaped</a></li>
									<li><a class="list" href="products.html">Cartoon Cakes</a></li>
									<li><a class="list" href="products.html">2-3 Tier
											Cakes</a></li>
									<li><a class="list" href="products.html">Square shape</a></li>
									<li><a class="list" href="products.html">Round shape</a></li>
									<li><a class="list" href="products.html">Photo cakes</a></li>
								</ul>
							</div>
							<div class="col-sm-3">
								<h4>Weight</h4>
								<ul class="multi-column-dropdown" align="left">
									<li><a class="list" href="products.html">1 kG</a></li>
									<li><a class="list" href="products.html">1.5 kG</a></li>
									<li><a class="list" href="products.html">2 kG</a></li>
									<li><a class="list" href="products.html">3 kG</a></li>
									<li><a class="list" href="products.html">4 kG</a></li>
									<li><a class="list" href="products.html">Large</a></li>
								</ul>
							</div>
						</div>
					</ul></li>
				<li class="dropdown grid"><a href="#"
					class="dropdown-toggle list1" data-toggle="dropdown">Wedding<b
						class="caret"></b></a>
					<ul class="dropdown-menu multi-column columns-4">
						<div class="row dropDownPanel_Big" align="center">
							<div class="col-sm-3">
								<h4>By Relation</h4>
								<ul class="multi-column-dropdown" align="left">
									<li><a class="list" href="products.html">Friend</a></li>
									<li><a class="list" href="products.html">Lover</a></li>
									<li><a class="list" href="products.html">Sister</a></li>
									<li><a class="list" href="products.html">Brother</a></li>
									<li><a class="list" href="products.html">Kids</a></li>
									<li><a class="list" href="products.html">Parents</a></li>
								</ul>
							</div>
							<div class="col-sm-3">
								<h4>By Flavour</h4>
								<ul class="multi-column-dropdown" align="left">
									<li><a class="list" href="products.html">Chocolate</a></li>
									<li><a class="list" href="products.html">Mixed Fruit</a></li>
									<li><a class="list" href="products.html">Butterscotch</a></li>
									<li><a class="list" href="products.html">Strawberry</a></li>
									<li><a class="list" href="products.html">Vanilla</a></li>
									<li><a class="list" href="products.html">Eggless Cakes</a></li>
								</ul>
							</div>
							<div class="col-sm-3">
								<h4>By Theme</h4>
								<ul class="multi-column-dropdown" align="left">
									<li><a class="list" href="products.html">Heart shaped</a></li>
									<li><a class="list" href="products.html">Cartoon Cakes</a></li>
									<li><a class="list" href="products.html">2-3 Tier
											Cakes</a></li>
									<li><a class="list" href="products.html">Square shape</a></li>
									<li><a class="list" href="products.html">Round shape</a></li>
									<li><a class="list" href="products.html">Photo cakes</a></li>
								</ul>
							</div>
							<div class="col-sm-3">
								<h4>Weight</h4>
								<ul class="multi-column-dropdown" align="left">
									<li><a class="list" href="products.html">1 kG</a></li>
									<li><a class="list" href="products.html">1.5 kG</a></li>
									<li><a class="list" href="products.html">2 kG</a></li>
									<li><a class="list" href="products.html">3 kG</a></li>
									<li><a class="list" href="products.html">4 kG</a></li>
									<li><a class="list" href="products.html">Large</a></li>
								</ul>
							</div>
						</div>
					</ul></li>
				<li class="dropdown grid"><a href="#"
					class="dropdown-toggle list1" data-toggle="dropdown">Special
						Offers <b class="caret"></b>
				</a>
					<ul class="dropdown-menu multi-column columns-4">
						<div class="row dropDownPanel_Big" align="center">
							<div class="col-sm-3">
								<h4>By Relation</h4>
								<ul class="multi-column-dropdown" align="left">
									<li><a class="list" href="products.html">Friend</a></li>
									<li><a class="list" href="products.html">Lover</a></li>
									<li><a class="list" href="products.html">Sister</a></li>
									<li><a class="list" href="products.html">Brother</a></li>
									<li><a class="list" href="products.html">Kids</a></li>
									<li><a class="list" href="products.html">Parents</a></li>
								</ul>
							</div>
							<div class="col-sm-3">
								<h4>By Flavour</h4>
								<ul class="multi-column-dropdown" align="left">
									<li><a class="list" href="products.html">Chocolate</a></li>
									<li><a class="list" href="products.html">Mixed Fruit</a></li>
									<li><a class="list" href="products.html">Butterscotch</a></li>
									<li><a class="list" href="products.html">Strawberry</a></li>
									<li><a class="list" href="products.html">Vanilla</a></li>
									<li><a class="list" href="products.html">Eggless Cakes</a></li>
								</ul>
							</div>
							<div class="col-sm-3">
								<h4>By Theme</h4>
								<ul class="multi-column-dropdown" align="left">
									<li><a class="list" href="products.html">Heart shaped</a></li>
									<li><a class="list" href="products.html">Cartoon Cakes</a></li>
									<li><a class="list" href="products.html">2-3 Tier
											Cakes</a></li>
									<li><a class="list" href="products.html">Square shape</a></li>
									<li><a class="list" href="products.html">Round shape</a></li>
									<li><a class="list" href="products.html">Photo cakes</a></li>
								</ul>
							</div>
							<div class="col-sm-3">
								<h4>Weight</h4>
								<ul class="multi-column-dropdown" align="left">
									<li><a class="list" href="products.html">1 kG</a></li>
									<li><a class="list" href="products.html">1.5 kG</a></li>
									<li><a class="list" href="products.html">2 kG</a></li>
									<li><a class="list" href="products.html">3 kG</a></li>
									<li><a class="list" href="products.html">4 kG</a></li>
									<li><a class="list" href="products.html">Large</a></li>
								</ul>
							</div>
						</div>
					</ul></li>
				<li class="dropdown grid"><a href="#"
					class="dropdown-toggle list1" data-toggle="dropdown">Store<b
						class="caret"></b></a>
					<ul class="dropdown-menu multi-column columns-3">
						<div class="row dropDownPanel_Mid" align="center">
							<div class="col-sm-4">
								<h4>By Relation</h4>
								<ul class="multi-column-dropdown" align="left">
									<li><a class="list" href="products.html">Friend</a></li>
									<li><a class="list" href="products.html">Lover</a></li>
									<li><a class="list" href="products.html">Sister</a></li>
									<li><a class="list" href="products.html">Brother</a></li>
									<li><a class="list" href="products.html">Kids</a></li>
									<li><a class="list" href="products.html">Parents</a></li>
								</ul>
							</div>
							<div class="col-sm-4">
								<h4>By Flavour</h4>
								<ul class="multi-column-dropdown" align="left">
									<li><a class="list" href="products.html">Chocolate</a></li>
									<li><a class="list" href="products.html">Mixed Fruit</a></li>
									<li><a class="list" href="products.html">Butterscotch</a></li>
									<li><a class="list" href="products.html">Strawberry</a></li>
									<li><a class="list" href="products.html">Vanilla</a></li>
									<li><a class="list" href="products.html">Eggless Cakes</a></li>
								</ul>
							</div>
							<div class="col-sm-4">
								<h4>Specials</h4>
								<ul class="multi-column-dropdown" align="left">
									<li><a class="list" href="products.html">Ice cream
											cake</a></li>
									<li><a class="list" href="products.html">Swiss roll</a></li>
									<li><a class="list" href="products.html">Ruske kape</a></li>
									<li><a class="list" href="products.html">Cupcakes</a></li>
									<li><a class="list" href="products.html">Muffin</a></li>
									<li><a class="list" href="products.html">Merveilleux</a></li>
								</ul>
							</div>
						</div>
					</ul></li>
			</ul>
			<form class="navbar-form navbar-left" role="search">
				<div class="form-group input-group-sm">
					<input type="text" class="form-control" placeholder="Search">
				</div>
				<button type="submit" class="btn btn-default btn-sm">
					<span class="glyphicon glyphicon-search"></span>Submit
				</button>
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li><p class="navbar-text">Already have an account?</p></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><b>Login</b> <span class="caret"></span></a>
					<ul id="login-dp" class="dropdown-menu">
						<li>
							<div class="row">
								<div class="col-md-12">
									<span class="glyphicon glyphicon-user"
										style="padding-bottom: 5px"></span>
									<form class="form" role="form" method="post" action="login"
										accept-charset="UTF-8" id="login-nav">
										<div class="form-group">
											<label class="sr-only" for="exampleInputEmail2">Email
												address</label> <input type="email" class="form-control"
												id="exampleInputEmail2" placeholder="Email address" required>
										</div>
										<div class="form-group">
											<label class="sr-only" for="exampleInputPassword2">Password</label>
											<input type="password" class="form-control"
												id="exampleInputPassword2" placeholder="Password" required>
											<div class="help-block text-right">
												<a href="">Forget the password ?</a>
											</div>
										</div>
										<div class="form-group">
											<button type="submit" class="btn btn-primary btn-block">Sign
												in</button>
										</div>
										<div class="checkbox">
											<label> <input type="checkbox"> keep me
												logged-in
											</label>
										</div>
									</form>
								</div>
								<div class="bottom text-center">
									New here ? <a href="#"><b>Join Us</b></a>
								</div>
							</div>
						</li>
					</ul></li>
			</ul>
		</div>
		</nav>
	</div>
	<div id="carousel_Advertisment"></div>
	<div class="gallery">
		<div class="container">
			<div class="gallery-grids">
				<div class="row">
					<div class="col-md-8 gallery-grid glry-one">
						<a href="products.html"><img src="../img/1.jpg"
							class="img-responsive" alt="" />
							<div class="gallery-info">
								<p>
									<span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
									view
								</p>
								<a class="shop" href="single.html">SHOP NOW</a>
								<div class="clearfix"></div>
							</div> </a>
						<div class="galy-info">
							<p>Lorem Ipsum is simply</p>
							<div class="galry">
								<div class="prices">
									<h5 class="item_price">$95.00</h5>
								</div>
								<div class="rating">
									<span>☆</span> <span>☆</span> <span>☆</span> <span>☆</span> <span>☆</span>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
					<div class="col-md-4 gallery-grid glry-two">
						<a href="products.html"><img src="../img/2.gif"
							class="img-responsive" alt="" />
							<div class="gallery-info galrr-info-two">
								<p>
									<span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
									view
								</p>
								<a class="shop" href="single.html">SHOP NOW</a>
								<div class="clearfix"></div>
							</div> </a>
						<div class="galy-info">
							<p>Lorem Ipsum is simply</p>
							<div class="galry">
								<div class="prices">
									<h5 class="item_price">$95.00</h5>
								</div>
								<div class="rating">
									<span>☆</span> <span>☆</span> <span>☆</span> <span>☆</span> <span>☆</span>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-3 gallery-grid ">
						<a href="products.html"><img src="../img/3.png"
							class="img-responsive" alt="" />
							<div class="gallery-info">
								<p>
									<span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
									view
								</p>
								<a class="shop" href="single.html">SHOP NOW</a>
								<div class="clearfix"></div>
							</div> </a>
						<div class="galy-info">
							<p>Lorem Ipsum is simply</p>
							<div class="galry">
								<div class="prices">
									<h5 class="item_price">$95.00</h5>
								</div>
								<div class="rating">
									<span>☆</span> <span>☆</span> <span>☆</span> <span>☆</span> <span>☆</span>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
					<div class="col-md-3 gallery-grid ">
						<a href="products.html"><img src="../img/3.png"
							class="img-responsive" alt="" />
							<div class="gallery-info">
								<p>
									<span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
									view
								</p>
								<a class="shop" href="single.html">SHOP NOW</a>
								<div class="clearfix"></div>
							</div> </a>
						<div class="galy-info">
							<p>Lorem Ipsum is simply</p>
							<div class="galry">
								<div class="prices">
									<h5 class="item_price">$95.00</h5>
								</div>
								<div class="rating">
									<span>☆</span> <span>☆</span> <span>☆</span> <span>☆</span> <span>☆</span>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
					<div class="col-md-3 gallery-grid ">
						<a href="products.html"><img src="../img/3.png"
							class="img-responsive" alt="" />
							<div class="gallery-info">
								<p>
									<span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
									view
								</p>
								<a class="shop" href="single.html">SHOP NOW</a>
								<div class="clearfix"></div>
							</div> </a>
						<div class="galy-info">
							<p>Lorem Ipsum is simply</p>
							<div class="galry">
								<div class="prices">
									<h5 class="item_price">$95.00</h5>
								</div>
								<div class="rating">
									<span>☆</span> <span>☆</span> <span>☆</span> <span>☆</span> <span>☆</span>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
					<div class="col-md-3 gallery-grid ">
						<a href="products.html"><img src="../img/3.png"
							class="img-responsive" alt="" />
							<div class="gallery-info">
								<p>
									<span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
									view
								</p>
								<a class="shop" href="single.html">SHOP NOW</a>
								<div class="clearfix"></div>
							</div> </a>
						<div class="galy-info">
							<p>Lorem Ipsum is simply</p>
							<div class="galry">
								<div class="prices">
									<h5 class="item_price">$95.00</h5>
								</div>
								<div class="rating">
									<span>☆</span> <span>☆</span> <span>☆</span> <span>☆</span> <span>☆</span>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/js/Carousel.js"></script>
	<script type="text/javascript">
		$(function() {
			var carouselDiv = document.getElementById("carousel_Advertisment");
			var params = {};
			params.num = 5;
			$.get('getAdvertisment', params, function(result) {
				var carouSel = new Carousel(carouselDiv, result);
				carouSel.setAutoSlide(3000);
			});
		});
	</script>
</body>
</html>