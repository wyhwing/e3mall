package cn.e3.service;

import cn.e3.common.pojo.EasyUIResult;
import cn.e3.pojo.TbItem;

public interface ItemService {

	EasyUIResult getItemList(int page, int rows);
}
