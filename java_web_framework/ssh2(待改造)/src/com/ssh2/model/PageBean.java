package com.ssh2.model;

import java.util.List;

public class PageBean {
	private List list;
	private int totalPage;		//��ҳ��
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	private int allRow;			
	private int currentPage;	//��ǰҳ
	private int pageSize;		//ÿҳ��¼
	
	private boolean isFirstPage;//�Ƿ�Ϊ��ҳ
	private boolean isLastPage;
	private boolean hasPreviousPage;	//�Ƿ���ǰһҳ
	private boolean hasNextPage;		//�Ƿ�����һҳ
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
	 * ��ʹ����ҳ��Ϣ
	 */
	
	public void init(){
		this.isFirstPage = isFirstPage();
		this.isLastPage = isLastPage();
		this.hasPreviousPage = hasPreviousPage;
		this.hasNextPage = hasNextPage;
	}
	
	/*
	 * ������ҳ��
	 */
	public static int countTotalPage(int pageSize,int allRow){
		int totalPage = allRow % pageSize == 0 ? allRow/pageSize : allRow/pageSize+1;
		return totalPage;
	}
	
	/**
	 * ���㵱ǰ��Ϊ��ʼ
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
