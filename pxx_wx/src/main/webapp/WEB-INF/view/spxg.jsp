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
                商品添加
            </div>
            <div class='actions'>
                <a href="#" class="btn box-remove btn-mini btn-link"><i class='icon-remove'></i>
                </a>
                <a href="#" class="btn box-collapse btn-mini btn-link"><i></i>
                </a>
            </div>
        </div>
        <div class='box-content box-no-padding'>
            <form accept-charset="UTF-8" action="${pageContext.request.contextPath }/update_gx" class="form form-horizontal form-striped" method="post" style="margin-bottom: 0;" /><div style="margin:0;padding:0;display:inline">
                <%--//商品条码--%>
            <div class='control-group'>
                    <label class='control-label' for='inputText2'>商品条码</label>
                    <div class='controls'>
                        <input class='input-block-level' id='inputText2' placeholder='请输入商品条码' type='text' name="g_code" value="${goods.g_code}" readonly/>
                    </div>
                </div>

                <%--//商品名称--%>
            <div class='control-group'>
                <label class='control-label' for='inputText3'>商品名称</label>
                <div class='controls'>
                    <input class='input-block-level' id='inputText3' placeholder='请输入商品名称' type='text'  name="g_name" value="${goods.g_name}"readonly/>
                </div>
            </div>

                <%--商品种类--%>
                    <div class='control-group'>
                        <label class='control-label'>商品种类</label>
                        <div class='controls'>
                            <input class='input-block-level'placeholder='请输入商品种类' type='text' name="g_kind" value="${goods.g_kind}" />
                        </div>
                    </div>

                <%--//商品单位--%>
            <div class='control-group'>
                <label class='control-label' for='inputText4'>商品单位</label>
                <div class='controls'>
                    <input class='input-block-level' id='inputText4' placeholder='请输入商品单位' type='text' name="g_unit" value="${goods.g_unit}" />
                </div>
            </div>

            <%--//商品价格--%>
            <div class='control-group'>
                <label class='control-label' for='inputText4'>商品价格</label>
                <div class='controls'>
                    <input class='input-block-level' id='inputText5' placeholder='请输入商品价格' type='text' name="g_price" value="${goods.g_price}"/>
                </div>
            </div>

            <%--//商品销售量--%>
            <div class='control-group'>
                <label class='control-label' for='inputText4'>商品数量</label>
                <div class='controls'>
                    <input class='input-block-level' id='inputText6' placeholder='请输入商品数量' type='text' name="sellcount" value="${goods.sellcount}" readonly/>
                </div>
            </div>

            <%--商品介绍--%>
             <div class='control-group'>
                  <label class='control-label'>商品介绍</label>
                     <div class='controls'>
                            <input class='input-block-level'placeholder='请输入商品介绍' type='text' name="g_Intro" value="${goods.g_Intro}" />
                     </div>
             </div>


                <input name="g_id" value="${goods.g_id}" type="hidden"/>
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
</div>
</section>
</div>
<%@ include file="/include/link_js.jsp"%>

</body>
</html>
