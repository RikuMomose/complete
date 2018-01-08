<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE>
<html>

<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="./css/master.css">
	<link rel="stylesheet" type="text/css" href="./css/home.css">


	<title>ホーム</title>
</head>

<body>

						<!------------------header-------------------->

<div id="header">
	<a class="logo">SHOP.list</a>


<!---- 商品一覧	リンク ---->
<ul id="menu">
	<li class="itemlist">
		<a class="itemlist" href="<s:url action="ItemAction" /> " >商品一覧</a>
	</li>
</ul>

</div>

</body>
</html>