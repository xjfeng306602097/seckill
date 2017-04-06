var Gallery = function(container, className, data){
	this.galleryId = data.seckillId;
	this.init(container, data);
	this.renderGalryInfo();
};

Gallery.prototype = {
	init : function(container, className, data){
		this.container = container;
		this.className = className;
		this.data = data;
		this.div = document.createElement("div");
		this.div.className = this.className;
		this.container.appendChild(this.div);
		this.href = document.createElement("a");
		this.href.setAttribute("href", data.seckillId + '/detail');
		this.div.appendChild(this.href);
		this.img = document.createElement("img");
		this.img.setAttribute("src", data.picture);
		this.img.className = "img-responsive";
		this.href.appendChild(this.img);
		this.galleryInfo = document.createElement("div");
		this.galleryInfo.className = "gallery-info";
		this.href.appendChild(this.galleryInfo);
		this.bottomBar = document.createElement("p");
		this.bottomBar.innerHTML = '<span class="glyphicon glyphicon-eye-open" aria-hidden="true" aria-hidden="true">View</span>';
		this.galleryInfo.appendChild(this.bottomBar);
		this.hrefForShop = document.createElement("a");
		this.hrefForShop.className = "shop";
		this.hrefForShop.setAttribute("href", data.seckillId + '/detail');
		this.galleryInfo.appendChild(this.hrefForShop);
		this.clearfix = document.createElement("div");
		this.clearfix.className = "clearfix";
		this.galleryInfo.appendChild(this.clearfix);
	},
	renderGalryInfo : function(){
		this.galryInfo = document.createElement("div");
		this.galryInfo.className = "galy-info";
		this.div.appendChild(this.galryInfo);
		this.galry = document.createElement("div");
		this.galry.className = "galry";
		this.galryInfo.appendChild(this.galry);
		this.prices = document.createElement("div");
		this.prices.className = "prices";
		this.prices.innerHTML = '<h5 class="item_price">' + this.data.price + '</h5>';
		this.galry.appendChild(this.prices);
		this.rating = document.createElement("div");
		this.rating.className = "rating";
		this.rating.innerHTML = '<span>☆</span> <span>☆</span> <span>☆</span> <span>☆</span> <span>☆</span>';
		this.clearfix = document.createElement("div");
		this.clearfix.className = "clearfix";
		this.galry.appendChild(this.clearfix);
	}
};