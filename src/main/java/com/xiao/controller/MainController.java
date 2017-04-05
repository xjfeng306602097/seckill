/**
 * @author xiaojunfeng
 * @version 1.0
 */
package com.xiao.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiao.bean.Seckill;
import com.xiao.service.SeckillService;

@Controller
@RequestMapping("/seckill")
public class MainController {

	@Resource
	private SeckillService seckillService;

	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		List<Seckill> seckillList = seckillService.getSeckillList();
		model.addAttribute(seckillList);
		return "seckill/list";
	}

	@RequestMapping(value = "/{seckillId}/detail", method = RequestMethod.GET)
	public String detail(@PathVariable("seckillId") Long seckillId, Model model) {
		if (seckillId == null) {
			return "redirect:/seckill/list";
		}
		Seckill seckill = seckillService.getSeckillById(seckillId);
		if (seckill == null) {
			return "forward:/seckill/list";
		}
		model.addAttribute(seckill);
		return "seckill/detail";
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String testBmap(Model model) {
		return "test";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String toIndex(Model model) {
		return "seckill/index";
	}

	@RequestMapping(value = "/shoppingIndex", method = RequestMethod.GET)
	public String toShoppingIndex(Model model) {
		return "seckill/shoppingIndex";
	}

	@RequestMapping(value = "/checkModal", method = RequestMethod.GET)
	public String toCheckModal(Model model) {
		return "modal/checkModal";
	}

	@RequestMapping(value = "/getAdvertisment", method = RequestMethod.GET)
	@ResponseBody
	public List<Seckill> getAdvertisment(int num) {
		List<Seckill> advertisments = seckillService.getSeckillList();
		return advertisments;
	}

}
