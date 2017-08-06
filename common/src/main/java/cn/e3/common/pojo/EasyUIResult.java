package cn.e3.common.pojo;

import java.io.Serializable;
import java.util.List;

public class EasyUIResult implements Serializable {
	/**
	 * 
	 */
	private Long total;// 总页数
	private List rows;// 查找的结果集

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

}
