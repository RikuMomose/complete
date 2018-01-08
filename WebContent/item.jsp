<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/master.css">
<link rel="stylesheet" type="text/css" href="./css/item.css">
<title>一覧</title>
</head>
<body>

						<!------------------header-------------------->

<div id="header">
	<a class="logo" href="home.jsp">SHOP.list</a>
</div>

                <!------------------------ menu --------------------->

<ul class="menu">
	<s:iterator value="itemDTOList">
		<li class="moji">

			<a href="<s:url action="MoreAction">
				<s:param name="searchText" value="searchText"/>
				<s:param name="categoryId" value="categoryId"/>
				<s:param name="moreId" value="getMoreId()"/>
			</s:url>"><img src="<s:property value="getImageFilePath()" />" class="itemImage"></a><br>

			<span>カテゴリー:</span>
				<s:property value="getCategoryName()" /><br>
			<span>商品名:</span>
				<s:property value="getMoreName()" /><br>
				＜<s:property value="getMoreNameKana()"/>＞<br>
			<span>値段:</span>
				<s:property value="getPrice()" />円<br>

			<div class="moveWrapper">
			<a class="buttom" href="<s:url action="MoreAction">
				<s:param name="searchText" value="searchText"/>
				<s:param name="categoryId" value="categoryId"/>
				<s:param name="moreId" value="getMoreId()"/>
			</s:url>">商品詳細</a>
			</div>
		</li>
	</s:iterator>
</ul>


</body>
</html>