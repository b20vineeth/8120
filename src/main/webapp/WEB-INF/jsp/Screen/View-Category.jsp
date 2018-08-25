<script src="/vendor/resources/js/ValidateScreen.js"></script>
<script src="/vendor/resources/js/ListCategory.js"></script>

 
<div class="container-fluid">
	<div class="row">
		<form   id="formentry" class="form-horizontal"
			role="form" data-parsley-validate novalidate>
			<div class="row">
				<div id="valErr" class="row viewerror clearfix hidden">
					<div class="alert alert-danger">Oops! Seems there are some
						errors..</div>
				</div>
				<div id="valOk" class="row viewerror clearfix hidden">
					<div class="alert alert-success">Yay! ..</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<div id="panel1" class="panel panel-default" data-role="panel">
							<div class="panel-heading">Category</div>
							<div class="panel-body">


								<div class="row">
									<div class="col-md-12 controls">

										<div class="row">
											<div class="col-sm-9"></div>
											<div class="col-sm-3">
												<input id="search" type="text"
													class="form-control k-textbox " data-role="text"
													onChange="listSearch(this.value)" required="required"
													data-parsley-errors-container="#errId2">
											</div>
										</div>
										<hr>

									</div>

								</div>
								<div class="row">
									<table class="table table-hover">
										<thead>
											<tr>
												<th>#</th>
												<th>Title</th>
												<th>Type</th>
												<th> Language</th>
												<th> </th>
											</tr>
										</thead>
										<tbody id="viewCategory">

										</tbody>
									</table>






								</div>

								<div id='divPagination'>
								
								
								</div>
								 
							</div>
		</form>
	</div>


	<script>
		document.title = "Courier : View Category";
	</script>