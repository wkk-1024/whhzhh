<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Flatty - Flat administration template</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport' />

    <%@ include file="/include/link_css.jsp"%>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
<body class='contrast-red sign-in contrast-background'>
<div id='wrapper'>
    <div class='application'>
        <div class='application-content'>
            <a href="/pxx_wx/login"><div class='icon-heart'></div>
                <span>后台管理界面</span>
            </a>
        </div>
    </div>
    <div class='controls'>
        <div class='caret'></div>
        <div class='form-wrapper'>
            <h1 class='text-center'>用户登录</h1>
            <form accept-charset="UTF-8" action="/pxx_wx/login" method="post" /><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
            <div class='row-fluid'>
                <div class='span12 icon-over-input'>
                    <input class="span12" id="text" name="a_name" placeholder="用户名" type="text" value="" />
                    <i class='icon-user muted'></i>
                </div>
            </div>
            <div class='row-fluid'>
                <div class='span12 icon-over-input'>
                    <input class="span12" id="password" name="a_pwd" placeholder="密码" type="password" value="" />
                    <i class='icon-lock muted'></i>
                </div>
            </div>
            <label class="checkbox" for="remember_me"><input id="remember_me" name="remember_me" type="checkbox" value="1" />
                记住账号
            </label>
            <button name="button" type="submit" class="btn btn-block">登录</button>
            </form>
        </div>
    </div>
</div>
<%@ include file="/include/link_js.jsp"%>

</body>
</html>
