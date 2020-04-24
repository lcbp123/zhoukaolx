
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<table>
		<tr>
			<td colspan="4"> 
				<form action="list" method="post">
					价格范围:<input type="text" name="min">--><input type="text" name="max">元
					已售百分比:<input type="text" name="smin">--><input type="text" name="smax">%
					排序:<select name="column">
							<option value="price">价格</option>
							<option value="sales">已售百分比</option>
						</select>
						<select name="orders">
							<option value="asc">升序</option>
							<option value="desc">降序</option>
						</select>
					<input type="submit" value="查询">
				</form>
			</td>
		</tr>
		<tr>
			<th>ID</th>
			<th>商品名称</th>
			<th>秒杀价格</th>
			<th>已售百分比</th>
		</tr>
		<c:forEach items="${plist.list }" var="g">
		<tr>
			<th>${g.id }</th>
			<td>${g.name }</td>
			<th>￥${g.price }</th>
			<th>${g.sales }%</th>
		</tr>
		</c:forEach>
		<tr>
			<th colspan="4">
				当前页${plist.pageNum }/共${plist.pages }页
				<a href="list?pageNum=${plist.firstPage }">首页</a>
				<a href="list?pageNum=${plist.prePage }">上一页</a>
				<a href="list?pageNum=${plist.nextPage }">下一页</a>
				<a href="list?pageNum=${plist.pages }">末页</a>
			</th>
		</tr>
	</table>
</body>
</html>