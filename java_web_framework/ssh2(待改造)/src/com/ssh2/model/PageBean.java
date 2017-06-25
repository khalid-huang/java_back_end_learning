package com.ssh2.model;

import java.util.List;

public class PageBean {
	private List list;
	private int totalPage;		//总页数
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	private int allRow;			
	private int currentPage;	//当前页
	private int pageSize;		//每页记录
	
	private boolean isFirstPage;//是否为首页
	private boolean isLastPage;
	private boolean hasPreviousPage;	//是否有前一页
	private boolean hasNextPage;		//是否有下一页
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public int getAllRow() {
		return allRow;
	}
	public void setAllRow(int allRow) {
		this.allRow = allRow;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public boolean isFirstPage() {
		return currentPage == 1;
	}
	public void setFirstPage(boolean isFirstPage) {
		this.isFirstPage = isFirstPage;
	}
	public boolean isLastPage() {
		return currentPage == totalPage;
	}
	public void setLastPage(boolean isLastPage) {
		this.isLastPage = isLastPage;
	}
	public boolean isHasPreviousPage() {
		return currentPage != 1;
	}
	public void setHasPreviousPage(boolean hasPreviousPage) {
		this.hasPreviousPage = hasPreviousPage;
	}
	public boolean isHasNextPage() {
		return currentPage != totalPage;
	}
	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	
	/**
	 * 初使化分页信息
	 */
	
	public void init(){
		this.isFirstPage = isFirstPage();
		this.isLastPage = isLastPage();
		this.hasPreviousPage = hasPreviousPage;
		this.hasNextPage = hasNextPage;
	}
	
	/*
	 * 计算总页数
	 */
	public static int countTotalPage(int pageSize,int allRow){
		int totalPage = allRow % pageSize == 0 ? allRow/pageSize : allRow/pageSize+1;
		return totalPage;
	}
	
	/**
	 * 计算当前面为开始
	 */
	public static int countStart(int pageSize,int currentPage){
		int start = pageSize*(currentPage-1);
		return start;
	}
	
	public static int countCurrentPage(int page){
		int curPage = (page==0?1:page);
		return curPage;
	}
}
