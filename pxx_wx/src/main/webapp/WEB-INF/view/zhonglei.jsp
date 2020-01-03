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
                                    <span>分类管理</span>
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
                    <button onclick="forword('/pxx_wx/tjtz')">添加种类</button>
                    <div class='row-fluid'>
                        <div class='span12 box bordered-box blue-border' style='margin-bottom:0;'>
                            <div class='box-header blue-background'>
                                <div class='title'>种类列表</div>
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
                                                <th>种类id</th>
                                                <th>种类名称</th>
                                                <th>种类介绍</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach var="b" items="${page.arrys}">
                                                <tr>
                                                    <td>${b.sort_id}</td><%--种类id--%>
                                                    <td>${b.g_kind}</td><%--种类名称--%>
                                                    <td>${b.sort_details}</td><%--种类介绍--%>
                                                </tr>
                                            </c:forEach>
                                            <tr>
                                                <td colspan="10"style="text-align: center">
                                                    <a href="/pxx_wx/zhonglei/${page.firstpage}">首页</a>
                                                    <a href="/pxx_wx/zhonglei/${page.prePage}">上一页</a>
                                                    <c:forEach var="index" items="${page.indexs}">
                                                        &nbsp;&nbsp;<a href="/pxx_wx/zhonglei/${index}">${index}</a>&nbsp;&nbsp;
                                                    </c:forEach>

                                                    <a href="/pxx_wx/zhonglei/${page.nextpage}">下一页</a>
                                                    <a href="/pxx_wx/zhonglei/${page.lastpage}">尾页</a>
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