package com.example.javaanli.demo.pagemodel;


import com.example.javaanli.demo.entity1.News;

import java.util.List;

public class NewsGrid {
	private int current;//当前页面号
	private int rowCount;//每页行数
	private int total;//总行数
	private List<News> rows;
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public int getRowCount() {
		return rowCount;
	}
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<News> getRows() {
		return rows;
	}
	public void setRows(List<News> rows) {
		this.rows = rows;
	}

}
