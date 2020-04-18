<!DOCTYPE html>
<html lang="en">

<head>


<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Fuze Ginger - Tables</title>
<link href="../vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<style type="text/css">
#details-container {
	padding: 10px;
}

#details-container h2 {
	margin: 0;
}

#name-link {
	color: blue;
	cursor: pointer;
}

#details-container em {
	color: #8c8c8c;
}

#details-container dt {
	margin: 0;
	display: inline;
}
</style>
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="../css/sb-admin-2.min.css" rel="stylesheet">

<!-- Custom styles for this page -->
<link href="../vendor/datatables/dataTables.bootstrap4.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://kendo.cdn.telerik.com/2019.3.1023/styles/kendo.default-v2.min.css" />
<script src="https://kendo.cdn.telerik.com/2019.3.1023/js/jquery.min.js"></script>
<script
	src="https://kendo.cdn.telerik.com/2019.3.1023/js/kendo.all.min.js"></script>
</head>

<body id="page-top">
	<div id="wrapper">
		<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">
<li>
			<a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
				<span class="sidebar-brand-icon rotate-n-15">
					<i class="fas fa-laugh-wink"></i>
				</span>
				<span class="sidebar-brand-text mx-3">
					FUZE <sup>Ginger</sup>
				</span>
			</a>
<hr class="sidebar-divider my-0">
</li>

			
			<li class="nav-item active"><a class="nav-link"
				href="/"> <i class="fas fa-fw fa-table"></i> <span>Home</span></a>
			<hr class="sidebar-divider d-none d-md-block">
			<!-- Sidebar Toggler (Sidebar) -->
			<span class="text-center d-none d-md-inline">
				<button class="rounded-circle border-0" id="sidebarToggle"></button>
			</span>
			</li>

</ul>
		<!-- End of Sidebar -->

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">
					<button id="sidebarToggleTop"
						class="btn btn-link d-md-none rounded-circle mr-3">
						<i class="fa fa-bars"></i>
					</button>
					<ul class="navbar-nav ml-auto">
						<li class="nav-item dropdown no-arrow d-sm-none"><a
							class="nav-link dropdown-toggle" href="#" id="searchDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <i class="fas fa-search fa-fw"></i>
						</a> <!-- Dropdown - Messages -->
							<div
								class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
								aria-labelledby="searchDropdown">
								<form class="form-inline mr-auto w-100 navbar-search">
									<div class="input-group">
										<input type="text"
											class="form-control bg-light border-0 small"
											placeholder="Search for..." aria-label="Search"
											aria-describedby="basic-addon2">
										<div class="input-group-append">
											<button class="btn btn-primary" type="button">
												<i class="fas fa-search fa-sm"></i>
											</button>
										</div>
									</div>
								</form>
							</div></li>


						<!-- <div class="topbar-divider d-none d-sm-block"></div> -->
                       	<li class="nav-item dropdown no-arrow">
                       	<a class="nav-link dropdown-toggle" href="#" id="userDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <span
								class="mr-2 d-none d-lg-inline text-gray-600 small" id="currentEmployee"></span> <img
								class="img-profile rounded-circle"
								src="https://upload.wikimedia.org/wikipedia/commons/8/89/Portrait_Placeholder.png">
						</a>
							<span class="dropdown-menu dropdown-menu-right shadow animated--grow-in"  aria-labelledby="userDropdown">
								<a class="dropdown-item" href="#"> <i
									class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i> Profile
								</a> <a class="dropdown-item" href="#"> <i
									class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
									Settings
								</a> <a class="dropdown-item" href="#"> <i
									class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>
									Activity Log
								</a>
								<span class="dropdown-divider"></span>
								<a class="dropdown-item" href="#" data-toggle="modal"
									data-target="#logoutModal"> <i
									class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
									Logout
								</a>
							</span>
							</li>
							</ul>
				</nav>

				<!-- End of Topbar -->

				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Page Heading -->
					<!-- <h1 class="h3 mb-2 text-gray-800">Tables</h1>
          <p class="mb-4">DataTables is a third party plugin that is used to generate the demo table below. For more information about DataTables, please visit the <a target="_blank" href="https://datatables.net">official DataTables documentation</a>.</p> -->

					<!-- DataTales Example -->
					<div class="card shadow mb-4">
						<div class="card-header py-3">
							<h6 class="m-0 font-weight-bold text-primary">Product List</h6>
						</div>
						<div class="card-body">
							<div class="table-responsive">
								<div id="example">
									<!-- <div id="dialog"></div> -->
									<div id="grid"></div>
									<!-- <div id="details"></div> -->
									<span id="notification"></span>



						
								</div>



							</div>
						</div>
					</div>

				</div>
				</div>
				</div>
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->

			<!-- Footer -->
			<footer class="sticky-footer bg-white">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Copyright &copy; Your Website 2019</span>
					</div>
				</div>
			</footer>
			<!-- End of Footer -->

		
		<!-- End of Content Wrapper -->
