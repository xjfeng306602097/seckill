var GalleryList = function(container, data, isIndex) {
	this.parentDiv = container;
	this.isIndex = isIndex;
	this.init(data);
}

GalleryList.prototype = {
	init : function(data) {
		// 判断是否首页
		if (this.isIndex == true) {
			var params = {};
			params.isIndex = true;
			$.get('getGalleryList', params ,function(result){
				
			});
		} else { // 非首页情况下考虑支持分页

		}
	}
}