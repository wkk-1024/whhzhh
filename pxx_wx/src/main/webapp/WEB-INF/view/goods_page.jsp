<%--
  Created by IntelliJ IDEA.
  User: 哇哈哈
  Date: 2019/12/30
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <% request.setCharacterEncoding("utf-8"); %>
    <title>Flatty - Flat administration template</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport' />
    <%@ include file="/include/link_css.jsp"%>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script>
    function forword(url) {
        window.location.replace(url);
    }
</script>
</head>
<body class='contrast-red '>
<%@ include file="/include/header.jsp"%>
<div id='wrapper'>
    <div id='main-nav-bg'></div>
    <%@ include file="/include/nav.jsp"%>
    <section id='content'>
        <div class='container-fluid'>
            <div class='row-fluid' id='content-wrapper'>
                <div class='span12'>
                    <div class='row-fluid'>
                        <div class='span12'>
                            <div class='page-header'>
                                <h1 class='pull-left'>
                                    <i class='icon-table'></i>
                                    <span>商品管理</span>
                                </h1>
                                <div class='pull-right'>
                                    <ul class='breadcrumb'>
                                        <li>
                                            <a href="../../index.jsp"><i class='icon-bar-chart'></i>
                                            </a>
                                        </li>
                                        <li class='separator'>
                                            <i class='icon-angle-right'></i>
                                        </li>
                                        <li class='active'>回到首页</li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                    <button onclick="forword('/pxx_wx/taozhuan')">添加商品</button>
                    <div class='row-fluid'>
                        <div class='span12 box bordered-box blue-border' style='margin-bottom:0;'>
                            <div class='box-header blue-background'>
                                <div class='title'>商品表</div>
                                <div class='actions'>
                                    <a href="#" class="btn box-remove btn-mini btn-link"><i class='icon-remove'></i>
                                    </a>
                                    <a href="#" class="btn box-collapse btn-mini btn-link"><i></i>
                                    </a>
                                </div>
                            </div>
                            <div class='box-content box-no-padding'>
                                <div class='responsive-table'>
                                    <div class='scrollable-area'>
                                        <table class='table' style='margin-bottom:0;'>
                                            <thead>
                                            <tr>
                                                <th>id</th>
                                                <th>条码</th>
                                                <th>名称</th>
                                                <th>种类</th>
                                                <th>单位</th>
                                                <th>价格</th>
                                                <th>数量</th>
                                                <th>商品介绍</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach var="goods" items="${page.arrys}">
                                                <tr>

                                                    <td>${goods.g_id}</td><%--商品id--%>
                                                    <td>${goods.g_code}</td><%--商品条码--%>
                                                    <td>${goods.g_name}</td><%--商品名称--%>
                                                    <td>${goods.g_kind}</td><%--商品种类--%>
                                                    <td>${goods.g_unit}</td><%--商品单位--%>
                                                    <td>${goods.g_price}</td><%--商品价格--%>
                                                    <td>${goods.sellcount}</td><%--商品数量--%>
                                                    <td>${goods.g_Intro}</td><%--商品介绍--%>
                                                    <td><img src="${goods.pic_Url}"style="width:150px; height: 80px;"/></td><%--商品图片--%>
                                                    <td>
                                                        <div class='text-right'>
                                                            <a class='btn btn-primary btn-mini' href='#'>
                                                                <i class='icon-edit' onclick="forword('/pxx_wx/update?method=${goods.g_id}')">修改</i>
                                                            </a>
                                                            <a class='btn btn-danger btn-mini' href='#'>
                                                                <i class='icon-remove' onclick="forword('/pxx_wx/del_goods?method=${goods.g_id}')">删除</i>
                                                            </a>
                                                        </div>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                            <tr>
                                                <td colspan="10"style="text-align: center">
                                                    <a href="/pxx_wx/queryProByPage/${page.firstpage}">首页</a>
                                                    <a href="/pxx_wx/queryProByPage/${page.prePage}">上一页</a>
                                                    <c:forEach var="index" items="${page.indexs}">
                                                        &nbsp;&nbsp;<a href="/pxx_wx/queryProByPage/${index}">${index}</a>&nbsp;&nbsp;
                                                    </c:forEach>

                                                    <a href="/pxx_wx/queryProByPage/${page.nextpage}">下一页</a>
                                                    <a href="/pxx_wx/queryProByPage/${page.lastpage}">尾页</a>
                                                </td>
                                            </tr>
                                            </tbody>
                                        </table>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</div>
<%@ include file="/include/link_js.jsp"%>

</body>
</html>