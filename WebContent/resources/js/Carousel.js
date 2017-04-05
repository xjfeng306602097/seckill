// data为后端查询后生成的数据
var Carousel = function(container, data) {
	this.init(container, data);
	this.render();
}

Carousel.prototype = {
	init : function(container, data) {
		this.container = container;
		this.data = data;
		this.container.className = 'carousel slide';
	},
	render : function() {
		this.carouselIndicators = document.createElement("ol");
		this.carouselIndicators.className = 'carousel-indicators';
		this.container.appendChild(this.carouselIndicators);
		this.carouselInner = document.createElement("div");
		this.carouselInner.className = 'carousel-inner';
		this.container.appendChild(this.carouselInner);
		this.renderCarouselIndicators(); // 轮播（Carousel）指标
		this.renderCarouselInner(); // 加载轮播项目
		this.renderCarouselControl(); // 加载控制按钮
	},
	renderCarouselIndicators : function() {
		for (var a = 0; a < this.data.length; a++) {
			var li = document.createElement("li");
			li.setAttribute("data-slide-to", a);
			li.setAttribute("data-target", "#" + this.container.id);
			if (a == 0) {
				li.className = 'active';
			}
			this.carouselIndicators.appendChild(li);
		}
	},
	renderCarouselInner : function() {
		for (var a = 0; a < this.data.length; a++) {
			var item = document.createElement("div");
			if (a != 0) {
				item.className = 'item';
			} else {
				item.className = 'item active';
			}
			var submit = document.createElement("a");
			submit.setAttribute("href", this.data[a].seckillId + '/detail');
			var img = document.createElement("img");
			img.seckillId = this.data[a].seckillId;
			img.setAttribute("src", this.data[a].picture);
			// img.addEventListener("click", this.getDetails, false);
			item.appendChild(submit);
			submit.appendChild(img);
			var caption = document.createElement("div");
			caption.className = 'carousel-caption'
			var title = document.createElement("h4");
			title.innerHTML = this.data[a].name;
			caption.appendChild(title);
			var text = document.createElement("p");
			text.innerHTML = this.data[a].description;
			caption.appendChild(text);
			item.appendChild(caption);
			this.carouselInner.appendChild(item);
		}
	},
	renderCarouselControl : function() {
		// 左边控制栏
		this.leftControl = document.createElement("a");
		this.leftControl.className = 'left carousel-control';
		this.leftControl.setAttribute("data-slide", "prev");
		this.leftControl.setAttribute("href", "#" + this.container.id);
		// 右边控制栏
		this.rightControl = document.createElement("a");
		this.rightControl.className = 'right carousel-control';
		this.rightControl.setAttribute("data-slide", "next");
		this.rightControl.setAttribute("href", "#" + this.container.id);
		this.container.appendChild(this.leftControl);
		this.container.appendChild(this.rightControl);
	},
	setAutoSlide : function(seconds) {
		this.seconds = seconds;
		$('#' + this.container.id).carousel({
			interval : seconds
		});
	},
	getDetails : function(ev) {
		var self = ev.target;
		var sekcillId = self.seckillId;
	},
	destroy : function() {
	}
}