<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="../login">Logout</a>
				</div>
			</div>
		</div>
	</div>

<script>

$(function(){
    if (typeof WebSocket === "undefined") {
        $("#grid").html('This demo requires <a href="https://en.wikipedia.org/wiki/WebSocket">WebSocket</a> support.<a href="http://updateyourbrowser.net/" title="Update Your Browser"><img src="http://updateyourbrowser.net/uyb.jpg" border="0" alt="Update Your Browser" /></a>');
        return;
    }

    /* let socket = new ClusterWS({ url: 'wss://www.koepiste.fi/scyllaTest' })
    socket.on('error',()=>console.log)
    socket.on('connect',()=>{
        console.log('ClusterWS connected')
    }) */
    
    var ws = new SockJS('http://localhost:8080/fuze-websocket');
    stompClient = Stomp.over(ws);
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/greetings', function (greeting) {
            showGreeting(JSON.parse(greeting.body).content);
        });
       
    });
    /*  var host = "ws://localhost:8080/fuze-websocket";
    var ws = new WebSocket(host);
  */
    //Bind the grid when the socket connects
    ws.onopen = function() {
        $("#grid").data("kendoGrid").dataSource.fetch();
    };

    //Close the socket when the browser window is closed.
    window.onbeforeunload = function() {
        ws.close();
    }

    //Helper function to send data through the socket
    function send(ws, request, callback) {
        if (ws.readyState != 1) {
            alert("Socket was closed. Please reload the page.");
            return;
        }

        //Assign unique id to the request. Will use that to distinguish the response.
        request.id = kendo.guid();

        //Listen to the "message" event to get server response
        ws.addEventListener("message", function(e) {
            var result = JSON.parse(e.data);

            //Check if the response is for the current request
            if (result.id == request.id) {
                //Stop listening
                ws.removeEventListener("message", arguments.callee);

                //Invoke the callback with the result
                callback(result);
            }
        });

        //Send the data to the server
        ws.send(JSON.stringify(request));
    }

    $("#notification").kendoNotification({
        width: "100%",
        position: {
            top: 0,
            left: 0
        }
    });

    $("#grid").kendoGrid({
        autoBind: false,
        editable: true,
        sortable: true,
        columns: [
        	 { field:"poName", title: "PO Name", width: "140px",template:"<a href='javascript:showDetail(#=id#)' id='name-link'>#=name#</a>" },
	    	 { field: "id", title:"ID", width: "80px" },
	    	 { field: "teritory", title:"Teritory", width: "120px" },
             { field: "market", title:"Market", width: "120px" },
            // { field: "role", title:"Role", width: "120px" ,editor: categoryDropDownEditor, template: "#=role.text#"},
             { field: "pslc", title:"pslc", width: "120px" },
             { field: "id", title:"IN_Stock", width: "120px" },
             { command: ["destroy"], title: "&nbsp;", width: "200px" }
             
        ],
        toolbar: ["create"],
        dataSource: {
            // Handle the push event to display notifications when push updates arrive
            push: function(e) {
                var notification = $("#notification").data("kendoNotification");
                notification.success(e.type);
            },
            pageSize: 4,
            autoSync: true,
            schema: {
                model: {
                    id: "ProductID",
                 	 poName: { type: "string",validation: { required: true} },
                	 teritory: { type: "string" ,validation: { required: true}},
                	 market: {type:"string"},
                	 pslc: {type:"string"},
                	 poStatus: { type: "string" ,validation: { required: true}},
                	 siteTracker:{ type: "string",validation: { required: true} }
  
                },
                data: "data"
            },
            sort: [ { field: "CreatedAt", dir: "desc" }],
            transport: {
                push: function(options) {
                    //Listen to the "message" event fired when the server pushes data
                    ws.addEventListener("message", function(e) {
                        var result = JSON.parse(e.data);

                        //Check what the push type is and invoke the corresponding callback.
                        if (result.type == "push-update") {
                            options.pushUpdate(result);
                        } else if (result.type == "push-destroy") {
                            options.pushDestroy(result);
                        } else if (result.type == "push-create") {
                            options.pushCreate(result);
                        }
                    });
                },
                read: function(options) {
                    var request = { type: "read" };

                    send(ws, request, function(result) {
                        options.success(result);
                    });
                },
                update: function(options) {
                    var request = { type: "update", data: [options.data] };

                    send(ws, request, options.success);
                },
                destroy: function(options) {
                    var request = { type: "destroy", data: [options.data] };

                    send(ws, request, options.success);
                },
                create: function(options) {
                    var request = { type: "create", data: [options.data] };

                    send(ws, request, options.success);
                }
            }
        }
    });
});
</script>
	<script src="../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="../js/sb-admin-2.min.js"></script>
	<script src="../js/custom.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.4.0/sockjs.min.js"></script> 
<script src="https://cdnjs.cloudflare.com/ajax/libs/stomp.js/2.3.3/stomp.js"></script>	


</body>

</html>
