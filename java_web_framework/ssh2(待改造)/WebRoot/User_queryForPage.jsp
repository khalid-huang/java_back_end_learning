<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib  uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>

	<body>
		<s:iterator value="pageBean.list">
			<s:property value="username" />
			<a href="User_getUserById.action?id=<s:property value="id"/>">修改</a>
			<a href="User_delete.action?id=<s:property value="id"/>"
				onclick="return askDel()" />删除</a>
			<br />
		</s:iterator>
		共
		<s:property value="pageBean.allRow" />
		条记录 共
		<s:property value="pageBean.totalPage" />
		页 当前第
		<s:property value="pageBean.currentPage" />
		页
		<br />
		<s:if test="%{pageBean.currentPage == 1}">
		 第一页 上一页 
		 </s:if>
		<s:else>
			<a href="User_queryForPage.action?page=1">第一页</a>
			<a
				href="User_queryForPage.action?page=<s:property value="%{pageBean.currentPage-1}"/>">上一页</a>
				</s:else>
			<s:if test="%{pageBean.currentPage != pageBean.totalPage}">
				<a
					href="User_queryForPage.action?page=<s:property value="%{pageBean.currentPage+1}"/>">下一页</a>
				<a
					href="User_queryForPage.action?page=<s:property value="pageBean.totalPage"/>">最后一页</a>
			</s:if>
			<s:else>   
　　　　　　下一页 最后一页   
　　　　</s:else>
	</body>
</html>
