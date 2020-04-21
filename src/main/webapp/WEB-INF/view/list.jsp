<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 视窗 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>影视列表</title>
<link href="/resource/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
</head>
<body>
	<table>
		<tr>
			<td colspan="100">
				<form action="list" method="post">
					<input type="hidden" name="pageNum">
					电影名称:<input type="text" name="name" value="${movieVO.name }">&nbsp;&nbsp;上映时间:<input type="text" name="startTime" value="${movieVO.startTime}">至<input type="text" name="endTime" value="${endTime }"><br>
					导演:<input type="text" name="actor" value="${movieVO.actor }"> &nbsp;&nbsp;价格:<input type="text" name="minPrice" value="${movieVO.minPrice }">-<input type="text" name="maxPrice" value="${movieVO.maxPrice }"><br>
					电影年代:<input type="text" name="years" value="${movieVO.years }">&nbsp;&nbsp;电影时长:<input type="text" name="shortTime" value="${movieVO.shortTime }">-<input type="text" name="longTime" value="${movieVO.longTime }">
					<input type="submit" value="查询">
					
				</form>
			</td>
		</tr>
	
		<tr>
			<td>电影名称</td>
			<td>导演</td>
			<td>
				<button type="button" class="btn btn-link" onclick="myOrder('price')">票价</button>
			</td>
			<td>上映时间</td>
			<td>
				<button type="button" class="btn btn-link" onclick="myOrder('longtime')">时长</button>
			</td>
			<td>类型</td>
			<td>
				<button type="button" class="btn btn-link" onclick="myOrder('years')">年代</button>
			</td>
			<td>区域</td>
			<td>状态</td>
		</tr>		
		
		<c:forEach var="movie" items="${info.list }">
			<tr>
				<td>${movie.name }</td>
				<td>${movie.actor }</td>
				<td>${movie.price }</td>
				<td>${movie.uptime }</td>
				<td>${movie.longtime }</td>
				<td>${movie.type }</td>
				<td>${movie.years }</td>
				<td>${movie.area }</td>
				<td>${movie.status }</td>
			</tr>
		</c:forEach>

		<tr>
			<td colspan="100">
				<jsp:include page="/WEB-INF/view/pages.jsp"></jsp:include>
			</td>
		</tr>		
	</table>
	
</body>
<script type="text/javascript">
	function myOrder(orderName){
		var orderName = orderName;
		var orderMethod = '${movieVO.orderMethod}';
		orderMethod=orderMethod=="desc"?"asc":"desc";
		location.href="/list?orderName="+orderName+"&orderMethod="+orderMethod;
	}

	function goPage(pageNum){
		var orderName='${movieVO.orderName}';
		var orderMethod ='${movieVO.orderMethod}';
		location.href="/list?pageNum="+pageNum+"&orderName="+orderName+"&orderMethod="+orderMethod;
	}
</script>
</html>