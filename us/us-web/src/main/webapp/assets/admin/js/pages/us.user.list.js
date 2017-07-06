'use strict';
var USUserList = function () {
    return {
        init: function () {
			//日期控件的初始化
			$('.date-range-picker').daterangepicker();

			if($('.chosen-select').length){
                $('.chosen-select').chosen();
            }

			//表格控件的初始化
			var tableDom = $('.table');
			var responsiveHelperDom = undefined;
			if( tableDom.length > 0 ){
				var breakpointDefinition = {
					tablet: 1024,
					phone : 480
				};
				tableDom.dataTable({
					autoWidth		:	false,
					bFilter			:	false,
					bLengthChange	:	false,
					columnDefs		:	[
						{
							'targets': 0,
							'searchable': false,
							'orderable': false
						},
						{
							'targets': [0,1,2,4,5,7],
	                        'sortable': false
						},						
					],
					'order': [],
					preDrawCallback: function () {
						// Initialize the responsive datatables helper once.
						if (!responsiveHelperDom) {
							responsiveHelperDom = new ResponsiveDatatablesHelper(tableDom, breakpointDefinition);
						}
					},
					rowCallback    : function (nRow) {
						responsiveHelperDom.createExpandIcon(nRow);
					},
					drawCallback   : function (oSettings) {
						responsiveHelperDom.respond();
					}
				});
			}
        }
    };

}();

// Call main app init
USUserList.init();