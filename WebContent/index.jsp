<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>企业信息管理</title>
	</head>

<frameset rows="70,*" cols="*" frameborder="no" border="0" framespacing="0">
  <frame src="head.jsp" name="topFrame" scrolling="no" noresize="noresize" id="topFrame" />
  <frameset cols="193,*" frameborder="no" border="0" framespacing="0">
    <frame src="left.jsp" scrolling="no" noresize="noresize" id="leftFrame" name="leftFrame"/>
    <frame src="main.jsp" name="mainFrame" id="mainFrame" name="mainFrame"/>
  </frameset>
</frameset>
<noframes>
	<body>
	</body>
</noframes>
</html>