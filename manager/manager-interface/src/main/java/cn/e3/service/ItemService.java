package cn.e3.service;

import cn.e3.common.pojo.EasyUIResult;
import cn.e3.pojo.TbItem;

public interface ItemService {
	TbItem geTbItemById(Long id);

	EasyUIResult getItemList(int page, int rows);
}
