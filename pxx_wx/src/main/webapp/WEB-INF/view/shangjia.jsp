<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Flatty - Flat administration template</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport' />
    <%@ include file="/include/link_css.jsp"%>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
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
                                    <i class='icon-edit'></i>
                                    <span>Forms styles and features</span>
                                </h1>
                                <div class='pull-right'>
                                    <ul class='breadcrumb'>
                                        <li>
                                            <a href="index.html"><i class='icon-bar-chart'></i>
                                            </a>
                                        </li>
                                        <li class='separator'>
                                            <i class='icon-angle-right'></i>
                                        </li>
                                        <li>
                                            Forms
                                        </li>
                                        <li class='separator'>
                                            <i class='icon-angle-right'></i>
                                        </li>
                                        <li class='active'>Form styles and features</li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class='row-fluid'>
                    <div class='span12 box'>
                        <div class='box-header blue-background'>
                            <div class='title'>
                                <div class='icon-edit'></div>
                                添加商品数量与价格
                            </div>
                            <div class='actions'>
                                <a href="#" class="btn box-remove btn-mini btn-link"><i class='icon-remove'></i>
                                </a>
                                <a href="#" class="btn box-collapse btn-mini btn-link"><i></i>
                                </a>
                            </div>
                        </div>
                        <div class='box-content box-no-padding'>
                            <form accept-charset="UTF-8" action="${pageContext.request.contextPath }/shangjia" class="form form-horizontal form-striped" method="post" style="margin-bottom: 0;" /><div style="margin:0;padding:0;display:inline">
                            <%--//商品条码--%>
                            <div class='control-group'>
                                <label class='control-label' for='inputText2'>进货价</label>
                                <div class='controls'>
                                    <input class='input-block-level' id='inputText2' placeholder='请输入进货价格' type='text' name="g_price" value="${stock.g_price}"/>
                                </div>
                            </div>

                        </div>
                            <input type="hidden" name="sellcount" value="${stock.sellcount}"/>
                            <input type="hidden" name="g_code" value="${stock.g_code}"/>
                            <div class='form-actions' style='margin-bottom: 0;'>
                                <button class='btn btn-primary btn-large' type="submit">
                                    <i class='icon-save'></i>提交</button>
                            </div>
                            </form>
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
