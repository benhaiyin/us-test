<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="common/common_cfg.jsp"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->

    <!-- START @HEAD -->
    <head>
        <!-- START @META SECTION -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta name="description" content="Blankon is a theme fullpack admin template powered by Twitter bootstrap 3 front-end framework. Included are multiple example pages, elements styles, and javascript widgets to get your project started.">
        <meta name="keywords" content="admin, admin template, bootstrap3, clean, fontawesome4, good documentation, lightweight admin, responsive dashboard, webapp">
        <meta name="author" content="Djava UI">
        <title>首页 | 晓羊优服</title>
        <!--/ END META SECTION -->

        <!-- START @FAVICONS -->
        <link href="${base}/img/ico/html/apple-touch-icon-144x144-precomposed.png" rel="apple-touch-icon-precomposed" sizes="144x144" type="image/x-icon">
        <link href="${base}/img/ico/html/apple-touch-icon-114x114-precomposed.png" rel="apple-touch-icon-precomposed" sizes="114x114" type="image/x-icon">
        <link href="${base}/img/ico/html/apple-touch-icon-72x72-precomposed.png" rel="apple-touch-icon-precomposed" sizes="72x72" type="image/x-icon">
        <link href="${base}/img/ico/html/apple-touch-icon-57x57-precomposed.png" rel="apple-touch-icon-precomposed" type="image/x-icon">
        <link href="${base}/img/ico/html/apple-touch-icon.png" rel="shortcut icon" type="image/x-icon">
        
        <!--/ END FAVICONS -->

        <!-- START @FONT STYLES -->
        <link href="${base}/assets/admin/css/googlefonts.css?family=Open+Sans:400,300,600,700" rel="stylesheet">
        <link href="${base}/assets/admin/css/googlefonts.css?family=Oswald:700,400" rel="stylesheet">
        <!--/ END FONT STYLES -->

        <!-- START @GLOBAL MANDATORY STYLES -->
        <link href="${base}/assets/global/plugins/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
        <!--/ END GLOBAL MANDATORY STYLES -->

        <!-- START @PAGE LEVEL STYLES -->
        <link href="${base}/assets/global/plugins/bower_components/fontawesome/css/font-awesome.min.css" rel="stylesheet">
        <link href="${base}/assets/global/plugins/bower_components/animate.css/animate.min.css" rel="stylesheet">
        <link href="${base}/assets/global/plugins/bower_components/dropzone/downloads/css/dropzone.css" rel="stylesheet">
        <link href="${base}/assets/global/plugins/bower_components/jquery.gritter/css/jquery.gritter.css" rel="stylesheet">
        <link href="${base}/assets/global/plugins/bower_components/bootstrap-tour/build/css/bootstrap-tour.min.css" rel="stylesheet">
		<link href="${base}/assets/commercial/plugins/cube-portfolio/cubeportfolio/css/cubeportfolio.min.css" rel="stylesheet">
        <!--/ END PAGE LEVEL STYLES -->

        <!-- START @THEME STYLES -->
        <link href="${base}/assets/admin/css/reset.css" rel="stylesheet">
        <link href="${base}/assets/admin/css/layout.css" rel="stylesheet">
        <link href="${base}/assets/admin/css/components.css" rel="stylesheet">
        <link href="${base}/assets/admin/css/plugins.css" rel="stylesheet">
        <link href="${base}/assets/admin/css/themes/default.theme.css" rel="stylesheet" id="theme">
        <link href="${base}/assets/admin/css/custom.css" rel="stylesheet">
        <!--/ END THEME STYLES -->

        <!-- START @IE SUPPORT -->
        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
        <script src="${base}/assets/global/plugins/bower_components/html5shiv/dist/html5shiv.min.js"></script>
        <script src="${base}/assets/global/plugins/bower_components/respond-minmax/dest/respond.min.js"></script>
        <![endif]-->
        <!--/ END IE SUPPORT -->
    </head>
    <!--/ END HEAD -->

    <!--

    |=========================================================================================================================|
    |  TABLE OF CONTENTS (Use search to find needed section)                                                                  |
    |=========================================================================================================================|
    |  01. @HEAD                        |  Container for all the head elements                                                |
    |  02. @META SECTION                |  The meta tag provides metadata about the HTML document                             |
    |  03. @FAVICONS                    |  Short for favorite icon, shortcut icon, website icon, tab icon or bookmark icon    |
    |  04. @FONT STYLES                 |  Font from google fonts                                                             |
    |  05. @GLOBAL MANDATORY STYLES     |  The main 3rd party plugins css file                                                |
    |  06. @PAGE LEVEL STYLES           |  Specific 3rd party plugins css file                                                |
    |  07. @THEME STYLES                |  The main theme css file                                                            |
    |  08. @IE SUPPORT                  |  IE support of HTML5 elements and media queries                                     |
    |=========================================================================================================================|
    |  09. @BODY                        |  Contains all the contents of an HTML document                                      |
    |  10. @WRAPPER                     |  Wrapping page section                                                              |
    |  11. @HEADER                      |  Header page section contains about logo, top navigation, notification menu         |
    |  12. @SIDEBAR LEFT                |  Sidebar page section contains all sidebar menu left                                |
    |  13. @PAGE CONTENT                |  Contents page section contains breadcrumb, content page, footer page               |
    |  14. @SIDEBAR RIGHT               |  Sidebar page section contains all sidebar menu right                               |
    |  15. @BACK TOP                    |  Element back to top and action                                                     |
    |=========================================================================================================================|
    |  16. @CORE PLUGINS                |  The main 3rd party plugins script file                                             |
    |  17. @PAGE LEVEL PLUGINS          |  Specific 3rd party plugins script file                                             |
    |  18. @PAGE LEVEL SCRIPTS          |  The main theme script file                                                         |
    |=========================================================================================================================|

    START @BODY
    |=========================================================================================================================|
	|  TABLE OF CONTENTS (Apply to body class)                                                                                |
	|=========================================================================================================================|
    |  01. page-boxed                   |  Page into the box is not full width screen                                         |
	|  02. page-header-fixed            |  Header element become fixed position                                               |
	|  03. page-sidebar-fixed           |  Sidebar element become fixed position with scroll support                          |
	|  04. page-sidebar-minimize        |  Sidebar element become minimize style width sidebar                                |
	|  05. page-footer-fixed            |  Footer element become fixed position with scroll support on page content           |
	|  06. page-sound                   |  For playing sounds on user actions and page events                                 |
	|=========================================================================================================================|

	-->
    <body class="page-session page-sound page-header-fixed page-sidebar-fixed demo-dashboard-session">

        <!--[if lt IE 9]>
        <p class="upgrade-browser">Upps!! You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <!-- START @WRAPPER -->
        <section id="wrapper">

            <!-- START @HEADER -->
            <header id="header">

                <!-- Start header left -->
                <div class="header-left">
                    <!-- Start offcanvas left: This menu will take position at the top of template header (mobile only). Make sure that only #header have the `position: relative`, or it may cause unwanted behavior -->
                    <div class="navbar-minimize-mobile left">
                        <i class="fa fa-bars"></i>
                    </div>
                    <!--/ End offcanvas left -->

                    <!-- Start navbar header -->
                    <div class="navbar-header">

                        <!-- Start brand -->
                        <a id="tour-1" class="navbar-brand" href="dashboard.html">
                            <img class="logo" src="${base}/img/logo/html/logo-white.png" alt="brand logo"/>
                        </a><!-- /.navbar-brand -->
                        <!--/ End brand -->

                    </div><!-- /.navbar-header -->
                    <!--/ End navbar header -->

                    <!-- Start offcanvas right: This menu will take position at the top of template header (mobile only). Make sure that only #header have the `position: relative`, or it may cause unwanted behavior -->
                    <div class="navbar-minimize-mobile right">
                        <i class="fa fa-cog"></i>
                    </div>
                    <!--/ End offcanvas right -->

                    <div class="clearfix"></div>
                </div><!-- /.header-left -->
                <!--/ End header left -->

                <!-- Start header right -->
                <div class="header-right">
                    <!-- Start navbar toolbar -->
                    <div class="navbar navbar-toolbar">

                        <!-- Start left navigation -->
                        <ul class="nav navbar-nav navbar-left">

                            <!-- Start sidebar shrink -->
                            <li id="tour-2" class="navbar-minimize">
                                <a href="javascript:void(0);" title="Minimize sidebar">
                                    <i class="fa fa-bars"></i>
                                </a>
                            </li>
                            <!--/ End sidebar shrink -->

                            <!-- Start form search -->
                            <li class="navbar-search">
                                <!-- Just view on mobile screen-->
                                <a href="#" class="trigger-search"><i class="fa fa-search"></i></a>
                                <form id="tour-3" class="navbar-form">
                                    <div class="form-group has-feedback">
                                        <input type="text" class="form-control typeahead rounded" placeholder="搜索服务…">
                                        <button type="submit" class="btn btn-theme fa fa-search form-control-feedback rounded"></button>
                                    </div>
                                </form>
                            </li>
                            <!--/ End form search -->

                        </ul><!-- /.nav navbar-nav navbar-left -->
                        <!--/ End left navigation -->

                        <!-- Start right navigation -->
                        <ul class="nav navbar-nav navbar-right"><!-- /.nav navbar-nav navbar-right -->

							<!-- Start 购物车 -->
							<li class="dropdown navbar-message">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-opencart"></i><span class="count label label-danger rounded">2</span></a>
							</li>
							<!-- End 购物车 -->

							<!-- Start notifications -->
                            <li class="dropdown navbar-notification">

                                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope-o"></i><span class="rounded count label label-danger">6</span></a>

                                <!-- Start dropdown menu -->
                                <div class="dropdown-menu animated flipInX">
                                    <div class="dropdown-header">
                                        <span class="title">Notifications <strong>(10)</strong></span>
                                        <span class="option text-right"><a href="#"><i class="fa fa-cog"></i> Setting</a></span>
                                    </div>
                                    <div class="dropdown-body niceScroll">

                                        <!-- Start notification list -->
                                        <div class="media-list small">

                                            <a href="#" class="media">
                                                <div class="media-object pull-left"><i class="fa fa-share-alt fg-info"></i></div>
                                                <div class="media-body">
                                                    <span class="media-text"><strong>Dolanan Remi : </strong><strong>Chris Job,</strong><strong>Denny Puk</strong> and <strong>Joko Fernandes</strong> sent you <strong>5 free energy boosts and other request</strong></span>
                                                    <!-- Start meta icon -->
                                                    <span class="media-meta">3 minutes</span>
                                                    <!--/ End meta icon -->
                                                </div><!-- /.media-body -->
                                            </a><!-- /.media -->

                                            <a href="#" class="media">
                                                <div class="media-object pull-left"><i class="fa fa-cogs fg-success"></i></div>
                                                <div class="media-body">
                                                    <span class="media-text">Your sistem is updated</span>
                                                    <!-- Start meta icon -->
                                                    <span class="media-meta">5 minutes</span>
                                                    <!--/ End meta icon -->
                                                </div><!-- /.media-body -->
                                            </a><!-- /.media -->

                                            <a href="#" class="media">
                                                <div class="media-object pull-left"><i class="fa fa-ban fg-danger"></i></div>
                                                <div class="media-body">
                                                    <span class="media-text">3 Member is BANNED</span>
                                                    <!-- Start meta icon -->
                                                    <span class="media-meta">5 minutes</span>
                                                    <!--/ End meta icon -->
                                                </div><!-- /.media-body -->
                                            </a><!-- /.media -->

                                            <a href="#" class="media">
                                                <div class="media-object pull-left"><img class="img-circle" src="${base}/img/avatar/50/10.png" alt=""/></div>
                                                <div class="media-body">
                                                    <span class="media-text">daddy pushed to project Blankon version 1.0.0</span>
                                                    <!-- Start meta icon -->
                                                    <span class="media-meta">45 minutes</span>
                                                    <!--/ End meta icon -->
                                                </div><!-- /.media-body -->
                                            </a><!-- /.media -->

                                            <a href="#" class="media">
                                                <div class="media-object pull-left"><i class="fa fa-user fg-info"></i></div>
                                                <div class="media-body">
                                                    <span class="media-text">Change your user profile</span>
                                                    <!-- Start meta icon -->
                                                    <span class="media-meta">1 days</span>
                                                    <!--/ End meta icon -->
                                                </div><!-- /.media-body -->
                                            </a><!-- /.media -->

                                            <a href="#" class="media">
                                                <div class="media-object pull-left"><i class="fa fa-book fg-info"></i></div>
                                                <div class="media-body">
                                                    <span class="media-text">Added new article</span>
                                                    <!-- Start meta icon -->
                                                    <span class="media-meta">1 days</span>
                                                    <!--/ End meta icon -->
                                                </div><!-- /.media-body -->
                                            </a><!-- /.media -->

                                            <!-- Start notification indicator -->
                                            <a href="#" class="media indicator inline">
                                                <span class="spinner">Load more notifications...</span>
                                            </a>
                                            <!--/ End notification indicator -->

                                        </div>
                                        <!--/ End notification list -->

                                    </div>
                                    <div class="dropdown-footer">
                                        <a href="#">See All</a>
                                    </div>
                                </div>
                                <!--/ End dropdown menu -->

                            </li><!-- /.navbar-notification -->
                            <!--/ End notifications -->

                            

                        <!-- Start profile -->
                        <li id="tour-6" class="dropdown navbar-profile">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <span class="meta">
                                    <span class="avatar"><img src="${base}/img/avatar/35/1.png" class="img-circle" alt="admin"></span>
                                    <span class="text hidden-xs hidden-sm text-muted">Tol Lee</span>
                                    <span class="caret"></span>
                                </span>
                            </a>
                            <!-- Start dropdown menu -->
                            <ul class="dropdown-menu animated flipInX">
                                <li class="dropdown-header">Account</li>
                                <li><a href="page-profile.html"><i class="fa fa-user"></i>View profile</a></li>
                                <li><a href="mail-inbox.html"><i class="fa fa-envelope-square"></i>Inbox <span class="label label-info pull-right">30</span></a></li>
                                <li><a href="#"><i class="fa fa-share-square"></i>Invite a friend</a></li>
                                <li class="dropdown-header">Product</li>
                                <li><a href="#"><i class="fa fa-upload"></i>Upload</a></li>
                                <li><a href="#"><i class="fa fa-dollar"></i>Earning</a></li>
                                <li><a href="#"><i class="fa fa-download"></i>Withdrawals</a></li>
                                <li class="divider"></li>
                                <li><a href="page-signin.html"><i class="fa fa-sign-out"></i>Logout</a></li>
                            </ul>
                            <!--/ End dropdown menu -->
                        </li><!-- /.dropdown navbar-profile -->
                        <!--/ End profile -->

                        <!-- Start settings -->
                        <li id="tour-7" class="navbar-setting pull-right">
                            <a href="javascript:void(0);"><i class="fa fa-cog fa-spin"></i></a>
                        </li><!-- /.navbar-setting pull-right -->
                        <!--/ End settings -->

                        </ul>
                        <!--/ End right navigation -->

                    </div><!-- /.navbar-toolbar -->
                    <!--/ End navbar toolbar -->
                </div><!-- /.header-right -->
                <!--/ End header left -->

            </header> <!-- /#header -->
            <!--/ END HEADER -->

            <!--

            START @SIDEBAR LEFT
            |=========================================================================================================================|
            |  TABLE OF CONTENTS (Apply to sidebar left class)                                                                        |
            |=========================================================================================================================|
            |  01. sidebar-box               |  Variant style sidebar left with box icon                                              |
            |  02. sidebar-rounded           |  Variant style sidebar left with rounded icon                                          |
            |  03. sidebar-circle            |  Variant style sidebar left with circle icon                                           |
            |=========================================================================================================================|

            -->
            <aside id="sidebar-left" class="sidebar-circle">

                <!-- Start left navigation - profile shortcut -->
				<!--
                <div id="tour-8" class="sidebar-content">
                    <div class="media">
                        <a class="pull-left has-notif avatar" href="page-profile.html">
                            <img src="${base}/img/avatar/50/1.png" alt="admin">
                            <i class="online"></i>
                        </a>
                        <div class="media-body">
                            <h4 class="media-heading">Hello, <span>Lee</span></h4>
                            <small>Web Designer</small>
                        </div>
                    </div>
                </div>
				-->
                <!--/ End left navigation -  profile shortcut -->

                <!-- Start left navigation - menu -->
                <ul id="tour-9" class="sidebar-menu">

                    <!-- Start navigation - dashboard -->
					<li class="active">
                        <a href="us-dashboard.html">
                            <span class="icon"><i class="fa fa-home"></i></span>
                            <span class="text">首页</span>
                            <span class="selected"></span>
                        </a>
                    </li>
                    <!--/ End navigation - dashboard -->

					<!-- Start category 服务 -->
					<li class="sidebar-category">
                        <span>服务</span>
                        <span class="pull-right"><i class="fa fa-diamond"></i></span>
                    </li>

					<li class="submenu">
                        <a href="javascript:void(0);">
                            <span class="icon"><i class="fa fa-briefcase"></i></span>
                            <span class="text">行政综合</span>
                            <span class="arrow"></span>
                        </a>
                        <ul>
                            <li><a href="us-product-grid.html">办公采购</a></li>
							<li><a href="us-product-grid.html">绿植租赁</a></li>
							<li><a href="us-product-grid.html">桌椅租赁</a></li>
							<li><a href="us-product-grid.html">设备租赁</a></li>
							<li><a href="us-product-grid.html">办公场地</a></li>
							<li><a href="us-product-grid.html">保安保洁</a></li>
							<li><a href="us-product-grid.html">搬场服务</a></li>
							<li><a href="us-product-grid.html">翻译服务</a></li>
							<li><a href="us-product-grid.html">400电话</a></li>
                        </ul>
                    </li>

					<li class="submenu">
                        <a href="javascript:void(0);">
                            <span class="icon"><i class="fa fa-group"></i></span>
                            <span class="text">人力资源</span>
                            <span class="arrow"></span>
                        </a>
                        <ul>
                            <li><a href="us-product-grid.html">人才招聘</a></li>
							<li><a href="us-product-grid.html">人才派遣</a></li>
							<li><a href="us-product-grid.html">员工关怀</a></li>
							<li><a href="us-product-grid.html">社保人事</a></li>
							<li><a href="us-product-grid.html">企业培训</a></li>
							<li><a href="us-product-grid.html">团队拓展</a></li>
							<li><a href="us-product-grid.html">商业保险</a></li>
                        </ul>
                    </li>

					<li class="submenu">
                        <a href="javascript:void(0);">
                            <span class="icon"><i class="fa fa-magic"></i></span>
                            <span class="text">市场营销</span>
                            <span class="arrow"></span>
                        </a>
                        <ul>
                            <li><a href="us-product-grid.html">礼品采购</a></li>
							<li><a href="us-product-grid.html">设计</a></li>
							<li><a href="us-product-grid.html">印刷</a></li>
							<li><a href="us-product-grid.html">拍摄</a></li>
							<li><a href="us-product-grid.html">网络营销</a></li>
							<li><a href="us-product-grid.html">媒体传播</a></li>
                        </ul>
                    </li>

					<li class="submenu">
                        <a href="javascript:void(0);">
                            <span class="icon"><i class="fa fa-cny"></i></span>
                            <span class="text">财税法务</span>
                            <span class="arrow"></span>
                        </a>
                        <ul>
                            <li><a href="us-product-grid.html">代理记账</a></li>
							<li><a href="us-product-grid.html">企业理财</a></li>
							<li class="submenu">
                                <a href="javascript:void(0);">企业融资<span class="arrow"></span></a>
                                <ul>
                                    <li><a href="us-product-grid.html">小额贷款</a></li>
                                    <li><a href="us-product-grid.html">股权融资</a></li>
                                </ul>
                            </li>
							<li><a href="us-product-grid.html">合同起草</a></li>
							<li><a href="us-product-grid.html">协议审定</a></li>
                        </ul>
                    </li>

					<li class="submenu">
                        <a href="javascript:void(0);">
                            <span class="icon"><i class="fa fa-black-tie"></i></span>
                            <span class="text">登记认证</span>
                            <span class="arrow"></span>
                        </a>
                        <ul>
							<li class="submenu">
                                <a href="javascript:void(0);">工商税务<span class="arrow"></span></a>
                                <ul>
                                    <li><a href="us-product-grid.html">公司注册</a></li>
                                    <li><a href="us-product-grid.html">工商变更</a></li>
									<li><a href="us-product-grid.html">公司注销</a></li>
                                </ul>
                            </li>
							<li class="submenu">
                                <a href="javascript:void(0);">知识产权<span class="arrow"></span></a>
                                <ul>
                                    <li><a href="us-product-grid.html">商标注册</a></li>
                                    <li><a href="us-product-grid.html">专利申请</a></li>
									<li><a href="us-product-grid.html">软件著作权</a></li>
                                </ul>
                            </li>
                            <li><a href="us-product-grid.html">资质认证</a></li>
							<li><a href="us-product-grid.html">项目申报</a></li>
                        </ul>
                    </li>

					<li class="submenu">
                        <a href="javascript:void(0);">
                            <span class="icon"><i class="fa fa-download"></i></span>
                            <span class="text">资源下载</span>
                            <span class="arrow"></span>
                        </a>
                        <ul>
                            <li><a href="us-file-grid.html">合同模板</a></li>
							<li><a href="us-file-grid.html">PPT模板</a></li>
                        </ul>
                    </li>

					<!--/ End category 服务 -->

					<!-- Start category 运营 -->
                    <li class="sidebar-category">
                        <span>运营</span>
                        <span class="pull-right"><i class="fa fa-line-chart"></i></span>
                    </li>

					 <li class="submenu">
                        <a href="javascript:void(0);">
                            <span class="icon"><i class="fa fa-cube"></i></span>
                            <span class="text">商品管理</span>
                            <span class="arrow"></span>
                        </a>
                        <ul>
                            <li><a href="us-product-list.html">商品列表</a></li>
                            <li><a href="us-product-add.html">添加商品</a></li>
							<li><a href="us-flow-list.html">交付流程</a></li>
                        </ul>
                    </li>

					<li class="submenu">
                        <a href="javascript:void(0);">
                            <span class="icon"><i class="fa fa-shopping-cart"></i></span>
                            <span class="text">订单交付</span>
                            <span class="arrow"></span>
                        </a>
                        <ul>
                            <li><a href="us-order-list.html">订单列表</a></li>
                            <li><a href="us-issue-tracker.html">工作任务</a></li>
                        </ul>
                    </li>

					 <li class="submenu">
                        <a href="javascript:void(0);">
                            <span class="icon"><i class="fa fa-money"></i></span>
                            <span class="text">财务管理</span>
                            <span class="arrow"></span>
                        </a>
                        <ul>
                            <li><a href="us-finance-summary.html">应收应付汇总</a></li>
                            <li><a href="us-finance-detail.html">应收应付明细</a></li>
                            <li><a href="us-account-doc-list.html">会计凭证</a></li>
                        </ul>
                    </li>

					 <li class="submenu">
                        <a href="javascript:void(0);">
                            <span class="icon"><i class="fa fa-coffee"></i></span>
                            <span class="text">客户关系</span>
                            <span class="arrow"></span>
                        </a>
                        <ul>
                            <li><a href="us-user-list.html">用户</a></li>
                            <li><a href="us-customer-list.html">客户</a></li>
                            <li><a href="us-supplier-list.html">服务商</a></li>
                            <li><a href="us-partner-list.html">运营商</a></li>
                        </ul>
                    </li>
					<!--/ End category 运营 -->

					<!-- Start category 我的 -->
					<li class="sidebar-category">
                        <span>我的</span>
                        <span class="pull-right"><i class="fa fa-gear"></i></span>
                    </li>

					<li>
                        <a href="us-order-list.html">
                            <span class="icon"><i class="fa fa-shopping-cart"></i></span>
                            <span class="text">我的订单</span>
                        </a>
                    </li>

					<li class="submenu">
                        <a href="us-profile.html">
                            <span class="icon"><i class="fa fa-user"></i></span>
                            <span class="text">用户中心</span>
                        </a>
                    </li>

					<li class="submenu">
                        <a href="javascript:void(0);">
                            <span class="icon"><i class="fa fa-gear"></i></span>
                            <span class="text">财务管理</span>
                            <span class="arrow"></span>
                        </a>
                        <ul>
							<li><a href="us-finance-summary.html">应收应付汇总</a></li>
							<li><a href="us-finance-detail.html">应收应付明细</a></li>
							<li><a href="us-account-doc-list.html">会计凭证</a></li>
                        </ul>
                    </li>

					<li class="submenu">
                        <a href="us-message-view.html">
                            <span class="icon"><i class="fa fa-envelope"></i></span>
                            <span class="text">消息提醒</span>
                        </a>
                    </li>

					<li class="submenu">
                        <a href="javascript:void(0);">
                            <span class="icon"><i class="fa fa-gear"></i></span>
                            <span class="text">偏好设置</span>
                            <span class="arrow"></span>
                        </a>
                        <ul>
							<li><a href="us-message-subscribe.html">消息订阅</a></li>
							<li class="submenu">
                                <a href="javascript:void(0);">常用<span class="arrow"></span></a>
                                <ul>
                                    <li><a href="us-info-address.html">常用地址</a></li>
                                    <li><a href="us-info-invoice.html">常用发票</a></li>
                                </ul>
                            </li>
                        </ul>
                    </li>
					<!--/ End category 我的 -->

                </ul><!-- /.sidebar-menu -->
                <!--/ End left navigation - menu -->

                <!-- Start left navigation - footer -->
                <div id="tour-10" class="sidebar-footer hidden-xs hidden-sm hidden-md">
                    <a id="setting" class="pull-left" href="javascript:void(0);" data-toggle="tooltip" data-placement="top" data-title="设置"><i class="fa fa-cog"></i></a>
                    <a id="fullscreen" class="pull-left" href="javascript:void(0);" data-toggle="tooltip" data-placement="top" data-title="全屏"><i class="fa fa-desktop"></i></a>
                    <a id="lock-screen" data-url="page-signin.html" class="pull-left" href="javascript:void(0);" data-toggle="tooltip" data-placement="top" data-title="锁屏"><i class="fa fa-lock"></i></a>
                    <a id="logout" data-url="page-lock-screen.html" class="pull-left" href="javascript:void(0);" data-toggle="tooltip" data-placement="top" data-title="退出"><i class="fa fa-power-off"></i></a>
                </div><!-- /.sidebar-footer -->
                <!--/ End left navigation - footer -->

            </aside><!-- /#sidebar-left -->
            <!--/ END SIDEBAR LEFT -->

            <!-- START @PAGE CONTENT -->
            <section id="page-content">

                <!-- Start page header -->
                <div id="tour-11" class="header-content">
                    <h2><i class="fa fa-home"></i>首页</h2>
                    <div class="breadcrumb-wrapper hidden-xs">
                        <span class="label">You are here:</span>
                        <ol class="breadcrumb">
                            <li class="active">Dashboard</li>
                        </ol>
                    </div>
                </div><!-- /.header-content -->
                <!--/ End page header -->

                <!-- Start body content -->
                <div class="body-content animated fadeIn us-dashboard">

                    <div id="tour-12" class="row">
                        <div class="col-lg-9 col-md-9 col-sm-6 col-xs-12">
                            <!-- 广告区 START -->
							<div id="carousel-blog-post" class="carousel slide blog-item" data-ride="carousel">
								<ol class="carousel-indicators">
									<li data-target="#carousel-blog-post" data-slide-to="0" class=""></li>
									<li data-target="#carousel-blog-post" data-slide-to="1" class="active"></li>
								</ol>

								<div class="carousel-inner">
									<div class="item active left">
										<img data-no-retina="" src="${base}/img/ws/brand-test-a.jpg" class="img-responsive" alt="...">
										<div class="carousel-caption">
											I am
										</div>
									</div>
									<div class="item next left">
										<img data-no-retina="" src="${base}/img/ws/brand-test-b.jpg" class="img-responsive" alt="...">
										<div class="carousel-caption">
											Be Happy :D
										</div>
									</div>
								</div>

								<a class="left carousel-control" href="#carousel-blog-post" role="button" data-slide="prev"><span class="fa fa-angle-left"></span></a>
								<a class="right carousel-control" href="#carousel-blog-post" role="button" data-slide="next"><span class="fa fa-angle-right"></span></a>
							</div>
							<!-- 广告区 END -->



							<!-- 行政综合 START -->
                            <div class="panel">
                                <div class="panel-heading">
                                    <div class="pull-left">
                                        <h3 class="panel-title"><i class="fa fa-briefcase"></i>&nbsp;行政综合</h3>
                                    </div>
                                    <div class="clearfix"></div>
                                </div><!-- /.panel-heading -->
                                <div class="panel-body">
                                    <div class="cbp no-margin grid-container">
										<div class="cbp-item art">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/art/500x300/3.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>
										</div>
										<div class="cbp-item art">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/art/500x300/2.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>
										</div>
										<div class="cbp-item animal">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/animals/500x300/8.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>

										</div>
										<div class="cbp-item technology">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/technology/500x300/6.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>

										</div>
									</div>
                                </div><!-- /.panel-body -->
                            </div><!-- /.panel -->
                            <!-- 行政综合 END -->


							<!-- 人力资源 START -->
							<div class="panel">
                                <div class="panel-heading">
                                    <div class="pull-left">
                                        <h3 class="panel-title"><i class="fa fa-group"></i>&nbsp;人力资源</h3>
                                    </div>
                                    <div class="clearfix"></div>
                                </div><!-- /.panel-heading -->
                                <div class="panel-body">
                                    <div class="cbp no-margin grid-container">
										<div class="cbp-item art">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/art/500x300/3.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>
										</div>
										<div class="cbp-item art">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/art/500x300/2.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>
										</div>
										<div class="cbp-item animal">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/animals/500x300/8.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>

										</div>
										<div class="cbp-item technology">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/technology/500x300/6.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>

										</div>
									</div>
                                </div><!-- /.panel-body -->
                            </div><!-- /.panel -->
							<!-- 人力资源 END -->

							<!-- 市场营销 START -->
							<div class="panel">
                                <div class="panel-heading">
                                    <div class="pull-left">
                                        <h3 class="panel-title"><i class="fa fa-magic"></i>&nbsp;市场营销</h3>
                                    </div>
                                    <div class="clearfix"></div>
                                </div><!-- /.panel-heading -->
                                <div class="panel-body">
                                    <div class="cbp no-margin grid-container">
										<div class="cbp-item art">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/art/500x300/3.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>
										</div>
										<div class="cbp-item art">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/art/500x300/2.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>
										</div>
										<div class="cbp-item animal">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/animals/500x300/8.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>

										</div>
										<div class="cbp-item technology">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/technology/500x300/6.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>

										</div>
									</div>
                                </div><!-- /.panel-body -->
                            </div><!-- /.panel -->
							<!-- 市场营销 END -->


							<!-- 财税法务 START -->
							<div class="panel">
                                <div class="panel-heading">
                                    <div class="pull-left">
                                        <h3 class="panel-title"><i class="fa fa-cny"></i>&nbsp;财税法务</h3>
                                    </div>
                                    <div class="clearfix"></div>
                                </div><!-- /.panel-heading -->
                                <div class="panel-body">
                                    <div class="cbp no-margin grid-container">
										<div class="cbp-item art">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/art/500x300/3.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>
										</div>
										<div class="cbp-item art">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/art/500x300/2.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>
										</div>
										<div class="cbp-item animal">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/animals/500x300/8.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>

										</div>
										<div class="cbp-item technology">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/technology/500x300/6.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>

										</div>
									</div>
                                </div><!-- /.panel-body -->
                            </div><!-- /.panel -->
							<!-- 财税法务 END -->


							<!-- 登记认证 START -->
							<div class="panel">
                                <div class="panel-heading">
                                    <div class="pull-left">
                                        <h3 class="panel-title"><i class="fa fa-black-tie"></i>&nbsp;登记认证</h3>
                                    </div>
                                    <div class="clearfix"></div>
                                </div><!-- /.panel-heading -->
                                <div class="panel-body">
                                    <div class="cbp no-margin grid-container">
										<div class="cbp-item art">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/art/500x300/3.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>
										</div>
										<div class="cbp-item art">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/art/500x300/2.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>
										</div>
										<div class="cbp-item animal">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/animals/500x300/8.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>

										</div>
										<div class="cbp-item technology">
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-caption">
												<div class="cbp-caption-defaultWrap">
													<img data-no-retina src="${base}/img/media/technology/500x300/6.jpg" alt="...">
												</div>
												<div class="cbp-caption-activeWrap">
													<div class="cbp-l-caption-alignCenter">
														<div class="cbp-l-caption-body">
															<div class="cbp-l-caption-text">商品名称</div>
														</div>
													</div>
												</div>
											</a>
											<a href="https://wrapbootstrap.com/user/djavaui" target="_blank" class="cbp-l-grid-blog-title">这里是商品名称</a>
											<div class="mt-10">
												<div class="pull-left">
													<span class="us-price mr-10">￥1000.00</span><span class="us-view-price">￥1000.00</span>
												</div>
												<div class="pull-right">
													已售：<span>7150</span>
												</div>
												<div class="clearfix"></div>
											</div>

										</div>
									</div>
                                </div><!-- /.panel-body -->
                            </div><!-- /.panel -->
							<!-- 登记认证 END -->

                        </div>
                        <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">


							<!-- 公司/商标/域名核名 START -->
							<div class="panel rounded shadow panel-theme">
                                <div class="panel-heading">
                                    <div class="pull-left">
                                        <h3 class="panel-title">免费核名</h3>
                                    </div>
                                    <div class="pull-right">
                                        <button title="" data-original-title="" class="btn btn-sm" data-container="body" data-action="collapse" data-toggle="tooltip" data-placement="top" data-title="Collapse"><i class="fa fa-angle-up"></i></button>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="panel-body no-padding">
                                    <form action="#" class="form-horizontal">
                                        <div class="form-body p-20">
                                            <div class="form-group">
                                                <input class="form-control mb-20" type="text" placeholder="想注册的公司名称&nbsp;/&nbsp;商标&nbsp;/&nbsp;域名">
												<button class="btn btn-success btn-stroke btn-block" type="submit">免费查询能否注册</button>
                                            </div>
										</div>
									</form>
								</div><!-- /.panel-body -->
							</div><!-- /.panel -->
							<!-- 公司/商标/域名核名 END -->


                            <!-- 最新发布 START -->
							<div class="panel panel-danger shadow blog-list-slider">
								<div class="panel-heading">
									<h3 class="panel-title">最新发布</h3>
								</div>
								<div id="carousel-blog-list" class="carousel slide" data-ride="carousel">
									<ol class="carousel-indicators">
										<li data-target="#carousel-blog-list" data-slide-to="0" class="active"></li>
										<li data-target="#carousel-blog-list" data-slide-to="1"></li>
									</ol>
									<div class="carousel-inner">
										<div class="item active">
											<div class="blog-list">
												<div class="media">
													<a class="pull-left" href="#">
														<img data-no-retina src="${base}/img/media/technology/1.jpg" alt="..." class="img-responsive img-thumbnail"/>
													</a>
													<div class="media-body">
														<h4 class="media-heading"><a href="blog-single.html" title="Lorem ipsum dolor sit">Lorem ipsum dolor sit</a></h4>
														<small class="media-desc">Amet, consectetur adipisicing elit, sed do ut labore et dolore magna aliqua...</small>
													</div>
												</div>

												<div class="media">
													<a class="pull-left" href="#">
														<img data-no-retina src="${base}/img/media/technology/2.jpg" alt="..." class="img-responsive img-thumbnail"/>
													</a>
													<div class="media-body">
														<h4 class="media-heading"><a href="blog-single.html" title="Ut enim ad minim veniam">Ut enim ad minim veniam</a></h4>
														<small class="media-desc">Quis nostrud exercitation ullamco laboris nisi ut aliquip ex commodo...</small>
													</div>
												</div>

											</div>
										</div>
										<div class="item">
											<div class="blog-list">
												<div class="media">
													<a class="pull-left" href="#">
														<img data-no-retina src="${base}/img/media/animals/2.jpg" alt="..." class="img-responsive img-thumbnail"/>
													</a>
													<div class="media-body">
														<h4 class="media-heading"><a href="blog-single.html" title="Excepteur sint occaecat cupidatat">Excepteur sint occaecat cupidatat</a></h4>
														<small class="media-desc">Sunt in culpa qui officia deserunt mollit anim id est laborum...</small>
													</div>
												</div>

												<div class="media">
													<a class="pull-left" href="#">
														<img data-no-retina src="${base}/img/media/animals/3.jpg" alt="..." class="img-responsive img-thumbnail"/>
													</a>
													<div class="media-body">
														<h4 class="media-heading"><a href="blog-single.html" title="Sed ut perspiciatis unde">Sed ut perspiciatis unde</a></h4>
														<small class="media-desc">Omnis iste natus error sit voluptatem natus error sit accusantium...</small>
													</div>
												</div>

											</div>
										</div>
									</div>
								</div>
							</div><!-- /.blog-list-slider -->
							<!-- 最新发布 END -->

							<!-- 客户声音 START -->
							<div class="panel panel-primary shadow">
                                <div class="panel-body no-padding">
                                    <div id="carousel-social-post" class="carousel slide rounded" data-ride="carousel">
										<ol class="carousel-indicators">
											<li data-target="#carousel-social-post" data-slide-to="0" class="active"></li>
											<li data-target="#carousel-social-post" data-slide-to="1"></li>
											<li data-target="#carousel-social-post" data-slide-to="2"></li>
										</ol><!-- /.carousel-indicators -->
										<div class="carousel-inner">
											<div class="item active">
												<div class="panel panel-bg-lilac no-margin">
													<div class="panel-body">
														<ul class="inner-all list-unstyled us-category-banner">
															<li class="text-center">
																<img data-no-retina class="img-circle img-bordered-default" src="${base}/img/avatar/100/17.png" alt="Leli Madang">
															</li>
															<li class="text-center">
																<h4 class="text-capitalize">Leli Madang</h4>

															</li>
															<li class="text-center">
																<p>
																	Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
																	tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.
																</p>
															</li>
														</ul>
													</div><!-- /.panel-body -->
												</div><!-- /.panel -->
											</div><!-- /.item -->
											<div class="item">
												<div class="panel panel-bg-danger no-margin">
													<div class="panel-body">
														<ul class="inner-all list-unstyled us-category-banner">
															<li class="text-center">
																<img data-no-retina class="img-circle img-bordered-default" src="${base}/img/avatar/100/18.png" alt="...">
															</li>
															<li class="text-center">
																<h4 class="text-capitalize">Rebecca Cabean</h4>
															</li>
															<li class="text-center">
																<p>
																	Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
																	tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.
																</p>
															</li>
														</ul>
													</div><!-- /.panel-body -->
												</div><!-- /.panel -->
											</div><!-- /.item -->
											<div class="item">
												<div class="panel panel-bg-success no-margin">
													<div class="panel-body">
														<ul class="inner-all list-unstyled us-category-banner">
															<li class="text-center">
																<img data-no-retina class="img-circle img-bordered-default" src="${base}/img/avatar/100/19.png" alt="Sishy Mawar">
															</li>
															<li class="text-center">
																<h4 class="text-capitalize">Sishy Mawar</h4>
															</li>
															<li class="text-center">
																<p>
																	Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
																	tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.
																</p>
															</li>
														</ul>
													</div><!-- /.panel-body -->
												</div><!-- /.panel -->
											</div><!-- /.item -->
										</div><!-- /.carousel-inner -->
									</div><!-- carousel -->

                                </div><!-- /.panel-body -->
                            </div>
							<!-- 客户声音 END -->

							<!-- 星级服务商 START -->
							<div class="panel panel-primary shadow">
								<!-- Start ribbon wrapper -->
								<div class="ribbon-wrapper">
									<div class="ribbon ribbon-info ribbon-shadow">
										<i class="fa fa-diamond"></i>
									</div>
								</div>
								<!--/ End ribbon wrapper -->
                                
                                <div class="panel-body no-padding">
                                    <div id="carousel-social-post" class="carousel slide rounded" data-ride="carousel">
										<ol class="carousel-indicators">
											<li data-target="#carousel-social-post" data-slide-to="0" class="active"></li>
											<li data-target="#carousel-social-post" data-slide-to="1"></li>
											<li data-target="#carousel-social-post" data-slide-to="2"></li>
										</ol><!-- /.carousel-indicators -->
										<div class="carousel-inner">
											<div class="item active">
												<div class="panel panel-bg-lilac no-margin">
													<div class="panel-body">
														<ul class="inner-all list-unstyled us-category-banner">
															<li class="text-center">
																<img data-no-retina class="img-circle img-bordered-default" src="${base}/img/avatar/100/17.png" alt="Leli Madang">
															</li>
															<li class="text-center">
																<h4 class="text-capitalize">Leli Madang</h4>

															</li>
															<li class="text-center">
																<p>
																	Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
																	tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.
																</p>
															</li>
														</ul>
													</div><!-- /.panel-body -->
												</div><!-- /.panel -->
											</div><!-- /.item -->
											<div class="item">
												<div class="panel panel-bg-danger no-margin">
													<div class="panel-body">
														<ul class="inner-all list-unstyled us-category-banner">
															<li class="text-center">
																<img data-no-retina class="img-circle img-bordered-default" src="${base}/img/avatar/100/18.png" alt="...">
															</li>
															<li class="text-center">
																<h4 class="text-capitalize">Rebecca Cabean</h4>
															</li>
															<li class="text-center">
																<p>
																	Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
																	tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.
																</p>
															</li>
														</ul>
													</div><!-- /.panel-body -->
												</div><!-- /.panel -->
											</div><!-- /.item -->
											<div class="item">
												<div class="panel panel-bg-success no-margin">
													<div class="panel-body">
														<ul class="inner-all list-unstyled us-category-banner">
															<li class="text-center">
																<img data-no-retina class="img-circle img-bordered-default" src="${base}/img/avatar/100/19.png" alt="Sishy Mawar">
															</li>
															<li class="text-center">
																<h4 class="text-capitalize">Sishy Mawar</h4>
															</li>
															<li class="text-center">
																<p>
																	Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
																	tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.
																</p>
															</li>
														</ul>
													</div><!-- /.panel-body -->
												</div><!-- /.panel -->
											</div><!-- /.item -->
										</div><!-- /.carousel-inner -->
									</div><!-- carousel -->

                                </div><!-- /.panel-body -->

								<div class="panel-footer">
									<button type="button" class="btn btn-info btn-stroke btn-block">服务商申请入驻</button>
                                </div><!-- /.panel-footer -->
                            </div>
							<!-- 星级服务商 END -->

                        </div>
                    </div><!-- /.row -->
                    
                    

                </div><!-- /.body-content -->
                <!--/ End body content -->

                <!-- Start footer content -->
                <footer class="footer-content">
                    <span id="tour-19">
                        2014 - <span id="copyright-year"></span> &copy; Blankon Admin. Created by <a href="http://djavaui.com/">Djava UI</a>, Yogyakarta ID
                    </span>
                    <span id="tour-20" class="pull-right">0.01 GB(0%) of 15 GB used</span>
                </footer><!-- /.footer-content -->
                <!--/ End footer content -->

            </section><!-- /#page-content -->
            <!--/ END PAGE CONTENT -->

            <!-- START @SIDEBAR RIGHT -->
            <aside id="sidebar-right">

                <div class="panel panel-tab">
                    <div class="panel-heading no-padding">
                        <div class="pull-right">
                            <ul class="nav nav-tabs">
                                <li>
                                    <a href="#sidebar-profile" data-toggle="tab">
                                        <i class="fa fa-user"></i>
                                    </a>
                                </li>
                                <li>
                                    <a href="#sidebar-layout" data-toggle="tab">
                                        <i class="fa fa-cogs"></i>
                                    </a>
                                </li>
                                <li class="active">
                                    <a href="#sidebar-setting" data-toggle="tab">
                                        <i class="fa fa-paint-brush"></i>
                                    </a>
                                </li>
                                <li>
                                    <a href="#sidebar-chat" data-toggle="tab">
                                        <i class="fa fa-comments"></i>
                                    </a>
                                </li>
                            </ul>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                    <div class="panel-body no-padding">
                        <div class="tab-content">
                            <div class="tab-pane" id="sidebar-profile">
                                <div class="sidebar-profile">

                                    <!-- Start right navigation - menu -->
                                    <ul class="sidebar-menu niceScroll">

                                        <!-- Start category about me -->
                                        <li class="sidebar-category">
                                            <span>ABOUT ME</span>
                                            <span class="pull-right"><i class="fa fa-newspaper-o"></i></span>
                                        </li>
                                        <!--/ End category about me -->

                                        <!--/ Start navigation - about me -->
                                        <li>
                                            <ul class="list-unstyled">
                                                <li>
                                                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed
                                                </li>
                                                <li>
                                                    <i class="fa fa-refresh"></i> Last update about 2 hours ago
                                                </li>
                                                <li>
                                                    <i class="fa fa-clock-o"></i> Total time spent 250 hrs
                                                </li>
                                                <li>
                                                    <i class="fa fa-envelope"></i> Tol.lee@djavaui.com
                                                </li>
                                                <li>
                                                    <i class="fa fa-mobile"></i> 1 405 777 1212
                                                </li>
                                            </ul>
                                        </li>
                                        <!--/ End navigation - about me -->

                                        <!-- Start category recent activity -->
                                        <li class="sidebar-category">
                                            <span>RECENT ACTIVITY</span>
                                            <span class="pull-right"><i class="fa fa-line-chart"></i></span>
                                        </li>
                                        <!--/ End category recent activity -->

                                        <!--/ Start navigation - activity -->
                                        <li>
                                            <div class="media-list activity">
                                                <a href="#" class="media">
                                                    <div class="media-object pull-left has-notif">
                                                        <i class="fa fa-flash"></i>
                                                    </div><!-- /.media-object -->
                                                    <div class="media-body">
                                                        <span class="media-heading">Added a note to Ticket #947</span>
                                                        <span class="media-meta time">about 2 hours ago</span>
                                                    </div><!-- /.media-body -->
                                                </a><!-- /.media -->
                                                <a href="#" class="media">
                                                    <div class="media-object pull-left has-notif">
                                                        <i class="fa fa-flash"></i>
                                                    </div><!-- /.media-object -->
                                                    <div class="media-body">
                                                        <span class="media-heading">Added a product to Ticket #948</span>
                                                        <span class="media-meta time">about 3 hours ago</span>
                                                    </div><!-- /.media-body -->
                                                </a><!-- /.media -->
                                                <a href="#" class="media">
                                                    <div class="media-object pull-left has-notif">
                                                        <i class="fa fa-flash"></i>
                                                    </div><!-- /.media-object -->
                                                    <div class="media-body">
                                                        <span class="media-heading">Added a service to Ticket #949</span>
                                                        <span class="media-meta time">about 15 hours ago</span>
                                                    </div><!-- /.media-body -->
                                                </a><!-- /.media -->
                                            </div><!-- /.media-list -->
                                        </li>
                                        <!--/ End navigation - activity -->

                                        <!-- Start category current working -->
                                        <li class="sidebar-category">
                                            <span>CURRENTLY WORKING</span>
                                            <span class="pull-right"><i class="fa fa-group"></i></span>
                                        </li>
                                        <!--/ End category current working -->

                                        <!-- Start left navigation - current working -->
                                        <li>
                                            <div class="media-list working">
                                                <a href="#" class="media">
                                                    <div class="media-object pull-left has-notif">
                                                        <img src="${base}/img/avatar/35/10.png" class="img-circle" alt="Daddy Botak">
                                                        <i class="online"></i>
                                                    </div><!-- /.media-object -->
                                                    <div class="media-body">
                                                        <span class="media-heading">Daddy Botak</span>
                                                        <span class="media-meta status">online</span>
                                                        <span class="media-meta device"><i class="fa fa-globe"></i></span>
                                                    </div><!-- /.media-body -->
                                                </a><!-- /.media -->
                                                <a href="#" class="media">
                                                    <div class="media-object pull-left has-notif">
                                                        <img src="${base}/img/avatar/35/11.png" class="img-circle" alt="Sarah Tingting">
                                                        <i class="offline"></i>
                                                    </div><!-- /.media-object -->
                                                    <div class="media-body">
                                                        <span class="media-heading">Sarah Tingting</span>
                                                        <span class="media-meta status">offline</span>
                                                        <span class="media-meta device"><i class="fa fa-globe"></i></span>
                                                        <span class="media-meta time">7 m</span>
                                                    </div><!-- /.media-body -->
                                                </a><!-- /.media -->
                                                <a href="#" class="media">
                                                    <div class="media-object pull-left has-notif">
                                                        <img src="${base}/img/avatar/35/26.png" class="img-circle" alt="">
                                                        <i class="busy"></i>
                                                    </div><!-- /.media-object -->
                                                    <div class="media-body">
                                                        <span class="media-heading">Nicolas Olivier</span>
                                                        <span class="media-meta status">busy</span>
                                                        <span class="media-meta device"><i class="fa fa-mobile"></i></span>
                                                    </div><!-- /.media-body -->
                                                </a><!-- /.media -->
                                                <a href="#" class="media">
                                                    <div class="media-object pull-left has-notif">
                                                        <img src="${base}/img/avatar/35/13.png" class="img-circle" alt="Claudia Cinta">
                                                        <i class="online"></i>
                                                    </div><!-- /.media-object -->
                                                    <div class="media-body">
                                                        <span class="media-heading">Claudia Cinta</span>
                                                        <span class="media-meta status">online</span>
                                                        <span class="media-meta device"><i class="fa fa-mobile"></i></span>
                                                    </div><!-- /.media-body -->
                                                </a><!-- /.media -->
                                                <a href="#" class="media">
                                                    <div class="media-object pull-left has-notif">
                                                        <img src="${base}/img/avatar/35/26.png" class="img-circle" alt="">
                                                        <i class="busy"></i>
                                                    </div><!-- /.media-object -->
                                                    <div class="media-body">
                                                        <span class="media-heading">Catherine Parker</span>
                                                        <span class="media-meta status">busy</span>
                                                        <span class="media-meta device"><i class="fa fa-mobile"></i></span>
                                                    </div><!-- /.media-body -->
                                                </a><!-- /.media -->
                                            </div><!-- /.media-list -->
                                        </li>
                                        <!--/ End left navigation - current working -->

                                    </ul>
                                    <!-- Start right navigation - menu -->
                                </div>
                            </div><!-- /#sidebar-profile -->
                            <div class="tab-pane" id="sidebar-layout">
                                <div class="sidebar-layout">

                                    <!-- Start right navigation - menu -->
                                    <ul class="sidebar-menu niceScroll">

                                        <!--/ Start navigation - reset settings -->
                                        <li>
                                            <a id="reset-setting" href="javascript:void(0);" class="btn btn-inverse btn-block"><i class="fa fa-refresh fa-spin"></i> RESET SETTINGS</a>
                                        </li>
                                        <!--/ End navigation - reset settings -->

                                        <!-- Start category layout -->
                                        <li class="sidebar-category">
                                            <span>LAYOUT</span>
                                            <span class="pull-right"><i class="fa fa-toggle-on"></i></span>
                                        </li>
                                        <!--/ End category layout -->

                                        <!--/ Start navigation - layout -->
                                        <li>
                                            <ul class="list-unstyled layout-setting">
                                                <li>
                                                    <div class="rdio rdio-theme">
                                                        <input id="layout-fluid" type="radio" name="layout" value="">
                                                        <label for="layout-fluid">Fluid</label>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="rdio rdio-theme">
                                                        <input id="layout-boxed" type="radio" name="layout" value="page-boxed">
                                                        <label for="layout-boxed">Boxed</label>
                                                    </div>
                                                </li>
                                            </ul>
                                        </li>
                                        <!--/ End navigation - layout -->

                                        <!-- Start category header -->
                                        <li class="sidebar-category">
                                            <span>HEADER</span>
                                            <span class="pull-right"><i class="fa fa-toggle-on"></i></span>
                                        </li>
                                        <!--/ End category header -->

                                        <!--/ Start navigation - header -->
                                        <li>
                                            <ul class="list-unstyled header-layout-setting">
                                                <li>
                                                    <div class="rdio rdio-theme">
                                                        <input id="header-default" type="radio" name="header" value="">
                                                        <label for="header-default">Default</label>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="rdio rdio-theme">
                                                        <input id="header-fixed" type="radio" name="header" value="page-header-fixed">
                                                        <label for="header-fixed">Fixed</label>
                                                    </div>
                                                </li>
                                            </ul>
                                        </li>
                                        <!--/ End navigation - header -->

                                        <!-- Start category sidebar -->
                                        <li class="sidebar-category">
                                            <span>SIDEBAR</span>
                                            <span class="pull-right"><i class="fa fa-toggle-on"></i></span>
                                        </li>
                                        <!--/ End category sidebar -->

                                        <!--/ Start navigation - sidebar -->
                                        <li>
                                            <ul class="list-unstyled sidebar-layout-setting">
                                                <li>
                                                    <div class="rdio rdio-theme">
                                                        <input id="sidebar-default" type="radio" name="sidebar" value="">
                                                        <label for="sidebar-default">Default</label>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="rdio rdio-theme">
                                                        <input id="sidebar-fixed" type="radio" name="sidebar" value="page-sidebar-fixed">
                                                        <label for="sidebar-fixed">Fixed</label>
                                                    </div>
                                                </li>
                                            </ul>
                                        </li>
                                        <!--/ End navigation - sidebar -->

                                        <!-- Start category sidebar type -->
                                        <li class="sidebar-category">
                                            <span>SIDEBAR TYPE</span>
                                            <span class="pull-right"><i class="fa fa-toggle-on"></i></span>
                                        </li>
                                        <!--/ End category sidebar type -->

                                        <!--/ Start navigation - sidebar -->
                                        <li>
                                            <ul class="list-unstyled sidebar-type-setting">
                                                <li>
                                                    <div class="rdio rdio-theme">
                                                        <input id="sidebar-type-default" type="radio" name="sidebarType" value="">
                                                        <label for="sidebar-type-default">Default</label>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="rdio rdio-theme">
                                                        <input id="sidebar-type-box" type="radio" name="sidebarType" value="sidebar-box">
                                                        <label for="sidebar-type-box">Box</label>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="rdio rdio-theme">
                                                        <input id="sidebar-type-rounded" type="radio" name="sidebarType" value="sidebar-rounded">
                                                        <label for="sidebar-type-rounded">Rounded</label>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="rdio rdio-theme">
                                                        <input id="sidebar-type-circle" type="radio" name="sidebarType" value="sidebar-circle">
                                                        <label for="sidebar-type-circle">Circle</label>
                                                    </div>
                                                </li>
                                            </ul>
                                        </li>
                                        <!--/ End navigation - sidebar -->

                                        <!-- Start category footer -->
                                        <li class="sidebar-category">
                                            <span>FOOTER</span>
                                            <span class="pull-right"><i class="fa fa-toggle-on"></i></span>
                                        </li>
                                        <!--/ End category footer -->

                                        <!--/ Start navigation - footer -->
                                        <li>
                                            <ul class="list-unstyled footer-layout-setting">
                                                <li>
                                                    <div class="rdio rdio-theme">
                                                        <input id="footer-default" type="radio" name="footer" value="">
                                                        <label for="footer-default">Default</label>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="rdio rdio-theme">
                                                        <input id="footer-fixed" type="radio" name="footer" value="page-footer-fixed">
                                                        <label for="footer-fixed">Fixed</label>
                                                    </div>
                                                </li>
                                            </ul>
                                        </li>
                                        <!--/ End navigation - footer -->

                                    </ul>
                                    <!-- Start right navigation - menu -->
                                </div>
                            </div><!-- /#sidebar-layout -->
                            <div class="tab-pane in active" id="sidebar-setting">
                                <div class="sidebar-setting">
                                    <!-- Start right navigation - menu -->
                                    <ul class="sidebar-menu">

                                        <!-- Start category color schemes -->
                                        <li class="sidebar-category">
                                            <span>COLOR SCHEMES</span>
                                            <span class="pull-right"><i class="fa fa-tint"></i></span>
                                        </li>
                                        <!--/ End category color schemes -->

                                        <!-- Start navigation - themes -->
                                        <li>
                                            <div class="sidebar-themes color-schemes">

                                                <a class="theme" href="javascript:void(0);" style="background-color: #81b71a" data-toggle="tooltip" data-placement="right" data-original-title="Default"><span class="hide">default</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #00B1E1" data-toggle="tooltip" data-placement="top" data-original-title="Blue"><span class="hide">blue</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #37BC9B" data-toggle="tooltip" data-placement="top" data-original-title="Cyan"><span class="hide">cyan</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #8CC152" data-toggle="tooltip" data-placement="top" data-original-title="Green"><span class="hide">green</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #E9573F" data-toggle="tooltip" data-placement="top" data-original-title="Red"><span class="hide">red</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #F6BB42" data-toggle="tooltip" data-placement="top" data-original-title="Yellow"><span class="hide">yellow</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #906094" data-toggle="tooltip" data-placement="top" data-original-title="Purple"><span class="hide">purple</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #D39174" data-toggle="tooltip" data-placement="top" data-original-title="Brown"><span class="hide">brown</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #9FB478" data-toggle="tooltip" data-placement="left" data-original-title="Green Army"><span class="hide">green-army</span></a>

                                                <a class="theme" href="javascript:void(0);" style="background-color: #63D3E9" data-toggle="tooltip" data-placement="right" data-original-title="Blue Sea"><span class="hide">blue-sea</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #5577B4" data-toggle="tooltip" data-placement="top" data-original-title="Blue Gray"><span class="hide">blue-gray</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #AF86B9" data-toggle="tooltip" data-placement="top" data-original-title="Purple Gray"><span class="hide">purple-gray</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #CC6788" data-toggle="tooltip" data-placement="top" data-original-title="Purple Wine"><span class="hide">purple-wine</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #F06F6F" data-toggle="tooltip" data-placement="top" data-original-title="Alizarin Crimson"><span class="hide">alizarin-crimson</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #979797" data-toggle="tooltip" data-placement="top" data-original-title="Black And White"><span class="hide">black-and-white</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #8BC4B9" data-toggle="tooltip" data-placement="top" data-original-title="Amazon"><span class="hide">amazon</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #B0B069" data-toggle="tooltip" data-placement="top" data-original-title="Amber"><span class="hide">amber</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #A9C784" data-toggle="tooltip" data-placement="left" data-original-title="Android green"><span class="hide">android-green</span></a>

                                                <a class="theme" href="javascript:void(0);" style="background-color: #B3998A" data-toggle="tooltip" data-placement="right" data-original-title="Antique brass"><span class="hide">antique-brass</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #8D8D6E" data-toggle="tooltip" data-placement="top" data-original-title="Antique Bronze"><span class="hide">antique-bronze</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #B0B69D" data-toggle="tooltip" data-placement="top" data-original-title="Artichoke"><span class="hide">artichoke</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #F19B69" data-toggle="tooltip" data-placement="top" data-original-title="Atomic Tangerine"><span class="hide">atomic-tangerine</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #98777B" data-toggle="tooltip" data-placement="top" data-original-title="Bazaar"><span class="hide">bazaar</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #C3A961" data-toggle="tooltip" data-placement="top" data-original-title="Bistre Brown"><span class="hide">bistre-brown</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #D6725E" data-toggle="tooltip" data-placement="top" data-original-title="Bittersweet"><span class="hide">bittersweet</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #7789D1" data-toggle="tooltip" data-placement="top" data-original-title="Blueberry"><span class="hide">blueberry</span></a>
                                                <a class="theme" href="javascript:void(0);" style="background-color: #6FA362" data-toggle="tooltip" data-placement="left" data-original-title="Bud Green"><span class="hide">bud-green</span></a>

                                            </div>
                                        </li>
                                        <!--/ End navigation - themes -->

                                        <!-- Start category navbar color -->
                                        <li class="sidebar-category">
                                            <span>NAVBAR COLOR</span>
                                            <span class="pull-right"><i class="fa fa-tint"></i></span>
                                        </li>
                                        <!--/ End category navbar color -->

                                        <!-- Start navigation - navbar color -->
                                        <li>
                                            <div class="sidebar-themes navbar-color">

                                                <a class="theme bg-dark" href="javascript:void(0);" data-toggle="tooltip" data-placement="top" data-original-title="Dark"><span class="hide">dark</span></a>
                                                <a class="theme bg-light" href="javascript:void(0);" data-toggle="tooltip" data-placement="top" data-original-title="Light"><span class="hide">light</span></a>
                                                <a class="theme bg-primary" href="javascript:void(0);" data-toggle="tooltip" data-placement="top" data-original-title="Primary"><span class="hide">primary</span></a>
                                                <a class="theme bg-success" href="javascript:void(0);" data-toggle="tooltip" data-placement="top" data-original-title="Success"><span class="hide">success</span></a>
                                                <a class="theme bg-info" href="javascript:void(0);" data-toggle="tooltip" data-placement="top" data-original-title="Info"><span class="hide">info</span></a>
                                                <a class="theme bg-warning" href="javascript:void(0);" data-toggle="tooltip" data-placement="top" data-original-title="Warning"><span class="hide">warning</span></a>
                                                <a class="theme bg-danger" href="javascript:void(0);" data-toggle="tooltip" data-placement="top" data-original-title="Danger"><span class="hide">danger</span></a>

                                            </div><!-- /.navbar-color -->
                                        </li>
                                        <!--/ End navigation - navbar color -->

                                        <!-- Start category sidebar color -->
                                        <li class="sidebar-category">
                                            <span>SIDEBAR COLOR</span>
                                            <span class="pull-right"><i class="fa fa-tint"></i></span>
                                        </li>
                                        <!--/ End category sidebar color -->

                                        <!-- Start navigation - sidebar color -->
                                        <li>
                                            <div class="sidebar-themes sidebar-color">

                                                <a class="theme bg-dark" href="javascript:void(0);" data-toggle="tooltip" data-placement="top" data-original-title="Dark"><span class="hide">dark</span></a>
                                                <a class="theme bg-light" href="javascript:void(0);" data-toggle="tooltip" data-placement="top" data-original-title="Light"><span class="hide">light</span></a>
                                                <a class="theme bg-primary" href="javascript:void(0);" data-toggle="tooltip" data-placement="top" data-original-title="Primary"><span class="hide">primary</span></a>
                                                <a class="theme bg-success" href="javascript:void(0);" data-toggle="tooltip" data-placement="top" data-original-title="Success"><span class="hide">success</span></a>
                                                <a class="theme bg-info" href="javascript:void(0);" data-toggle="tooltip" data-placement="top" data-original-title="Info"><span class="hide">info</span></a>
                                                <a class="theme bg-warning" href="javascript:void(0);" data-toggle="tooltip" data-placement="top" data-original-title="Warning"><span class="hide">warning</span></a>
                                                <a class="theme bg-danger" href="javascript:void(0);" data-toggle="tooltip" data-placement="top" data-original-title="Danger"><span class="hide">danger</span></a>

                                            </div><!-- /.sidebar-color -->
                                        </li>
                                        <!--/ End navigation - sidebar color -->

                                        <!-- Start category task progress -->
                                        <li class="sidebar-category">
                                            <span>TASK PROGRESS</span>
                                            <span class="pull-right"><i class="fa fa-sliders"></i></span>
                                        </li>
                                        <!--/ End category task progress -->

                                        <!--/ Start navigation - task progress -->
                                        <li>
                                            <ul class="list-group sidebar-task">
                                                <li class="list-group-item">
                                                    <p class="details"> <span> Core System </span> <span class="pull-right"> 82% </span> </p>
                                                    <div class="progress progress-xs progress-striped active no-margin">
                                                        <div style="width: 82%" class="progress-bar progress-bar-success"> </div>
                                                    </div>
                                                </li>
                                                <li class="list-group-item">
                                                    <p class="details"> <span> Front-End </span> <span class="pull-right"> 67% </span> </p>
                                                    <div class="progress progress-xs progress-striped active no-margin">
                                                        <div style="width: 47%" class="progress-bar progress-bar-danger"> </div>
                                                    </div>
                                                </li>
                                                <li class="list-group-item">
                                                    <p class="details"> <span> Back-End </span> <span class="pull-right"> 45% </span> </p>
                                                    <div class="progress progress-xs progress-striped active no-margin">
                                                        <div style="width: 47%" class="progress-bar progress-bar-info"> </div>
                                                    </div>
                                                </li>
                                            </ul>
                                        </li>
                                        <!--/ End navigation - task progress -->

                                        <!-- Start category summary system -->
                                        <li class="sidebar-category">
                                            <span>SUMMARY SYSTEM</span>
                                            <span class="pull-right"><i class="fa fa-bar-chart-o"></i></span>
                                        </li>
                                        <!--/ End category summary system -->

                                        <!-- Start left navigation - summary -->
                                        <li>
                                            <ul class="sidebar-summary sparklines">
                                                <li>
                                                    <div class="list-info">
                                                        <span>Average Users</span>
                                                        <h4>1, 412, 101</h4>
                                                    </div>
                                                    <div class="chart"><span class="average">4,2,3,2,4,2,5,1,2,2,5,3</span></div>
                                                    <div class="clearfix"></div>
                                                </li>
                                                <li>
                                                    <div class="list-info">
                                                        <span>Daily Traffic</span>
                                                        <h4>781, 601</h4>
                                                    </div>
                                                    <div class="chart"><span class="traffic">1,2,3,2,4,1,5,3,2,4,2,3</span></div>
                                                    <div class="clearfix"></div>
                                                </li>
                                                <li>
                                                    <div class="list-info">
                                                        <span>Disk Usage</span>
                                                        <h4>52.2%</h4>
                                                    </div>
                                                    <div class="chart"><span class="disk">5,5,3,2,1,3,4,3,2,4,1,3</span></div>
                                                    <div class="clearfix"></div>
                                                </li>
                                                <li>
                                                    <div class="list-info">
                                                        <span>CPU Usage</span>
                                                        <h4>67.8%</h4>
                                                    </div>
                                                    <div class="chart"><span class="cpu">1,5,3,2,4,5,5,3,2,4,5,3</span></div>
                                                    <div class="clearfix"></div>
                                                </li>
                                            </ul>
                                        </li>
                                        <!--/ End left navigation - summary -->

                                    </ul>
                                    <!-- Start right navigation - menu -->
                                </div>
                            </div><!-- /#sidebar-setting -->
                            <div class="tab-pane" id="sidebar-chat">
                                <div class="sidebar-chat">

                                    <form class="form-horizontal">
                                        <div class="form-group has-feedback">
                                            <input class="form-control" type="text" placeholder="Search messages...">
                                            <span class="glyphicon glyphicon-search form-control-feedback"></span>
                                        </div>
                                    </form>

                                    <!-- Start right navigation - menu -->
                                    <ul class="sidebar-menu niceScroll">

                                        <!-- Start category family chat -->
                                        <li class="sidebar-category">
                                            <span>FAMILY</span>
                                            <span class="pull-right"><i class="fa fa-home"></i></span>
                                        </li>
                                        <!--/ End category family chat -->

                                        <li>
                                            <!-- Start chat - contact list -->
                                            <div class="media-list">
                                                <a href="#" class="media">
                                                    <span class="media-object pull-left has-notif">
                                                        <img src="${base}/img/avatar/35/10.png" class="img-circle" alt="Daddy Botak">
                                                        <i class="online"></i>
                                                    </span>
                                                    <span class="media-body">
                                                        <span class="media-heading">Daddy Botak</span>
                                                        <span class="media-meta status">online</span>
                                                        <span class="media-meta device"><i class="fa fa-globe"></i></span>
                                                    </span>
                                                </a><!-- /.media -->
                                                <a href="#" class="media">
                                                    <span class="media-object pull-left has-notif">
                                                        <img src="${base}/img/avatar/35/11.png" class="img-circle" alt="Sarah Tingting">
                                                        <i class="offline"></i>
                                                    </span>
                                                    <span class="media-body">
                                                        <span class="media-heading">Sarah Tingting</span>
                                                        <span class="media-meta status">offline</span>
                                                        <span class="media-meta device"><i class="fa fa-globe"></i></span>
                                                        <span class="media-meta time">7 m</span>
                                                    </span>
                                                </a><!-- /.media -->
                                                <a href="#" class="media">
                                                    <span class="media-object pull-left has-notif">
                                                        <img src="${base}/img/avatar/35/26.png" class="img-circle" alt="...">
                                                        <i class="busy"></i>
                                                    </span>
                                                    <span class="media-body">
                                                        <span class="media-heading">Nicolas Olivier</span>
                                                        <span class="media-meta status">busy</span>
                                                        <span class="media-meta device"><i class="fa fa-mobile"></i></span>
                                                    </span>
                                                </a><!-- /.media -->
                                                <a href="#" class="media">
                                                    <span class="media-object pull-left has-notif">
                                                        <img src="${base}/img/avatar/35/12.png" class="img-circle" alt="Harry Potret">
                                                        <i class="online"></i>
                                                    </span>
                                                    <span class="media-body">
                                                        <span class="media-heading">Harry Potret</span>
                                                        <span class="media-meta status">online</span>
                                                        <span class="media-meta device"><i class="fa fa-mobile"></i></span>
                                                    </span>
                                                </a><!-- /.media -->
                                                <a href="#" class="media">
                                                    <span class="media-object pull-left has-notif">
                                                        <img src="${base}/img/avatar/35/26.png" class="img-circle" alt="...">
                                                        <i class="busy"></i>
                                                    </span>
                                                    <span class="media-body">
                                                        <span class="media-heading">Catherine Parker</span>
                                                        <span class="media-meta status">busy</span>
                                                        <span class="media-meta device"><i class="fa fa-mobile"></i></span>
                                                    </span>
                                                </a><!-- /.media -->
                                            </div><!-- /.media-list -->
                                            <!--/ End chat - contact list -->
                                        </li>

                                        <!-- Start category friends chat -->
                                        <li class="sidebar-category">
                                            <span>FRIENDS</span>
                                            <span class="pull-right"><i class="fa fa-group"></i></span>
                                        </li>
                                        <!--/ End category friends chat -->

                                        <li>
                                            <!-- Start chat - contact list -->
                                            <div class="media-list">
                                                <a href="#" class="media">
                                                    <span class="media-object pull-left has-notif">
                                                        <img src="${base}/img/avatar/35/15.png" class="img-circle" alt="Jeck Joko">
                                                        <i class="online"></i>
                                                    </span>
                                                    <span class="media-body">
                                                        <span class="media-heading">Jeck Joko</span>
                                                        <span class="media-meta status">online</span>
                                                        <span class="media-meta device"><i class="fa fa-globe"></i></span>
                                                    </span>
                                                </a><!-- /.media -->
                                                <a href="#" class="media">
                                                    <span class="media-object pull-left has-notif">
                                                        <img src="${base}/img/avatar/35/16.png" class="img-circle" alt="Tenny Imoet">
                                                        <i class="busy"></i>
                                                    </span>
                                                    <span class="media-body">
                                                        <span class="media-heading">Tenny Imoet</span>
                                                        <span class="media-meta status">busy</span>
                                                        <span class="media-meta device"><i class="fa fa-mobile"></i></span>
                                                    </span>
                                                </a><!-- /.media -->
                                                <a href="#" class="media">
                                                    <span class="media-object pull-left has-notif">
                                                        <img src="${base}/img/avatar/35/17.png" class="img-circle" alt="Leli Madang">
                                                        <i class="offline"></i>
                                                    </span>
                                                    <span class="media-body">
                                                        <span class="media-heading">Leli Madang</span>
                                                        <span class="media-meta status">offline</span>
                                                        <span class="media-meta device"><i class="fa fa-mobile"></i></span>
                                                        <span class="media-meta time">2 m</span>
                                                    </span>
                                                </a><!-- /.media -->
                                                <a href="#" class="media">
                                                    <span class="media-object pull-left has-notif">
                                                        <img src="${base}/img/avatar/35/18.png" class="img-circle" alt="Rebecca Cabean">
                                                        <i class="offline"></i>
                                                    </span>
                                                    <span class="media-body">
                                                        <span class="media-heading">Rebecca Cabean</span>
                                                        <span class="media-meta status">offline</span>
                                                        <span class="media-meta device"><i class="fa fa-mobile"></i></span>
                                                        <span class="media-meta time">8 m</span>
                                                    </span>
                                                </a><!-- /.media -->
                                                <a href="#" class="media">
                                                    <span class="media-object pull-left has-notif">
                                                        <img src="${base}/img/avatar/35/26.png" class="img-circle" alt="...">
                                                        <i class="busy"></i>
                                                    </span>
                                                    <span class="media-body">
                                                        <span class="media-heading">ondoel return</span>
                                                        <span class="media-meta status">busy</span>
                                                        <span class="media-meta device"><i class="fa fa-mobile"></i></span>
                                                    </span>
                                                </a><!-- /.media -->
                                            </div><!-- /.media-list -->
                                            <!--/ End chat - contact list -->
                                        </li>

                                        <!-- Start category other chat -->
                                        <li class="sidebar-category">
                                            <span>OTHERS</span>
                                            <span class="pull-right"><i class="fa fa-share"></i></span>
                                        </li>
                                        <!--/ End category other chat -->

                                        <li>
                                            <!-- Start chat - contact list -->
                                            <div class="media-list">
                                                <a href="#" class="media">
                                                    <span class="media-object pull-left has-notif">
                                                        <img src="${base}/img/avatar/35/19.png" class="img-circle" alt="Sishy Mawar">
                                                        <i class="offline"></i>
                                                    </span>
                                                    <span class="media-body">
                                                        <span class="media-heading">Sishy Mawar</span>
                                                        <span class="media-meta status">offline</span>
                                                        <span class="media-meta device"><i class="fa fa-mobile"></i></span>
                                                        <span class="media-meta time">23 m</span>
                                                    </span>
                                                </a><!-- /.media -->
                                                <a href="#" class="media">
                                                    <span class="media-object pull-left has-notif">
                                                        <img src="${base}/img/avatar/35/20.png" class="img-circle" alt="Mbah Roso">
                                                        <i class="away"></i>
                                                    </span>
                                                    <span class="media-body">
                                                        <span class="media-heading">Mbah Roso</span>
                                                        <span class="media-meta status">away</span>
                                                        <span class="media-meta device"><i class="fa fa-mobile"></i></span>
                                                        <span class="media-meta time">2 h</span>
                                                    </span>
                                                </a><!-- /.media -->
                                                <a href="#" class="media">
                                                    <span class="media-object pull-left has-notif">
                                                        <img src="${base}/img/avatar/35/26.png" class="img-circle" alt="...">
                                                        <i class="busy"></i>
                                                    </span>
                                                    <span class="media-body">
                                                        <span class="media-heading">Alma Butoi</span>
                                                        <span class="media-meta status">busy</span>
                                                        <span class="media-meta device"><i class="fa fa-mobile"></i></span>
                                                    </span>
                                                </a><!-- /.media -->
                                            </div><!-- /.media-list -->
                                            <!--/ End chat - contact list -->
                                        </li>

                                    </ul><!-- /.sidebar-menu -->
                                    <!-- Start right navigation - menu -->

                                </div><!-- /.sidebar-setting -->
                            </div><!-- /#sidebar-chat -->
                        </div>
                    </div>
                </div>

            </aside><!-- /#sidebar-right -->
            <!--/ END SIDEBAR RIGHT -->

        </section><!-- /#wrapper -->
        <!--/ END WRAPPER -->

        <!-- START @BACK TOP -->
        <div id="back-top" class="animated pulse circle">
            <i class="fa fa-angle-up"></i>
        </div><!-- /#back-top -->
        <!--/ END BACK TOP -->

        <!-- START @ADDITIONAL ELEMENT -->
        <div class="modal modal-success fade" id="modal-bootstrap-tour" tabindex="-1" role="dialog">
            <div class="modal-dialog" role="document" style="margin: 150px auto;">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">Welcome to Blankon</h4>
                    </div>
                    <div class="modal-body">
                        <div class="media">
                            <div class="media-left" style="padding-right: 15px;">
                                <a href="#">
                                    <img data-no-retina class="media-object" src="${base}/img/media/mascot/1.jpg" alt="..." style="width: 100px;">
                                </a>
                            </div>
                            <div class="media-body">
                                <h4 class="media-heading">Hello, my name is Mr.Blankon</h4>
                                <b>Introduction</b> - Blankon fullpack admin theme is a theme full pack admin template powered by Twitter bootstrap 3 front-end framework. Included are multiple example pages, elements styles, and javascript widgets to get your project started.
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" onclick="BlankonDashboard.callModal2()" data-dismiss="modal">Let's tour <i class="fa fa-arrow-circle-right"></i></button>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal modal-success fade" id="modal-bootstrap-tour-new-features" tabindex="-1" role="dialog">
            <div class="modal-dialog modal-lg" role="document" style="margin: 50px auto;">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">New Features</h4>
                    </div>
                    <div class="modal-body" style="height: 400px; overflow: scroll;">
                        <img src="${base}/img/admin-special/investor/new-feature.jpg" alt="..." class="img-responsive" style="width: 500px; margin: 0 auto 25px;"/>
                        <div class="table-responsive">
                            <table class="table table-bordered table-striped table-condensed mb-20">
                                <thead>
                                <tr>
                                    <th>Page</th>
                                    <th>Description</th>
                                    <th style="width: 90px" class="text-center">Live preview</th>
                                </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td style="min-width: 150px">
                                            Blankon Investor
                                        </td>
                                        <td>
                                            It is a design speciality for Investor dashboard designs, there are many features for support all system investment monitor resources. Such as Dashboard design with overview count investments, comparison invest graph and amazing others design do you need!
                                        </td>
                                        <td class="text-center">
                                            <a href="${base}/live-preview/admin-special/investor/index.html" class="btn btn-block btn-primary">View</a>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" onclick="BlankonDashboard.handleTour()" data-dismiss="modal">Next</button>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal modal-danger fade" id="modal-bootstrap-tour-end" tabindex="-1" role="dialog">
            <div class="modal-dialog" role="document" style="margin: 150px auto;">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">End Blankon Tour</h4>
                    </div>
                    <div class="modal-body">
                        <div class="media">
                            <div class="media-left">
                                <a href="#">
                                    <img data-no-retina class="media-object" src="${base}/img/media/mascot/1.jpg" alt="..." style="width: 100px;">
                                </a>
                            </div>
                            <div class="media-body">
                                <h4 class="media-heading">Thanks for watching!</h4>
                                <p>Thank you for view our blankon tour. If you already purchased Blankon and then you have any questions that are beyond the scope of this help file. You can visit us on below :</p>
                                <ul class="list-inline">
                                    <li>
                                        <a href="https://wrapbootstrap.com/user/djavaui" class="btn btn-inverse tooltips" data-toggle="tooltip" data-placement="top" data-title="Wrapbootstrap">W</a>
                                    </li>
                                    <li>
                                        <a href="http://djavaui.com" class="btn btn-lilac tooltips" data-toggle="tooltip" data-placement="top" data-title="Our Website"><i class="fa fa-globe"></i></a>
                                    </li>
                                    <li>
                                        <a href="https://www.facebook.com/djavaui/" class="btn btn-facebook tooltips" data-toggle="tooltip" data-placement="top" data-title="Facebook"><i class="fa fa-facebook"></i></a>
                                    </li>
                                    <li>
                                        <a href="https://twitter.com/djavaui" class="btn btn-twitter tooltips" data-toggle="tooltip" data-placement="top" data-title="Twitter"><i class="fa fa-twitter"></i></a>
                                    </li>
                                    <li>
                                        <a href="https://plus.google.com/102744122511959250698" class="btn btn-googleplus tooltips" data-toggle="tooltip" data-placement="top" data-title="Google+"><i class="fa fa-google-plus"></i></a>
                                    </li>
                                    <li>
                                        <a href="https://github.com/djavaui" class="btn btn-default tooltips" data-toggle="tooltip" data-placement="top" data-title="Github"><i class="fa fa-github"></i></a>
                                    </li>
                                    <li>
                                        <a href="https://www.youtube.com/channel/UCt_dudJF4_0bOkQkwYN2qQQ" class="btn btn-youtube tooltips" data-toggle="tooltip" data-placement="top" data-title="Youtube"><i class="fa fa-youtube"></i></a>
                                    </li>
                                </ul>
                                <b>Thanks so much!</b>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" onclick="BlankonDashboard.handleTour()" data-dismiss="modal">Let's tour again <i class="fa fa-arrow-circle-right"></i></button>
                    </div>
                </div>
            </div>
        </div>
        <!--/ END ADDITIONAL ELEMENT -->

        <!-- START JAVASCRIPT SECTION (Load javascripts at bottom to reduce load time) -->
        <!-- START @CORE PLUGINS -->
        <script src="${base}/assets/global/plugins/bower_components/jquery/dist/jquery.min.js"></script>
        <script src="${base}/assets/global/plugins/bower_components/jquery-cookie/jquery.cookie.js"></script>
        <script src="${base}/assets/global/plugins/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
        <script src="${base}/assets/global/plugins/bower_components/typehead.js/dist/handlebars.js"></script>
        <script src="${base}/assets/global/plugins/bower_components/typehead.js/dist/typeahead.bundle.min.js"></script>
        <script src="${base}/assets/global/plugins/bower_components/jquery-nicescroll/jquery.nicescroll.min.js"></script>
        <script src="${base}/assets/global/plugins/bower_components/jquery.sparkline.min/index.js"></script>
        <script src="${base}/assets/global/plugins/bower_components/jquery-easing-original/jquery.easing.1.3.min.js"></script>
        <script src="${base}/assets/global/plugins/bower_components/ionsound/js/ion.sound.min.js"></script>
        <script src="${base}/assets/global/plugins/bower_components/bootbox/bootbox.js"></script>
        <!--/ END CORE PLUGINS -->

        <!-- START @PAGE LEVEL PLUGINS -->
		<script src="${base}/assets/commercial/plugins/cube-portfolio/cubeportfolio/js/jquery.cubeportfolio.min.js"></script>
        <!--/ END PAGE LEVEL PLUGINS -->

        <!-- START @PAGE LEVEL SCRIPTS -->
        <script src="${base}/assets/admin/js/us.apps.js"></script>
		<script src="${base}/assets/admin/js/pages/us.dashboard.js"></script>
        <!--/ END PAGE LEVEL SCRIPTS -->
        <!--/ END JAVASCRIPT SECTION -->

        

    </body>
    <!--/ END BODY -->

</html>
