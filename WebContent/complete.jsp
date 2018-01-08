<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE>
<html>
<head>
	<meta  charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="./css/master.css">
	<link rel="stylesheet" type="text/css" href="./css/complete.css">
<title>購入完了画面</title>
</head>
<body>


						<!------------------header-------------------->

<div id="header">
  	<a class="logo" href="home.jsp">SHOP.list</a>

	<ul id="menu">
		<li class="itemlist">
			<a class="itemlist" href="<s:url action="ItemAction" /> " >商品一覧</a>
		</li>
	</ul>
</div>




<ul class="top">
	<li class="comment">
		<h2>ご購入完了しました。<br>この度はご利用誠にありがとうございました。</h2>
	</li>
</ul>

<h1>[ご購入された商品]</h1>


<ul class="menu">

	<li class=image>
			<img class="itemImage" src="<s:property value="itemDTO.getImageFilePath()" />" ><br>
	</li>

	<li class="moji">
		<span>カテゴリー:</span>
			<s:property value="itemDTO.getCategoryName()" /><br>
		<span>商品名:</span>
			<s:property value="itemDTO.getMoreName()" /><br>
			＜<s:property value="itemDTO.getMoreNameKana()"/>＞<br>
		<span>値段:</span>
			<s:property value="itemDTO.getPrice()" />円<br>
	</li>
</ul>

</body>
</html>