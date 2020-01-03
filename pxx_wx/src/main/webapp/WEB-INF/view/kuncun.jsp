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
                                    <span>库存管理</span>
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
                    <div class='row-fluid'>
                        <div class='span12 box bordered-box blue-border' style='margin-bottom:0;'>
                            <div class='box-header blue-background'>
                                <div class='title'>库存列表</div>
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
                                                <th>条码</th>
                                                <th>名称</th>
                                                <th>采购价格</th>
                                                <th>库存量</th>
                                                <th>上架状态</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach var="stock" items="${page.arrys}">
                                                <tr>
                                                    <td>${stock.g_code}</td><%--商品条码--%>
                                                    <td>${stock.g_name}</td><%--商品名称--%>
                                                    <td>${stock.g_price}</td><%--采购价格--%>
                                                    <td>${stock.sellcount}</td><%--商品数量--%>
                                                    <td>${stock.s_added}</td><%--商品上下架--%>
                                                    <td><img src="${stock.pic_url}"style="width:150px; height: 80px;"/></td><%--商品图片--%>
                                                    <td>
                                                        <div class='text-right'>
                                                            <a class='btn btn-primary btn-mini' href='#'>
                                                                <i class='icon-edit' onclick="forword('/pxx_wx/sjtz?method=${stock.g_code}')">上架</i>
                                                                <i class='icon-edit' onclick="forword('/pxx_wx/xiajia?method=${stock.g_code}')">下架</i>
                                                            </a>
                                                        </div>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                            <tr>
                                                <td colspan="10"style="text-align: center">
                                                    <a href="/pxx_wx/querkuncun/${page.firstpage}">首页</a>
                                                    <a href="/pxx_wx/querkuncun/${page.prePage}">上一页</a>
                                                    <c:forEach var="index" items="${page.indexs}">
                                                        &nbsp;&nbsp;<a href="/pxx_wx/querkuncun/${index}">${index}</a>&nbsp;&nbsp;
                                                    </c:forEach>

                                                    <a href="/pxx_wx/querkuncun/${page.nextpage}">下一页</a>
                                                    <a href="/pxx_wx/querkuncun/${page.lastpage}">尾页</a>
                                                </td>
                                            </tr>
                                            </tbody>
                                        </table>
                                        <%--<button onclick="forword('/pxx_wx/taozhuan')">添加商品</button>--%>
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