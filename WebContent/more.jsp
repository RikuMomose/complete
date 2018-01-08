<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE>
<html>
<head>
<meta  charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/master.css">
<link rel="stylesheet" type="text/css" href="./css/more.css">
<title>詳細</title>
</head>
<body>

						<!------------------header-------------------->

<div id="header">
	<a class="logo" href="home.jsp">SHOP.list</a>
</div>

<!-- 商品詳細 -->

<ul class="menu">

	<li class="image">
			<img class="itemImage" src="<s:property value="itemDTO.getImageFilePath()"/>"><br>
	</li>

	<li class="moji">
		<span>商品名:</span>
			<s:property value="itemDTO.getMoreName()"/><br>
			＜<s:property value="itemDTO.getMoreNameKana()" />＞<br>
		<span>商品詳細:</span>
			<s:property value="itemDTO.getMoreDescription()"/><br>
		<span>値段:</span>
			<s:property value="itemDTO.getPrice()" />円<br>
		<span>発売会社:</span>
			<s:property value="itemDTO.getReleaseCompany()" />
		<span>発売年月日:</span>
			<s:property value="itemDTO.getReleaseDate()"/><br>

		<div class="moveWrapper">
		<a class="buttom" class="sub" href="<s:url action="ReturnbuyAction">
			<s:param name="searchText" value="searchText"/>
			<s:param name="categoryId" value="categoryId"/>
			<s:param name="moreId" value="getMoreId()"/>
		</s:url>">購入</a>
		</div>
	</li>
</ul>


</body>
</html>