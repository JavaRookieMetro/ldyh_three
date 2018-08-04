<%@ page import="org.bj.ldyh.model.Customer" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    List<Customer> list = (List<Customer>) request.getAttribute("list");
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
                                <input id="input" type="text" value="${query}" class="form-control" style="width: 200px">
                                <span class="input-group-btn">
						<button id="search" class="btn btn-default" type="button">
							搜索
						</button>
					</span>
                            </div><!-- /input-group -->
                        </div><!-- /.col-lg-6 -->
                    </div><!-- /.row -->
                </form>
            </div>
            <h4>筛选</h4>
            行业：<div class="dropdown" style="padding-bottom: 10px">
                <button type="button" class="btn dropdown-toggle" id="dropdownMenu1" data-toggle="dropdown" style="width: 100px">${industry}
                    <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">

                </ul>
            </div>
            地域：<div class="dropdown" style="padding-bottom: 10px">
                <button type="button" class="btn dropdown-toggle" id="dropdownMenu2" data-toggle="dropdown" style="width: 100px">${address}
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
            重要性：<div class="dropdown">
                <button type="button" class="btn dropdown-toggle" id="dropdownMenu3" data-toggle="dropdown" style="width: 100px">${importance}
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
                    <th><a href="/Customer/sort.do?pageSize=${pageSize}&query=${query}&sort=name&dir=${dir}&industry=${industry}&address=${address}&importance=${importance}">姓名</a></th>
                    <th><a href="/Customer/sort.do?pageSize=${pageSize}&query=${query}&sort=age&dir=${dir}&industry=${industry}&address=${address}&importance=${importance}">年龄</a></th>
                    <th><a href="/Customer/sort.do?pageSize=${pageSize}&query=${query}&sort=gender&dir=${dir}&industry=${industry}&address=${address}&importance=${importance}">性别</a></th>
                    <th><a href="/Customer/sort.do?pageSize=${pageSize}&query=${query}&sort=industry&dir=${dir}&industry=${industry}&address=${address}&importance=${importance}">行业</a></th>
                    <th><a href="/Customer/sort.do?pageSize=${pageSize}&query=${query}&sort=address&dir=${dir}&industry=${industry}&address=${address}&importance=${importance}">地址</a></th>
                    <th><a href="/Customer/sort.do?pageSize=${pageSize}&query=${query}&sort=importance&dir=${dir}&industry=${industry}&address=${address}&importance=${importance}">重要性</a></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${list}" var="result">
                   <tr>
                        <td>${result.name}</td>
                        <td>${result.age}</td>
                        <td>${result.gender}</td>
                        <td>${result.industry}</td>
                        <td>${result.address}</td>
                        <td>${result.importance}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <div style="float: right;padding: 25px">当前: 第${pageInfo.pageNum}页</div>
            <nav aria-label="Page navigation" style="float: right">
                <ul class="pagination">
                    <li>
                        <a href="/Customer/page.do?pageNo=${pageInfo.prePage == 0 ? 1 : pageInfo.prePage}&query=${query}&pageSize=${pageSize}&industry=${industry}&address=${address}&importance=${importance}" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </li>
                    <c:forEach items="${pageInfo.navigatepageNums}" var="pageResult">
                        <li><a href="/Customer/page.do?pageNo=${pageResult}&query=${query}&pageSize=${pageSize}&industry=${industry}&address=${address}&importance=${importance}">${pageResult}</a></li>
                    </c:forEach>
                    <li>
                        <a href="/Customer/page.do?pageNo=${pageInfo.nextPage == 0 ? pageInfo.lastPage : pageInfo.nextPage}&query=${query}&pageSize=${pageSize}&industry=${industry}&address=${address}&importance=${importance}" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                </ul>
            </nav>

            <div class="dropdown" style="float: right;padding: 20px">
                <button type="button" class="btn dropdown-toggle" id="dropdownMenu4" data-toggle="dropdown">${pageSize}条/页
                    <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1" style="width: 5px">
                    <li role="presentation">
                        <a class="pageSize" role="menuitem" tabindex="-1" href="/Customer/page.do?pageSize=5&query=${query}&industry=${industry}&address=${address}&importance=${importance}">5</a>
                    </li>
                    <li role="presentation">
                        <a class="pageSize" role="menuitem" tabindex="-1" href="/Customer/page.do?pageSize=10&query=${query}&industry=${industry}&address=${address}&importance=${importance}">10</a>
                    </li>
                    <li role="presentation">
                        <a class="pageSize" role="menuitem" tabindex="-1" href="/Customer/page.do?pageSize=15&query=${query}&industry=${industry}&address=${address}&importance=${importance}">15</a>
                    </li>
                    <li role="presentation">
                        <a class="pageSize" role="menuitem" tabindex="-1" href="/Customer/page.do?pageSize=20&query=${query}&industry=${industry}&address=${address}&importance=${importance}">20</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.3.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>

<script>
    $(function(){
        // 搜索
        $("#search").click(function(data) {
            if($("#input").val().length == 0 || $("#input").val() == undefined) {
                alert("请输入搜索关键字");
                return;
            }
            location.href="/Customer/search.do?query="+$("#input").val();
        });

        $.get("/Customer/Filter/select.do",{

        },function (data) {
            console.log(data);
            var industry = data.industry;
            var address = data.address;
            var importance = data.importance;
            for(var i = 0; i < industry.length; i++) {
                if( i == 0) {
                    $("#dropdownMenu1").next().html("<li role=\"presentation\">\n" +
                        "<a role=\"menuitem\" tabindex=\"-1\" href=\"\Customer\\filter.do?industry=&address=${address}&importance=${importance}\">无</a>\n" +
                        "</li>");
                }
                $("#dropdownMenu1").next().append("<li role=\"presentation\">\n" +
                    "<a role=\"menuitem\" tabindex=\"-1\" href=\"\Customer\\filter.do?industry="+ industry[i].industry +"&address=${address}&importance=${importance}\">" + industry[i].industry + "</a>\n" +
                    "</li>");
            }
            for(var i = 0; i < address.length; i++) {
                if( i == 0) {
                    $("#dropdownMenu2").next().html("<li role=\"presentation\">\n" +
                        "<a role=\"menuitem\" tabindex=\"-1\" href=\"Customer\\filter.do?industry=${industry}&address=&importance=${importance}\">无</a>\n" +
                        "</li>");
                }
                $("#dropdownMenu2").next().append("<li role=\"presentation\">\n" +
                    "<a role=\"menuitem\" tabindex=\"-1\" href=\"\Customer\\filter.do?address="+ address[i].address +"&industry=${industry}&importance=${importance}\">" + address[i].address + "</a>\n" +
                    "</li>");
            }
            for(var i = 0; i < importance.length; i++) {
                console.log(industry[i]);
                if( i == 0) {
                    $("#dropdownMenu3").next().html("<li role=\"presentation\">\n" +
                        "<a role=\"menuitem\" tabindex=\"-1\" href=\"Customer\\filter.do?industry=${industry}&address=${address}&importance=\">无</a>\n" +
                        "</li>");

                }
                $("#dropdownMenu3").next().append("<li role=\"presentation\">\n" +
                    "<a role=\"menuitem\" tabindex=\"-1\" href=\"\Customer\\filter.do?importance="+ importance[i].importance +"&industry=${industry}&address=${address}\">" + importance[i].importance + "</a>\n" +
                    "</li>");
            }



        });
    });
</script>
</body>
</html>