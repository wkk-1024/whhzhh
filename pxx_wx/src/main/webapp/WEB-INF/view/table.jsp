<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 哇哈哈
  Date: 2019/12/17
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Flatty - Flat administration template</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport' />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script>
        function forword(url) {
            window.location.replace(url);
        }
    </script>
<%@ include file="/include/link_css.jsp"%>
</head>
<body class='contrast-red '>
<%@ include file="/include/header.jsp"%>
<div id='wrapper'>
    <section id='content'>
        <%@ include file="/include/nav.jsp"%>
        <h3><i class="fa fa-angle-right"></i>商品信息管理</h3>
        <!-- BASIC FORM ELELEMNTS -->
        <div class="row mt">
            <div class="col-lg-12">
                <div class="form-panel">
                        <h4 class="mb"><i class="fa fa-angle-right"></i>商品修改</h4>

                    <form action="${pageContext.request.contextPath }/product.do" method="post">
                            <input type="hidden" name="method" value="modify_Product">
                            <input type="hidden" name="pid" value="${product.pid}">
                        <div class="form-group">
                            <label class="col-sm-2 col-sm-2 control-label">商品名称</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" placeholder="商品名称" name="pname" value="${product.pname}">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 col-sm-2 control-label">商品单位</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" placeholder="商品单位" name="unit" value="${product.unit}">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 col-sm-2 control-label">商品数量</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" placeholder="商品数量" name="count" value="${product.count}">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 col-sm-2 control-label">商品备注</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" placeholder="商品备注" name="mark" value="${product.mark}">
                            </div>
                        </div>

                        <button type="submit" class="btn btn-theme">保存</button>
                    </form>
                </div>
            </div>
            <!-- col-lg-12-->
        </div>
    </section>
</div>
<%@ include file="/include/link_js.jsp"%>
</body>
</html>
