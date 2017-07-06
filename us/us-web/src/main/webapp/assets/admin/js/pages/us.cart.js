'use strict';
var USCart = function () {
    return {
        init: function () {
			//表格控件的初始化
			var tableDom = $('.table');

			$(tableDom).each(function(){
				var responsiveHelperDom = undefined;
				if( tableDom.length > 0 ){
					var breakpointDefinition = {
						tablet: 1024,
						phone : 480
					};
					$(this).dataTable({
						autoWidth		:	false,
						bFilter			:	false,
						bLengthChange	:	false,
						bPaginate		:	false,
						bInfo			:	false,
						columnDefs		:	[
							{
								'targets': [0, 1, 2, 3, 4, 5],
								'searchable': false,
								'orderable': false,
								'sortable': false
							}
						],
						'order': [],
						preDrawCallback: function () {
							// Initialize the responsive datatables helper once.
							if (!responsiveHelperDom) {
								responsiveHelperDom = new ResponsiveDatatablesHelper($(this), breakpointDefinition);
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
			});
        }
    };

}();

// Call main app init
USCart.init();