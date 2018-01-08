<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE>
<html>
<head>
	<meta  charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="./css/master.css">
	<link rel="stylesheet" type="text/css" href="./css/returnbuy.css">
<title>確認画面</title>
</head>
<body>

						<!------------------header-------------------->

<div id="header">
	<a class="logo" href="home.jsp">SHOP.list</a>
</div>


<ul class="menu">
	<li class=image>
			<img class="itemImage" src="<s:property value="itemDTO.getImageFilePath()" />" ><br>
	</li>
	<li class="moji">
		<span>商品名:</span>
			<s:property value="itemDTO.getMoreName()" /><br>
			＜<s:property value="itemDTO.getMoreNameKana()" />＞<br>
		<span>値段:</span>
			<s:property value="itemDTO.getPrice()" />円<br>
	</li>
	<li class="aa">
		<h2>購入を完了しますか</h2>
		<a class="select" href="<s:url action="CompleteAction">
			<s:param name="searchText" value="searchText"/>
			<s:param name="categoryId" value="categoryId"/>
			<s:param name="moreId" value="getMoreId()"/>
		</s:url>">[はい]</a>
		<span>/</span>
		<a class="select"  href="home.jsp">[いいえ(HOMEに戻ります)]</a>



	</li>
</ul>

</body>
</html>