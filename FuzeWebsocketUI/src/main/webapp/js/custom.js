 function isNumeric(n) {
          return !isNaN(parseFloat(n)) && isFinite(n);
        }

        function getBoolean(str) {
          if("true".startsWith(str)){
            return true;
          } else if("false".startsWith(str)){
            return false;
          } else {
            return null;
          }          
        }

                    function toolbar_click() {
                    			console.log("Toolbar command is clicked!");
										  return false;
										}
									 var wnd,detailsTemplate;
/*									
										$("#grid").kendoGrid({
											dataSource: {
										      transport: {
										         read: function (options) {
										             readData(options);
										         //    window.location.replace("dashboard");
										             },
										        update: function (options) {
										        updateGrid(options);
										        readData(options);
										             },
										        
										             destroy: function (options) {
										            	 deleteRow(options);
										            	 readData(options);
										            	    
											             },
											        
										             create: function (options) {
											            createRow(options);
											            readData(options);
											            	  },
										          parameterMap: function (options, operation) {
										        		if (operation !== "read" && options.models) {
										              		return { models: kendo.stringify(options.models) };
										              		}
										            	}
										          },
										        schema: {
										        	 model: {
					                                     id: "id",
					                                     fields: {
					                                    	 poName: { type: "string",validation: { required: true} },
					                                    	 teritory: { type: "string" ,validation: { required: true}},
					                                    	 market: {type:"string"},
					                                    	 pslc: {type:"string"},
					                                    	 poStatus: { type: "string" ,validation: { required: true}},
					                                    	 siteTracker:{ type: "string",validation: { required: true} }
					                                    	 
					                                     }
					                                 }
										        },
										         pageSize: 10
										    },
										    pageable: true,
					                        sortable: true,
					                        filterable: true,
										    resizable:true,
//										    toolbar: [
//										        { name: "create", onclick:toolbar_click()},
//										        { name: "save" },
//										        { name: "cancel" }
//										      ],
// 										    toolbar: kendo.template($("#template").html()),
						                       toolbar: ["create"],
										    columns: [
										    	 { field:"poName", title: "PO Name", width: "140px",template:"<a href='javascript:showDetail(#=id#)' id='name-link'>#=name#</a>" },
										    	 { field: "id", title:"ID", width: "80px" },
										    	 { field: "teritory", title:"Teritory", width: "120px" },
					                             { field: "market", title:"Market", width: "120px" },
					                            // { field: "role", title:"Role", width: "120px" ,editor: categoryDropDownEditor, template: "#=role.text#"},
					                             { field: "pslc", title:"pslc", width: "120px" },
					                             { field: "id", title:"IN_Stock", width: "120px",customBoolEditor },
					                             { command: ["edit", "destroy"], title: "&nbsp;", width: "200px" }
					                             ],
					                   editable: "popup"
									});
									function customBoolEditor(container, options) {
										 var guid = kendo.guid();
					                     $('<input class="k-checkbox" id="' + guid + '" type="checkbox" name="Discontinued" data-type="boolean" data-bind="checked:Discontinued">').appendTo(container);
					                     $('<label class="k-checkbox-label" for="' + guid + '">​</label>').appendTo(container);
					                 }*/
									function showDetail(e) {
					                     //localStorage.removeItem('currentValue');
					                     console.log(e);
					                     localStorage.setItem('currentValue',e);
					                     //window.location.href='empInfo/'+ e;
					                 }


									 
									 function onSelect(e) {
							                if ("kendoConsole" in window) {
							                    if (e.dataItem) {
							                        var dataItem = e.dataItem;
							                        kendoConsole.log("event :: select (" + dataItem.text + " : " + dataItem.value + ")");
							                    } else {
							                        kendoConsole.log("event :: select");
							                    }
							                }
							            };
									function categoryDropDownEditor(container, options) {
					                    $('<input required name="' + options.field + '"/>')
					                        .appendTo(container)
					                        .kendoDropDownList({
					                            autoBind: false,
					                            dataTextField: "text",
					                            dataValueField: "value",
					                            dataSource:[
					                                { text: "ADMIN", value: "1" },
					                                { text: "NUMBER", value: "2" }
					                              ],
					                            select: onSelect	
					                            });
					                       
					                }

function readData(options){
	$.ajax({
        url: "http://localhost:8088/RePO/getPoRequest",
        dataType: "json",
        cache: false,
        success: function (result) {
        	//$(".k-window-title").empty();
			//$(".k-window-title").append("New");
			//var userList=result.items;
           options.success(result);
          
        },
        error: function (result) {
        	options.success(result);
         }
       });

}



$('#filter').on('input', function (e) {
    var grid = $('#grid').data('kendoGrid');
    var columns = grid.columns;

    var filter = { logic: 'or', filters: [] };
    columns.forEach(function (x) {
      if (x.field) {
        var type = grid.dataSource.options.schema.model.fields[x.field].type;
        if (type == 'string') {
          filter.filters.push({
            field: x.field,
            operator: 'contains',
            value: e.target.value
          })
        }
        else if (type == 'number') {
          if (isNumeric(e.target.value)) {
            filter.filters.push({
              field: x.field,
              operator: 'eq',
              value: e.target.value
            });
          }    

        } else if (type == 'date') {
          var data = grid.dataSource.data();
          for (var i=0;i<data.length ; i++){
            var dateStr = kendo.format(x.format, data[i][x.field]);
            // change to includes() if you wish to filter that way https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/includes
            if(dateStr.startsWith(e.target.value)){
              filter.filters.push({
                field: x.field,
                operator:'eq',
                value: data[i][x.field]
              })
            }
          }
        } else if (type == 'boolean' && getBoolean(e.target.value) !== null) {
          var bool = getBoolean(e.target.value);
          filter.filters.push({
            field: x.field,
            operator: 'eq',
            value: bool
          });
        }               
      }
    });
    grid.dataSource.filter(filter);
  });