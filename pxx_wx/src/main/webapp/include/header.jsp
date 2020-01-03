<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header>
    <div class='navbar'>
        <div class='navbar-inner'>
            <div class='container-fluid'>
                <a class='brand' href='index.jsp'>
                    <i class='icon-heart-empty'></i>
                    <span class='hidden-phone'>后台管理系统</span>
                </a>
                <a class='toggle-nav btn pull-left' href='#'>
                    <i class='icon-reorder'></i>
                </a>
                <ul class='nav pull-right'>
                    <li class='dropdown light only-icon'>
                        <a class='dropdown-toggle' data-toggle='dropdown' href='#'>
                            <i class='icon-adjust'></i>
                        </a>
                        <ul class='dropdown-menu color-settings'>
                            <li class='color-settings-contrast-color'>
                                <div class='color-title'>主题颜色</div>
                                <a href="#" data-change-to="contrast-red"><i class='icon-adjust text-red'></i>
                                    红色
                                    <small>(default)</small>
                                </a>
                                <a href="#" data-change-to="contrast-blue"><i class='icon-adjust text-blue'></i>
                                    蓝色
                                </a>
                                <a href="#" data-change-to="contrast-orange"><i class='icon-adjust text-orange'></i>
                                    橙色
                                </a>
                                <a href="#" data-change-to="contrast-purple"><i class='icon-adjust text-purple'></i>
                                    紫色
                                </a>
                                <a href="#" data-change-to="contrast-green"><i class='icon-adjust text-green'></i>
                                    绿色
                                </a>
                                <a href="#" data-change-to="contrast-muted"><i class='icon-adjust text-muted'></i>
                                    柔和的
                                </a>
                                <a href="#" data-change-to="contrast-fb"><i class='icon-adjust text-fb'></i>
                                    Facebook
                                </a>
                                <a href="#" data-change-to="contrast-dark"><i class='icon-adjust text-dark'></i>
                                    黑色
                                </a>
                                <a href="#" data-change-to="contrast-pink"><i class='icon-adjust text-pink'></i>
                                    粉色
                                </a>
                                <a href="#" data-change-to="contrast-grass-green"><i class='icon-adjust text-grass-green'></i>
                                    草绿色
                                </a>
                                <a href="#" data-change-to="contrast-sea-blue"><i class='icon-adjust text-sea-blue'></i>
                                    海蓝色
                                </a>
                                <a href="#" data-change-to="contrast-banana"><i class='icon-adjust text-banana'></i>
                                    香蕉黄
                                </a>
                                <a href="#" data-change-to="contrast-dark-orange"><i class='icon-adjust text-dark-orange'></i>
                                    暗桔色
                                </a>
                                <a href="#" data-change-to="contrast-brown"><i class='icon-adjust text-brown'></i>
                                    棕色
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li class='dropdown dark user-menu'>
                        <a class='dropdown-toggle' data-toggle='dropdown' href='#'>

                            <span class='user-name hidden-phone'>用户名</span>
                            <b class='caret'></b>
                        </a>
                        <ul class='dropdown-menu'>
                            <li>
                                <a href='user_profile.html'>
                                    <i class='icon-user'></i>
                                    个人中心
                                </a>
                            </li>
                            <li>
                                <a href='user_profile.html'>
                                    <i class='icon-cog'></i>
                                    设置
                                </a>
                            </li>
                            <li class='divider'></li>
                            <li>
                                <a href='/pxx_wx/login'>
                                    <i class='icon-signout'></i>
                                    退出账户
                                </a>
                            </li>
                        </ul>
                    </li>
                </ul>
                <form accept-charset="UTF-8" action="search_results.html" class="navbar-search pull-right hidden-phone" method="get" /><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
                <button class="btn btn-link icon-search" name="button" type="submit"></button>
                <input autocomplete="off" class="search-query span2" id="q_header" name="q" placeholder="搜索..." type="text" value="" />
                </form>
            </div>
        </div>
    </div>
</header>
