var Gallery = function(container, className, data){
	this.init(container, data);
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
	}
};