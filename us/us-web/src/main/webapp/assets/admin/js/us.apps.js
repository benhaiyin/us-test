/* ==========================================================================
 * Template: Blankon Fullpack Admin Theme
 * ---------------------------------------------------------------------------
 * Author: Djava UI
 * Website: http://djavaui.com
 * Email: support@djavaui.com
 * ========================================================================== */

var BlankonApp = function(){

	// =========================================================================
    // SETTINGS APP
    // =========================================================================
    var adminCssPath = ""; //BlankonApp.handleBaseURL()+'/assets/admin/css';

    return {

        // =========================================================================
        // CONSTRUCTOR APP
        // =========================================================================
        init: function () {
            BlankonApp.handleBaseURL();

			adminCssPath = BlankonApp.handleBaseURL()+'/assets/admin/css';

            BlankonApp.handleIE();
            BlankonApp.handleCheckCookie();
            BlankonApp.handleSound();
            BlankonApp.handleBackToTop();
            BlankonApp.handleSidebarNavigation();
            BlankonApp.handleSidebarScroll();
            BlankonApp.handleSidebarResponsive();
            BlankonApp.handleNavbarScroll();
            BlankonApp.handlePanelScroll();
            BlankonApp.handleTypehead();
            BlankonApp.handleFullscreen();
            BlankonApp.handleSelect2();
            BlankonApp.handleTooltip();
            BlankonApp.handlePopover();
            BlankonApp.handlePanelToolAction();
            BlankonApp.handleSparkline();
            BlankonApp.handleClearCookie();
            BlankonApp.handleBoxModal();
            BlankonApp.handleCopyrightYear();

			BlankonApp.handleChooseThemes();
            BlankonApp.handleNavbarColor();
            BlankonApp.handleSidebarColor();
            BlankonApp.handleLayoutSetting();

			BlankonApp.wsAppInit();
        },

        // =========================================================================
        // SET UP BASE URL
        // =========================================================================
        handleBaseURL: function () {
            var getUrl = window.location,
                baseUrl = getUrl .protocol + "//" + getUrl.host + "/" + getUrl.pathname.split('/')[1];

			//debug add by yangsl start
			//在本地调试静态页面时，需要特别指定
			//baseUrl += "/Working/xiaoniu/weiservice/doc/HtmlTemplates";
			//debug add by yangsl end

            return baseUrl;
        },

		// =========================================================================
        // 应用的初始化
        // =========================================================================
        wsAppInit: function () {
			
			//选择控件的初始化
			if($('.chosen-select').length){
                $('.chosen-select').chosen();
            }

			//日期控件的本地化
			if( $('.wsDateControl').length > 0 ){
				$('.wsDateControl').daterangepicker({
					"singleDatePicker": true,
					"timePickerSeconds": true,
					"autoApply": true,
					"dateLimit": {
						"days": 7
					},
					"locale": {
						"format": "YYYY-MM-DD",
						"separator": " - ",
						"applyLabel": "应用",
						"cancelLabel": "取消",
						"fromLabel": "从",
						"toLabel": "到",
						"customRangeLabel": "自定义",
						"daysOfWeek": [
							"周日",
							"周一",
							"周二",
							"周三",
							"周四",
							"周五",
							"周六"
						],
						"monthNames": [
							"一月",
							"二月",
							"三月",
							"四月",
							"五月",
							"六月",
							"七月",
							"八月",
							"九月",
							"十月",
							"十一月",
							"十二月"
						],
						"firstDay": 1
					},
					"opens": "center"
				}, function(start, end, label) {
				  console.log("New date range selected: ' + start.format('YYYY-MM-DD') + ' to ' + end.format('YYYY-MM-DD') + ' (predefined range: ' + label + ')");
				});
			}
        },

        // =========================================================================
        // IE SUPPORT
        // =========================================================================
        handleIE: function () {
            // IE mode
            var isIE8 = false;
            var isIE9 = false;
            var isIE10 = false;

            // initializes main settings for IE
            isIE8 = !! navigator.userAgent.match(/MSIE 8.0/);
            isIE9 = !! navigator.userAgent.match(/MSIE 9.0/);
            isIE10 = !! navigator.userAgent.match(/MSIE 10.0/);

            if (isIE10) {
                $('html').addClass('ie10'); // detect IE10 version
            }

            if (isIE10 || isIE9 || isIE8) {
                $('html').addClass('ie'); // detect IE8, IE9, IE10 version
            }

            // Fix input placeholder issue for IE8 and IE9
            if (isIE8 || isIE9) { // ie8 & ie9
                // this is html5 placeholder fix for inputs, inputs with placeholder-no-fix class will be skipped(e.g: we need this for password fields)
                $('input[placeholder]:not(.placeholder-no-fix), textarea[placeholder]:not(.placeholder-no-fix)').each(function () {
                    var input = $(this);

                    if (input.val() == '' && input.attr("placeholder") != '') {
                        input.addClass("placeholder").val(input.attr('placeholder'));
                    }

                    input.focus(function () {
                        if (input.val() == input.attr('placeholder')) {
                            input.val('');
                        }
                    });

                    input.blur(function () {
                        if (input.val() == '' || input.val() == input.attr('placeholder')) {
                            input.val(input.attr('placeholder'));
                        }
                    });
                });
            }
        },

        // =========================================================================
        // CHECK COOKIE
        // =========================================================================
        handleCheckCookie: function () {
            // Check (onLoad) if the cookie is there and set the class if it is
            // Set cookie sidebar minimize page
            if ($.cookie('page_sidebar_minimize') == 'active') {
                $('body').addClass('page-sidebar-minimize');
            }
        },

        // =========================================================================
        // SOUNDS
        // =========================================================================
        handleSound: function () {
            if($('.page-sound').length){
                ion.sound({
                    sounds: [
                        {name: "beer_can_opening"},
                        {name: "bell_ring", volume: 0.6},
                        {name: "branch_break", volume: 0.3},
                        {name: "button_click"},
                        {name: "button_click_on"},
                        {name: "button_push"},
                        {name: "button_tiny", volume: 0.6},
                        {name: "camera_flashing"},
                        {name: "camera_flashing_2", volume: 0.6},
                        {name: "cd_tray", volume: 0.6},
                        {name: "computer_error"},
                        {name: "door_bell"},
                        {name: "door_bump", volume: 0.3},
                        {name: "glass"},
                        {name: "keyboard_desk"},
                        {name: "light_bulb_breaking", volume: 0.6},
                        {name: "metal_plate"},
                        {name: "metal_plate_2"},
                        {name: "pop_cork"},
                        {name: "snap"},
                        {name: "staple_gun"},
                        {name: "tap", volume: 0.6},
                        {name: "water_droplet"},
                        {name: "water_droplet_2"},
                        {name: "water_droplet_3", volume: 0.6}
                    ],
                    path: BlankonApp.handleBaseURL()+'/assets/global/plugins/bower_components/ionsound/sounds/',
                    preload: true
                });

                // Add effect sound water droplet type 3
                $('.dropdown-toggle').on('click', function(){
                    ion.sound.play("water_droplet_3");
                });

            }

            // Input sounds
            if($('.page-sound').length){
                $('input, textarea').on('input', function(){
                    ion.sound.play("tap");
                });
                $('input[type=file]').on('click', function(){
                    ion.sound.play("metal_plate_2");
                });
                $('input[type=checkbox], input[type=radio]').on('click', function(){
                    ion.sound.play("button_tiny");
                });
                $('select').on('change', function(){
                    ion.sound.play("snap");
                });
            }
        },

        // =========================================================================
        // BACK TOP
        // =========================================================================
        handleBackToTop: function () {
            $('#back-top').hide();
            $(window).scroll(function () {
                if ($(this).scrollTop() > 100) {
                    $('#back-top').addClass('show animated pulse');
                } else {
                    $('#back-top').removeClass('show animated pulse');
                }
            });
            // scroll body to 0px on click
            $('#back-top').click(function () {
                // Add sound
                ion.sound.play("cd_tray");
                $('body,html').animate({
                    scrollTop: 0
                }, 800);
                return false;
            });
        },

        // =========================================================================
        // SIDEBAR NAVIGATION
        // =========================================================================
        handleSidebarNavigation: function () {
            // Create trigger click for open menu sidebar
            $('.submenu > a').click(function() {
                var parentElement = $(this).parent('.submenu'),
                    nextElement = $(this).nextAll(),
                    arrowIcon = $(this).find('.arrow'),
                    plusIcon = $(this).find('.plus');

                // Add effect sound button click
                if($('.page-sound').length){
                    ion.sound.play("button_click_on");
                }

                if(parentElement.parent('ul').find('ul:visible')){
                    parentElement.parent('ul').find('ul:visible').slideUp('fast');
                    parentElement.parent('ul').find('.open').removeClass('open');
                }

                if(nextElement.is('ul:visible')) {
                    arrowIcon.removeClass('open');
                    plusIcon.removeClass('open');
                    nextElement.slideUp('fast');
                    arrowIcon.removeClass('fa-angle-double-down').addClass('fa-angle-double-right');
                }

                if(!nextElement.is('ul:visible')) {
                    arrowIcon.addClass('open');
                    plusIcon.addClass('open');
                    nextElement.slideDown('fast');
                    arrowIcon.removeClass('fa-angle-double-right').addClass('fa-angle-double-down');
                }

            });
        },

        // =========================================================================
        // SIDEBAR LEFT NICESCROLL
        // =========================================================================
        handleSidebarScroll: function () {
            // Optimalisation: Store the references outside the event handler:
            function checkHeightSidebar() {
                // Check if there is class page-sidebar-fixed
                if($('.page-sidebar-fixed').length){
                    // Setting dinamic height sidebar menu
                    var heightSidebarLeft       = $(window).outerHeight() - $('#header').outerHeight() - $('.sidebar-footer').outerHeight() - $('.sidebar-content').outerHeight();

                    $('#sidebar-left .sidebar-menu').height(heightSidebarLeft)
                        .niceScroll({
                            cursorwidth: '10px',
                            cursorborder: '0px',
                            railalign: 'left'
                        });
                }

                var heightSidebarRight      = $(window).outerHeight() - $('#sidebar-right .panel-heading').outerHeight(),
                    heightSidebarRightChat  = $(window).outerHeight() - $('#sidebar-right .panel-heading').outerHeight() - $('#sidebar-chat .form-horizontal').outerHeight();

                // Sidebar right profile
                $('#sidebar-profile .sidebar-menu').height(heightSidebarRight)
                    .niceScroll({
                        cursorwidth: '10px',
                        cursorborder: '0px'
                    });

                // Sidebar right layout
                $('#sidebar-layout .sidebar-menu').height(heightSidebarRight)
                    .niceScroll({
                        cursorwidth: '10px',
                        cursorborder: '0px'
                    });

                // Sidebar right setting
                $('#sidebar-setting .sidebar-menu').height(heightSidebarRight)
                    .niceScroll({
                        cursorwidth: '10px',
                        cursorborder: '0px'
                    });

                // Sidebar right chat
                $('#sidebar-chat .sidebar-menu').height(heightSidebarRightChat)
                    .niceScroll({
                        cursorwidth: '10px',
                        cursorborder: '0px'
                    });

            }
            // Execute on load
            checkHeightSidebar();
            // Bind event listener
            $(window).resize(checkHeightSidebar);
        },

        // =========================================================================
        // SIDEBAR RESPONSIVE
        // =========================================================================
        handleSidebarResponsive: function () {
            // Optimalisation: Store the references outside the event handler:
            var $window = $(window);
            function checkWidth() {
                var windowsize = $window.width();
                // Check if view screen on greater then 720px and smaller then 1024px
                if (windowsize > 768 && windowsize <= 1024) {
                    $('body').addClass('page-sidebar-minimize-auto');
                }
                else if (windowsize <= 768) {
                    $('body').removeClass('page-sidebar-minimize');
                    $('body').removeClass('page-sidebar-minimize-auto');
                }
                else{
                    $('body').removeClass('page-sidebar-minimize-auto');
                }
            }
            // Execute on load
            checkWidth();
            // Bind event listener
            $(window).resize(checkWidth);

            // When the minimize trigger is clicked
            $('.navbar-minimize a').on('click',function(){

                // Add effect sound button click
                if($('.page-sound').length){
                    ion.sound.play("button_click");
                }

                // Check class sidebar right show
                if($('.page-sidebar-right-show').length){
                    $('body').removeClass('page-sidebar-right-show');
                }

                // Check class sidebar minimize auto
                if($('.page-sidebar-minimize-auto').length){
                    $('body').removeClass('page-sidebar-minimize-auto');
                }else{
                    // Toggle the class to the body
                    $('body').toggleClass('page-sidebar-minimize');
                }

                // Check the current cookie value
                // If the cookie is empty or set to not active, then add page_sidebar_minimize
                if ($.cookie('page_sidebar_minimize') == "undefined" || $.cookie('page_sidebar_minimize') == "not_active") {

                    // Set cookie value to active
                    $.cookie('page_sidebar_minimize','active', {expires: 1});
                }

                // If the cookie was already set to active then remove it
                else {

                    // Remove cookie with name page_sidebar_minimize
                    $.removeCookie('page_sidebar_minimize');

                    // Create cookie with value to not_active
                    $.cookie('page_sidebar_minimize','not_active',  {expires: 1});

                }

            });

            $('.navbar-setting a').on('click',function(){
                // Add effect sound button click
                if($('.page-sound').length){
                    ion.sound.play("button_click");
                }
                if($('.page-sidebar-minimize.page-sidebar-right-show').length){
                    $('body').toggleClass('page-sidebar-minimize page-sidebar-right-show');
                }
                else if($('.page-sidebar-minimize').length){
                    $('body').toggleClass('page-sidebar-right-show');
                }else{
                    $('body').toggleClass('page-sidebar-minimize page-sidebar-right-show');
                }
            });

            // This action available on mobile view
            $('.navbar-minimize-mobile.left').on('click',function(){
                // Add effect sound button click
                if($('.page-sound').length){
                    ion.sound.play("button_click");
                }
                if($('body.page-sidebar-right-show').length){
                    $('body').removeClass('page-sidebar-right-show');
                    $('body').removeClass('page-sidebar-minimize');
                }
                $('body').toggleClass('page-sidebar-left-show');
            });
            $('.navbar-minimize-mobile.right').on('click',function(){
                // Add effect sound button click
                if($('.page-sound').length){
                    ion.sound.play("button_click");
                }
                if($('body.page-sidebar-left-show').length){
                    $('body').removeClass('page-sidebar-left-show');
                    $('body').removeClass('page-sidebar-minimize');
                }
                $('body').toggleClass('page-sidebar-right-show');
            });
        },

        // =========================================================================
        // MESSAGES NICESCROLL
        // =========================================================================
        handleNavbarScroll: function () {
            if($('.navbar-message .niceScroll').length){
                $('.navbar-message .niceScroll').niceScroll({
                    cursorwidth: '10px',
                    cursorborder: '0px'
                });
            }

            // =========================================================================
            // NOTIFICATION NICESCROLL
            // =========================================================================
            if($('.navbar-notification .niceScroll').length){
                $('.navbar-notification .niceScroll').niceScroll({
                    cursorwidth: '10px',
                    cursorborder: '0px'
                });
            }
        },

        // =========================================================================
        // PANEL NICESCROLL
        // =========================================================================
        handlePanelScroll: function () {
            if($('.panel-scrollable').length){
                $('.panel-scrollable .panel-body').niceScroll({
                    cursorwidth: '10px',
                    cursorborder: '0px'
                });
            }
        },

        // =========================================================================
        // TYPEAHEAD
        // =========================================================================
        handleTypehead: function () {
            if($('.typeahead').length){
                var repos;

                repos = new Bloodhound({
                    datumTokenizer: function(d) { return d.tokens; },
                    queryTokenizer: Bloodhound.tokenizers.whitespace,
                    prefetch: BlankonApp.handleBaseURL()+'/assets/global/plugins/bower_components/typehead.js/dist/typeahead-sample.json'
                });

                repos.initialize();

                $('.typeahead').typeahead(null, {
                    name: 'typeahead-sample',
                    source: repos.ttAdapter(),
                    templates: {
                        empty: [
                            '<div class="empty-message">',
                            'unable to find your type that match the current query',
                            '</div>'
                        ].join('\n'),
                        suggestion: Handlebars.compile([
                            '<a href="javascript:void(0);" class="media border-dotted animated fadeIn">',
                            '<span class="media-left">' +
                            '<span class="media-object">',
                            '<i class="fa fa-{{icon}} bg-{{color}}"></i>',
                            '</span>',
                            '</span>',
                            '<span class="media-body">',
                            '<span class="media-heading">{{name}}</span>',
                            '<span class="media-text">{{description}}</span>',
                            '</span>',
                            '</a>'
                        ].join(''))
                    }
                });
            }
        },

        // =========================================================================
        // FULLSCREEN TRIGGER
        // =========================================================================
        handleFullscreen: function () {
            var state;
            $('#fullscreen').on('click', function() {
                state = !state;
                if (state) {
                    // Trigger for fullscreen
                    // Add effect sound bell ring
                    if($('.page-sound').length){
                        ion.sound.play("bell_ring");
                    }
                    $(this).toggleClass('fg-theme');
                    $(this).attr('data-original-title','Exit Fullscreen');
                    var docElement, request;
                    docElement = document.documentElement;
                    request = docElement.requestFullScreen || docElement.webkitRequestFullScreen || docElement.mozRequestFullScreen || docElement.msRequestFullScreen;
                    if(typeof request!="undefined" && request){
                        request.call(docElement);
                    }
                } else {
                    // Trigger for exit fullscreen
                    // Add effect sound bell ring
                    if($('.page-sound').length){
                        ion.sound.play("bell_ring");
                    }
                    $(this).removeClass('fg-theme');
                    $(this).attr('data-original-title','Fullscreen')
                    var docElement, request;
                    docElement = document;
                    request = docElement.cancelFullScreen|| docElement.webkitCancelFullScreen || docElement.mozCancelFullScreen || docElement.msCancelFullScreen || docElement.exitFullscreen;
                    if(typeof request!="undefined" && request){
                        request.call(docElement);
                    }
                }
            });
        },

        // =========================================================================
        // SELECT2
        // =========================================================================
        handleSelect2: function () {
            if($('.select2').length){
                $('.select2').select2();
            }
        },

        // =========================================================================
        // TOOLTIP
        // =========================================================================
        handleTooltip: function () {
            if($('[data-toggle=tooltip]').length){
                $('[data-toggle=tooltip]').tooltip({
                    animation: 'fade'
                });
            }
            if($('.tooltips').length){
                $('.tooltips').tooltip({
                    animation: 'fade'
                });
            }
        },

        // =========================================================================
        // POPOVER
        // =========================================================================
        handlePopover: function () {
            if($('[data-toggle=popover]').length){
                $('[data-toggle=popover]').popover();
            }
        },

        // =========================================================================
        // PANEL TOOL ACTION
        // =========================================================================
        handlePanelToolAction: function () {
            // Collapse panel
            $('[data-action=collapse]').on('click', function(e){
                var targetCollapse = $(this).parents('.panel').find('.panel-body'),
                    targetCollapse2 = $(this).parents('.panel').find('.panel-sub-heading'),
                    targetCollapse3 = $(this).parents('.panel').find('.panel-footer')
                if((targetCollapse.is(':visible'))) {
                    $(this).find('i').removeClass('fa-angle-up').addClass('fa-angle-down');
                    targetCollapse.slideUp();
                    targetCollapse2.slideUp();
                    targetCollapse3.slideUp();
                }else{
                    $(this).find('i').removeClass('fa-angle-down').addClass('fa-angle-up');
                    targetCollapse.slideDown();
                    targetCollapse2.slideDown();
                    targetCollapse3.slideDown();
                }
                e.stopImmediatePropagation();
            });

            // Remove panel
            $('[data-action=remove]').on('click', function(){
                $(this).parents('.panel').fadeOut();
                // Remove backdrop element panel full size
                if($('body').find('.panel-fullsize').length)
                {
                    $('body').find('.panel-fullsize-backdrop').remove();
                }
            });

            // Refresh panel
            $('[data-action=refresh]').on('click', function(){
                var targetElement = $(this).closest('.panel').children('.panel-body');
                targetElement.append('<div class="indicator"><span class="spinner"></span></div>');
                setInterval(function(){
                    $.getJSON(BlankonApp.handleBaseURL()+'/assets/admin/data/reload-sample.json', function(json) {
                        $.each(json, function() {
                            // Retrieving data from json...
                            console.log('Retrieving data from json...');
                        });
                        targetElement.find('.indicator').hide();
                    });
                },5000);
            });

            // Expand panel
            $('[data-action=expand]').on('click', function(){
                if($(this).parents(".panel").hasClass('panel-fullsize'))
                {
                    $('body').find('.panel-fullsize-backdrop').remove();
                    $(this).data('bs.tooltip').options.title = 'Expand';
                    $(this).find('i').removeClass('fa-compress').addClass('fa-expand');
                    $(this).parents(".panel").removeClass('panel-fullsize');
                }
                else
                {
                    $('body').append('<div class="panel-fullsize-backdrop"></div>');
                    $(this).data('bs.tooltip').options.title = 'Minimize';
                    $(this).find('i').removeClass('fa-expand').addClass('fa-compress');
                    $(this).parents(".panel").addClass('panel-fullsize');
                }
            });

            // Search panel
            $('[data-action=search]').on('click', function(){
                $(this).parents('.panel').find('.panel-search').toggle(100);
                return false;
            });

        },

        // =========================================================================
        // JQUERY SPARKLINE
        // =========================================================================
        handleSparkline: function () {
            if($('.sparklines').length){
                $('.average').sparkline('html',{type: 'bar', barColor: '#37BC9B', height: '30px'});
                $('.traffic').sparkline('html',{type: 'bar', barColor: '#8CC152', height: '30px'});
                $('.disk').sparkline('html',{type: 'bar', barColor: '#E9573F', height: '30px'});
                $('.cpu').sparkline('html',{type: 'bar', barColor: '#F6BB42', height: '30px'});
            }
        },

        // =========================================================================
        // CLEAR ALL COOKIE
        // =========================================================================
        handleClearCookie: function () {
            $('#reset-setting').on('click', function(){
                var cookies = $.cookie();
                for(var cookie in cookies) {
                    $.removeCookie(cookie);
                }
                location.reload(true);
            });
        },

        // =========================================================================
        // BOX MODAL
        // =========================================================================
        handleBoxModal: function () {
            $('#setting').on('click', function(){
                // Add sound
                ion.sound.play('camera_flashing');
                bootbox.dialog({
                    message: 'I am a custom dialog setting',
                    title: 'Custom setting',
                    className: 'modal-success modal-center',
                    buttons: {
                        success: {
                            label: 'Success!',
                            className: 'btn-success',
                            callback: function() {
                                alert('You are so calm!');
                            }
                        },
                        danger: {
                            label: 'Danger!',
                            className: 'btn-danger',
                            callback: function() {
                                alert('You are so hot!');
                            }
                        },
                        main: {
                            label: 'Click ME!',
                            className: 'btn-primary',
                            callback: function() {
                                alert('Hello World');
                            }
                        }
                    }
                });
            });

            $('#lock-screen').on('click', function(){
                // Add sound
                ion.sound.play('camera_flashing');
                bootbox.dialog({
                    message: 'Locker with notification display, Receive your notifications directly on your lock screen',
                    title: 'Lock Screen',
                    className: 'modal-lilac modal-center',
                    buttons: {
                        danger: {
                            label: 'No',
                            className: 'btn-danger'
                        },
                        success: {
                            label: 'Yes',
                            className: 'btn-success',
                            callback: function() {
                                window.location = $('#lock-screen').data('url');
                            }
                        }
                    }
                });
            });

            $('#logout').on('click', function(){
                // Add sound
                ion.sound.play('camera_flashing');
                bootbox.dialog({
                    message: 'Do you want to exit from Blankon?',
                    title: 'Logout',
                    className: 'modal-danger modal-center',
                    buttons: {
                        danger: {
                            label: 'No',
                            className: 'btn-danger'
                        },
                        success: {
                            label: 'Yes',
                            className: 'btn-success',
                            callback: function() {
                                window.location = $('#logout').data('url');
                            }
                        }
                    }
                });
            });
        },

        // =========================================================================
        // COPYRIGHT YEAR
        // =========================================================================
        handleCopyrightYear : function () {
            if($('#copyright-year').length){
                var today = new Date();
                $('#copyright-year').text(today.getFullYear());
            }
        },

		// =========================================================================
        // CHOOSE THEMES
        // =========================================================================
        handleChooseThemes: function () {
            // Check cookie for color schemes
            if ($.cookie('color_schemes')) {
                $('link#theme').attr('href', adminCssPath+'/themes/'+$.cookie('color_schemes')+'.theme.css');
            }
            // Check cookie for navbar color
            if ($.cookie('navbar_color')) {
                $('.navbar-toolbar').attr('class', 'navbar navbar-toolbar navbar-'+$.cookie('navbar_color'));
            }
            // Check cookie for sidebar color
            if ($.cookie('sidebar_color')) {
                // Check variant sidebar class
                if($('#sidebar-left').hasClass('sidebar-box')){
                    $('#sidebar-left').attr('class','sidebar-box sidebar-'+$.cookie('sidebar_color'));
                }
                else if($('#sidebar-left').hasClass('sidebar-rounded')){
                    $('#sidebar-left').attr('class','sidebar-rounded sidebar-'+$.cookie('sidebar_color'));
                }
                else if($('#sidebar-left').hasClass('sidebar-circle')){
                    $('#sidebar-left').attr('class','sidebar-circle sidebar-'+$.cookie('sidebar_color'));
                }
                else if($('#sidebar-left').attr('class') == ''){
                    $('#sidebar-left').attr('class','sidebar-'+$.cookie('sidebar_color'));
                }
            }

            $('.color-schemes .theme').on('click',function(){

                // Create variable name selector file css
                var themename = $(this).find('.hide').text();

                // Add effect sound
                if($('.page-sound').length){
                    ion.sound.play("camera_flashing_2");
                }

                // Add attribut href css theme
                $('link#theme').attr('href', adminCssPath+'/themes/'+themename+'.theme.css');

                // Set cookie theme name value to variable themename
                $.cookie('color_schemes',themename, {expires: 1});

            });
        },

        // =========================================================================
        // NAVBAR COLOR
        // =========================================================================
        handleNavbarColor: function () {
            $('.navbar-color .theme').on('click',function(){
                // Create variable name selector file css
                var classname = $(this).find('.hide').text();
                // Add effect sound
                if($('.page-sound').length){
                    ion.sound.play("camera_flashing_2");
                }
                // Add class navbar-color
                $('.navbar-toolbar').attr('class', 'navbar navbar-toolbar navbar-'+classname);
                // Set cookie theme name value to variable classname
                $.cookie('navbar_color',classname, {expires: 1});
            });
        },

        // =========================================================================
        // SIDEBAR COLOR
        // =========================================================================
        handleSidebarColor: function () {
            $('.sidebar-color .theme').on('click',function(){
                // Create variable name selector file css
                var classname = $(this).find('.hide').text();
                // Add effect sound
                if($('.page-sound').length){
                    ion.sound.play("camera_flashing_2");
                }
                // Check variant sidebar class
                if($('#sidebar-left').hasClass('sidebar-box')){
                    $('#sidebar-left').attr('class','sidebar-box sidebar-'+classname);
                }
                else if($('#sidebar-left').hasClass('sidebar-rounded')){
                    $('#sidebar-left').attr('class','sidebar-rounded sidebar-'+classname);
                }
                else if($('#sidebar-left').hasClass('sidebar-circle')){
                    $('#sidebar-left').attr('class','sidebar-circle sidebar-'+classname);
                }
                else if($('#sidebar-left').attr('class') == ''){
                    $('#sidebar-left').attr('class','sidebar-'+classname);
                }
                // Set cookie theme name value to variable classname
                $.cookie('sidebar_color',classname, {expires: 1});
            });
        },

        // =========================================================================
        // LAYOUT SETTING
        // =========================================================================
        handleLayoutSetting: function () {
            // Check cookie for layout setting
            if ($.cookie('layout_setting')) {
                $('body').addClass($.cookie('layout_setting'));
            }

            // Check cookie for header layout setting
            if ($.cookie('header_layout_setting')) {
                $('body').addClass($.cookie('header_layout_setting'));
            }

            // Check cookie for sidebar layout setting
            if ($.cookie('sidebar_layout_setting')) {
                $('#sidebar-left').addClass($.cookie('sidebar_layout_setting'));
            }

            // Check cookie for sidebar type layout setting
            if ($.cookie('sidebar_type_setting')) {
                $('#sidebar-left').addClass($.cookie('sidebar_type_setting'));
            }

            // Check cookie for footer layout setting
            if ($.cookie('footer_layout_setting')) {
                $('body').addClass($.cookie('footer_layout_setting'));
            }

            // Check checked status input on layout setting
            if($('body').not('.page-boxed')){
                $('.layout-setting li:eq(0) input').attr('checked','checked');
            }
            if($('body').hasClass('page-boxed')){
                $('.layout-setting li:eq(1) input').attr('checked','checked');
                $('body').removeClass('page-header-fixed');
                $('body').removeClass('page-sidebar-fixed');
                $('body').removeClass('page-footer-fixed');
                $('.header-layout-setting li:eq(1) input').attr('disabled','disabled').next().css('text-decoration','line-through').parent('.rdio').attr({'data-toggle':'tooltip','data-container':'body','data-placement':'left','data-title':'Not working on page boxed'}).tooltip();
                $('.sidebar-layout-setting li:eq(1) input').attr('disabled','disabled').next().css('text-decoration','line-through').parent('.rdio').attr({'data-toggle':'tooltip','data-container':'body','data-placement':'left','data-title':'Not working on page boxed'}).tooltip();
                $('.footer-layout-setting li:eq(1) input').attr('disabled','disabled').next().css('text-decoration','line-through').parent('.rdio').attr({'data-toggle':'tooltip','data-container':'body','data-placement':'left','data-title':'Not working on page boxed'}).tooltip();
            }

            // Check checked status input on header layout setting
            if($('body').not('.page-header-fixed')){
                $('.header-layout-setting li:eq(0) input').attr('checked','checked');
            }
            if($('body').hasClass('page-header-fixed')){
                $('.header-layout-setting li:eq(1) input').attr('checked','checked');
            }

            // Check checked status input on sidebar layout setting
            if($('body').not('.page-sidebar-fixed')){
                $('.sidebar-layout-setting li:eq(0) input').attr('checked','checked');
            }
            if($('body').hasClass('page-sidebar-fixed')){
                $('.sidebar-layout-setting li:eq(1) input').attr('checked','checked');
            }

            // Check checked status input on sidebar type layout setting
            if($('#sidebar-left').not('.sidebar-box, .sidebar-rounded, .sidebar-circle')){
                $('.sidebar-type-setting li:eq(0) input').attr('checked','checked');
            }
            if($('#sidebar-left').hasClass('sidebar-box')){
                $('.sidebar-type-setting li:eq(1) input').attr('checked','checked');
            }
            if($('#sidebar-left').hasClass('sidebar-rounded')){
                $('.sidebar-type-setting li:eq(2) input').attr('checked','checked');
            }
            if($('#sidebar-left').hasClass('sidebar-circle')){
                $('.sidebar-type-setting li:eq(3) input').attr('checked','checked');
            }

            // Check checked status input on footer layout setting
            if($('body').not('.page-footer-fixed')){
                $('.footer-layout-setting li:eq(0) input').attr('checked','checked');
            }
            if($('body').hasClass('page-footer-fixed')){
                $('.footer-layout-setting li:eq(1) input').attr('checked','checked');
            }


            $('.layout-setting input').change(function(){

                // Create variable class name for layout setting
                var classname = $(this).val();

                // Add trigger change class on body HTML
                if($('body').hasClass('page-boxed')){
                    $('body').removeClass('page-boxed');
                    $('body').removeClass('page-header-fixed');
                    $('body').removeClass('page-sidebar-fixed');
                    $('body').removeClass('page-footer-fixed');
                    $('.header-layout-setting li:eq(1) input').removeAttr('disabled').next().css('text-decoration','inherit').parent('.rdio').tooltip('destroy');
                    $('.sidebar-layout-setting li:eq(1) input').removeAttr('disabled').next().css('text-decoration','inherit').parent('.rdio').tooltip('destroy');
                    $('.footer-layout-setting li:eq(1) input').removeAttr('disabled').next().css('text-decoration','inherit').parent('.rdio').tooltip('destroy');
                }else{
                    $('body').addClass($(this).val());
                    $('body').removeClass('page-header-fixed');
                    $('body').removeClass('page-sidebar-fixed');
                    $('body').removeClass('page-footer-fixed');
                    $('.header-layout-setting li:eq(1) input').attr('disabled','disabled').next().css('text-decoration','line-through').parent('.rdio').attr({'data-toggle':'tooltip','data-container':'body','data-placement':'left','data-title':'Not working on page boxed'}).tooltip();
                    $('.sidebar-layout-setting li:eq(1) input').attr('disabled','disabled').next().css('text-decoration','line-through').parent('.rdio').attr({'data-toggle':'tooltip','data-container':'body','data-placement':'left','data-title':'Not working on page boxed'}).tooltip();
                    $('.footer-layout-setting li:eq(1) input').attr('disabled','disabled').next().css('text-decoration','line-through').parent('.rdio').attr({'data-toggle':'tooltip','data-container':'body','data-placement':'left','data-title':'Not working on page boxed'}).tooltip();
                }

                // Set cookie theme name value to variable classname
                $.cookie('layout_setting',classname, {expires: 1});

            });

            $('.header-layout-setting input').change(function(){

                // Create variable class name for layout setting
                var classname = $(this).val();

                // Add trigger change class on body HTML
                if($('body').hasClass('page-header-fixed')){
                    $('body').removeClass('page-header-fixed');
                    $('body').addClass($(this).val());
                }

                $('body').addClass($(this).val());

                // Set cookie theme name value to variable classname
                $.cookie('header_setting',classname, {expires: 1});

            });

            $('.sidebar-layout-setting input').change(function(){

                // Create variable class name for layout setting
                var classname = $(this).val();

                // Add trigger change class on body HTML
                if($('body').hasClass('page-sidebar-fixed')){
                    $('body').removeClass('page-sidebar-fixed');
                    $('.header-layout-setting li:eq(0) input').removeAttr('disabled').next().css('text-decoration','inherit').parent('.rdio').tooltip('destroy');
                }else{
                    $('body').addClass($(this).val());
                    $('body').addClass('page-header-fixed');
                    $('.header-layout-setting li:eq(0) input').attr('disabled','disabled').next().css('text-decoration','line-through').parent('.rdio').attr({'data-toggle':'tooltip','data-container':'body','data-placement':'left','data-title':'Not working on sidebar fixed'}).tooltip();
                    $('.header-layout-setting li:eq(1) input').attr('checked','checked');
                }

                // Set cookie theme name value to variable classname
                $.cookie('sidebar_layout_setting',classname, {expires: 1});

            });

            $('.sidebar-type-setting input').change(function(){

                // Create variable class name for layout setting
                var classname = $(this).val();

                // Add trigger change class on sidebar left element
                if($('#sidebar-left').hasClass('sidebar-circle')){
                    $('#sidebar-left').removeClass('sidebar-circle');
                    $('#sidebar-left').addClass($(this).val());
                }

                if($('#sidebar-left').hasClass('sidebar-box')){
                    $('#sidebar-left').removeClass('sidebar-box');
                    $('#sidebar-left').addClass($(this).val());
                }

                if($('#sidebar-left').hasClass('sidebar-rounded')){
                    $('#sidebar-left').removeClass('sidebar-rounded');
                    $('#sidebar-left').addClass($(this).val());
                }

                $('#sidebar-left').addClass($(this).val());

                // Set cookie theme name value to variable classname
                $.cookie('sidebar_type_setting',classname, {expires: 1});

            });

            $('.footer-layout-setting input').change(function(){

                // Create variable class name for layout setting
                var classname = $(this).val();

                // Add trigger change class on body HTML
                if($('body').hasClass('page-footer-fixed')){
                    $('body').removeClass('page-footer-fixed')
                }else{
                    $('body').addClass($(this).val());
                }

                // Set cookie theme name value to variable classname
                $.cookie('footer_layout_setting',classname, {expires: 1});

            });
        }
    };
}();

// Call main app init
BlankonApp.init();
