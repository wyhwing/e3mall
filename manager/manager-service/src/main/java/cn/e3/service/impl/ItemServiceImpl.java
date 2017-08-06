package cn.e3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.e3.common.pojo.EasyUIResult;
import cn.e3.dao.TbItemMapper;
import cn.e3.pojo.TbItem;
import cn.e3.pojo.TbItemExample;
import cn.e3.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	// 注入dao
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public EasyUIResult getItemList(int page, int rows) {
		// 设置分页信息
		PageHelper.startPage(page, rows);
		// 执行查询
		TbItemExample example = new TbItemExample();
		List<TbItem> list = itemMapper.selectByExample(example);
		// 取分页信息
		PageInfo<TbItem> info = new PageInfo<>(list);
		// 创建返回结果对象
		EasyUIResult result = new EasyUIResult();
		result.setTotal(info.getTotal());
		result.setRows(list);
		return result;
	}

}
