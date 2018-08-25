<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="/vendor/resources/vendor/gv.bootstrap-form.css"
	rel="stylesheet" type="text/css" />
<script src="/vendor/resources/js/ValidateScreen.js"></script>
<script src="/vendor/resources/js/FrameworkUtil.js"></script>
<script src="/vendor/resources/js/galleryCreate.js"></script>

<link rel="stylesheet" href="/vendor/resources/css/docSupport/prism.css">
<link rel="stylesheet"
	href="/vendor/resources/css/docSupport/chosen.css">

<script src="/vendor/resources/js/docSupport/chosen.jquery.js"
	type="text/javascript"></script>
<script src="/vendor/resources/js/docSupport/prism.js"
	type="text/javascript" charset="utf-8"></script>
<script src="/vendor/resources/js/docSupport/init.js"
	type="text/javascript" charset="utf-8"></script>
<script src="/vendor/resources/js/galleryCreate.js"
	type="text/javascript" charset="utf-8"></script>
<link rel="stylesheet"
	href="/vendor/resources/css/date/bootstrap-datepicker.min.css">

<script src="/vendor/resources/js/date/bootstrap-datepicker.min.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Gallery</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row">

			<form id="formentry" class="form-horizontal" role="form"
				data-parsley-validate="" novalidate="">

				<div class="row">



					<div class="row">
						<div class="col-md-12">
							<div id="panel1" class="panel panel-default" data-role="panel">
								<div class="panel-heading">Gallery</div>
								<div class="panel-body">

									<div class="row">
										<div class="col-md-6">
											<div class="form-group" rel="popover" data-trigger="hover"
												data-content="Title" data-original-title="">
												<label class="control-label control-label-left col-sm-3"
													for="title">Title<span class="req"> *</span></label>
												<div class="controls col-sm-9">

													<input id="title" type="text"
														class="form-control k-textbox" data-role="text"
														data-parsley-minlength="5" data-parsley-maxlength="120"
														required="required" name="title" placeholder="title"
														data-parsley-errors-container="#errId1"
														data-parsley-id="1322"><span id="errId1"
														class="error"><ul class="parsley-errors-list"
															id="parsley-id-1322"></ul></span>
												</div>

											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group" rel="popover" data-trigger="hover"
												data-content="Url" data-original-title="">
												<label class="control-label control-label-left col-sm-3"
													for="field3">url<span class="req"> *</span></label>
												<div class="controls col-sm-9">

													<input id="field3" type="text"
														class="form-control k-textbox" data-role="text"
														placeholder="Url" required="required" name="url"
														data-parsley-errors-container="#errId2"
														data-parsley-id="3101"><span id="errId2"
														class="error"><ul class="parsley-errors-list"
															id="parsley-id-3101"></ul></span>
												</div>

											</div>
										</div>
									</div>
									<div class="row">
										<div class="col-md-6">



											<div class="form-group" rel="popover" data-trigger="hover"
												data-content="Description" data-original-title="">
												<label class="control-label control-label-left col-sm-3"
													for="desc">Description</label>
												<div class="controls col-sm-9">

													<textarea id="desc" rows="3" class="form-control k-textbox"
														style="resize: none;" data-role="textarea" name="desc"
														data-parsley-errors-container="#errId5"
														data-parsley-id="5532"></textarea>
													<span id="errId5" class="error"><ul
															class="parsley-errors-list" id="parsley-id-5532"></ul></span>
												</div>

											</div>



										</div>
										<div class="col-md-6">
											<div class="form-group" rel="popover" data-trigger="hover"
												data-content="Category" data-original-title="">
												<label class="control-label control-label-left col-sm-3"
													for="Category">Category<span class="req"> *</span></label>
												<div class="controls col-sm-9">
													<select id='CategoryIds' name="categoryIds"
														data-placeholder="type your catgory" multiple
														class="form-control chosen-select-width" tabindex="16">
														<option>American Black Bear</option>
														<option>Asiatic Black Bear</option>
														<option>Brown Bear</option>
														<option selected>Giant Panda</option>
														<option>Sloth Bear</option>
														<option>Sun Bear</option>
														<option>Polar Bear</option>
														<option>Spectacled Bear</option>
													</select>



												</div>

											</div>
										</div>
									</div>
									<div class="row">
										<div class="col-md-12">
											<div class="form-group" rel="popover" data-trigger="hover"
												data-content="Pic Url" data-original-title="">
												<label class="control-label control-label-left col-sm-2"
													for="field4">Pic Url<span class="req"> *</span></label>
												<div class="controls col-sm-8">

													<input id="picUrl" type="text"
														class="form-control k-textbox" data-role="text"
														placeholder="Pic Url" data-parsley-minlength="5"
														data-parsley-maxlength="250" required="required"
														data-parsley-errors-container="#errId3"
														data-parsley-id="9545"> <span id="errId3"
														class="error"><ul class="parsley-errors-list"
															id="parsley-id-9545"></ul></span>
												</div>
												<label class="control-label control-label-left col-sm-2"
													for="field4">
													<button Id="addButton" type="button"
														onClick='createDynamicPicUrl()'
														class="btn btn-default btn-sm">
														<span class="glyphicon glyphicon-plus"></span>
													</button>
													<button Id="selectButton" onClick='callGallery(this)'
														idValue='picUrl' type="button"
														class="btn btn-default btn-sm">
														<span class="fa fa-external-link"></span>
													</button>
												</label>
											</div>


											<div id="picUrlDataTable"></div>





										</div>
									</div>
									<div class="row">
										<hr>
										<div class="col-md-6">
											<div class="form-group">



												<button id="button8" onclick="readData()" type="button"
													class="btn btn-success">Button</button>
											</div>
										</div>
										<div class="col-md-6"></div>
									</div>
								</div>
							</div>
						</div>
					</div>




				</div>
			</form>
		</div>
	</div>














	<div id="gallerySelect" class="modal fade" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">
						<span id="titleModal"></span>
					</h4>
				</div>
				<div class="modal-body">
					<div id="modalBody">
					 </div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>

		</div>
	</div>














</body>
</html>

