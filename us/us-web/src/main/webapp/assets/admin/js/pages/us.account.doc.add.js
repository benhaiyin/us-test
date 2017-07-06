'use strict';
var USFlowAdd = function () {
    return {
        init: function () {
			$('.date-range-picker-single').datepicker({
				format: 'yyyy-mm-dd',
				todayBtn: 'linked'
			});
        }
    };

}();

// Call main app init
USFlowAdd.init();