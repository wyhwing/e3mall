package cn.e3.common.pojo;

import java.io.Serializable;
import java.util.List;

public class EasyUIResult implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer total;// 总页数
	private List<?> rows;// 查找的结果集

	public EasyUIResult(Integer total, List<?> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}

	public EasyUIResult(Long total, List<?> rows) {
		super();
		this.total = total.intValue();
		this.rows = rows;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
