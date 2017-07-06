'use strict';
var USMessageView = function () {
    return {
        init: function () {
			$(window).resize(function(){
				WSMessageView.UIResizeProcess();
			});
			WSMessageView.UIResizeProcess();
        },

		UIResizeProcess: function(){
			if( $(window).width() < (992-17) ){	//好友列表独占一行
				$('.us-friends .list-group').height( 'auto' );
				$('.us-commenting .media-list').height( 'auto' );
			}
			else{	//好友列表和聊天记录保持左右排布
				//alert( $('.us-friends').offset().top );
				var h = $('footer').offset().top - $('.us-friends').offset().top - $('footer').height();
				$('.us-friends .list-group').height( h );
				$('.us-friends .list-group').css( 'overflow-y', 'auto' );
				$('.us-commenting .media-list').height( h - 65 );
				$('.us-commenting .media-list').css( 'overflow-y', 'auto' );
			}
		}
    };

}();

// Call main app init
USMessageView.init();