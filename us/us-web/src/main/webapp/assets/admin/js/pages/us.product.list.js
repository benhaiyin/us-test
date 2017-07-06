'use strict';
var USProductList = function () {
    return {
        init: function () {
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
							'targets': [6],
	                        'sortable': false
						}		
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
USProductList.init();