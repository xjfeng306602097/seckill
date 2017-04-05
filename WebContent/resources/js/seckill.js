//模块化javascript
var seckill = {
	//封装用于秒杀的URL
	URL : {

	},
	detail : {
		init : function(params) {
			//手机验证和登陆，计时交互
			var killPhone = $.cookie('killPhone');
			var startTime = params['startTime'];
			var endTime = params['endTime'];
			var seckillId = params['seckillId'];
			//验证手机号
			if (!seckill.validatePhone(killPhone)) {
				//绑定phone
				//控制输出
				var killPhoneModal = $('#killPhoneModal');
				killPhoneModal.modal({
					show : true, //显示弹出层
					backdrop : 'static', //禁止位置关闭
					keyboard : false //关闭键盘事件
				});
				//绑定事件
				$('#killPhoneBtn').click(function() {
					var inputPhone = $('#killPhoneKey').val();
					if (seckill.validatePhone(inputPhone)) {
						//绑定cookie，默认为7天
						$.cookie('killPhone', inputPhone, {
							expires : 7,
							path : '/'
						});
						window.location.reload();
					} else {
						//弹出提示框，实现动态效果
						$("#killPhoneMessage").hide().html('<label class="label label-danger">手机号错误</label>').show(300);
					}
				});
			}
		//已经登陆
		}
	},
	validatePhone : function(phone) {
		var pattern = /^1[34578]\d{9}$/;
		if (phone && pattern.test(phone)) {
			return true;
		} else {
			return false;
		}

	}
}