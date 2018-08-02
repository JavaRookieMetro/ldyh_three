<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>客户管理</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="/js/html5shiv.min.js"></script>
    <script src="/js/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">

    </style>
</head>
<body>
<h1 class="text-center text-danger">客户信息查询</h1>
<div class="container">
    <div class="row">
        <div class="col-sm-4">
            <div style="padding-bottom: 20px">
                <form class="bs-example bs-example-form" role="form">
                    <div class="row">
                        <div class="col-lg-6">
                            查询客户信息：<div class="input-group" placeholder="请输入关键字">
                                <input type="text" class="form-control" style="width: 200px">
                                <span class="input-group-btn">
						<button class="btn btn-default" type="button">
							搜索
						</button>
					</span>
                            </div><!-- /input-group -->
                        </div><!-- /.col-lg-6 -->
                    </div><!-- /.row -->
                </form>
            </div>
            <h4>筛选</h4>
            <p>描述文本。</p>
            <div class="dropdown" style="padding-bottom: 10px">
                <button type="button" class="btn dropdown-toggle" id="dropdownMenu1" data-toggle="dropdown" style="width: 100px">主题
                    <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">Java</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">数据挖掘</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">数据通信/网络</a>
                    </li>
                    <li role="presentation" class="divider"></li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">分离的链接</a>
                    </li>
                </ul>
            </div>
            <div class="dropdown" style="padding-bottom: 10px">
                <button type="button" class="btn dropdown-toggle" id="dropdownMenu2" data-toggle="dropdown" style="width: 100px">主题
                    <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu2">
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">Java</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">数据挖掘</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">数据通信/网络</a>
                    </li>
                    <li role="presentation" class="divider"></li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">分离的链接</a>
                    </li>
                </ul>
            </div>
            <div class="dropdown">
                <button type="button" class="btn dropdown-toggle" id="dropdownMenu3" data-toggle="dropdown" style="width: 100px">主题
                    <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu3">
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">Java</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">数据挖掘</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">数据通信/网络</a>
                    </li>
                    <li role="presentation" class="divider"></li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">分离的链接</a>
                    </li>
                </ul>
            </div>
            <hr class="hidden-sm hidden-md hidden-lg">
        </div>
        <div class="col-sm-8">
            <h4>客户信息</h4>
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>姓名</th>
                    <th>年龄</th>
                    <th>性别</th>
                    <th>行业</th>
                    <th>地址</th>
                    <th>重要性</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>Tanmay</td>
                    <td>Bangalore</td>
                    <td>560001</td>
                    <td>Tanmay</td>
                    <td>Bangalore</td>
                    <td>560001</td>
                </tr>
                <tr>
                    <td>Sachin</td>
                    <td>Mumbai</td>
                    <td>400003</td>
                    <td>Sachin</td>
                    <td>Mumbai</td>
                    <td>400003</td>
                </tr>
                <tr>
                    <td>Uma</td>
                    <td>Pune</td>
                    <td>411027</td>
                    <td>Uma</td>
                    <td>Pune</td>
                    <td>411027</td>
                </tr>
                <tr>
                    <td>Uma</td>
                    <td>Pune</td>
                    <td>411027</td>
                    <td>Uma</td>
                    <td>Pune</td>
                    <td>411027</td>
                </tr>
                <tr>
                    <td>Uma</td>
                    <td>Pune</td>
                    <td>411027</td>
                    <td>Uma</td>
                    <td>Pune</td>
                    <td>411027</td>
                </tr>
                <tr>
                    <td>Uma</td>
                    <td>Pune</td>
                    <td>411027</td>
                    <td>Uma</td>
                    <td>Pune</td>
                    <td>411027</td>
                </tr>
                <tr>
                    <td>Uma</td>
                    <td>Pune</td>
                    <td>411027</td>
                    <td>Uma</td>
                    <td>Pune</td>
                    <td>411027</td>
                </tr>
                </tbody>
            </table>
            <ul class="pagination" style="float: right">
                <li><a href="#">&laquo;</a></li>
                <li><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li><a href="#">&raquo;</a></li>
            </ul>
        </div>
    </div>
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.3.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>

<script>
    /*(function(){
        var s =document.createElement("script");
        s.onload = function() {
            bootlint.showLintReportForCurrentDocument([]);
        };
        s.src = "js/bootlint.js";
        document.body.appendChild(s)
    })();*/
</script>
</body>
</html>