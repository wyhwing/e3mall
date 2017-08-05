package cn.e3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.dao.TbItemMapper;
import cn.e3.pojo.TbItem;
import cn.e3.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	// 注入dao
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem geTbItemById(Long id) {
		TbItem tbItem = itemMapper.selectByPrimaryKey(id);
		return tbItem;
	}

}
