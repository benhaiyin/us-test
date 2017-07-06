'use strict';
var USProductAdd = function () {
    return {
        init: function () {
			if($('#summernote-textarea').length){
                $('#summernote-textarea').summernote();
            }

			if($('.chosen-select').length){
                $('.chosen-select').chosen();
            }
        }
    };

}();

// Call main app init
USProductAdd.init();