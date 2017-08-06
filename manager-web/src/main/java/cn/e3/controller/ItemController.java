package cn.e3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.common.pojo.EasyUIResult;
import cn.e3.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;

	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIResult getItemList(Integer page, Integer rows) {
		EasyUIResult list = itemService.getItemList(page, rows);
		return list;
	}

}
