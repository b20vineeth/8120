<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Category</title>
</head>
<script src="/vendor/resources/js/editPageCategory.js"></script>
<script src="/vendor/resources/js/ValidateScreen.js"></script>
<link href="/vendor/resources/vendor/gv.bootstrap-form.css"
	rel="stylesheet" type="text/css">
<body>
	<div align='right'>
		<a href="#View-Category" onclick="goToPage(3,0,0)"
			style="font-size: 20px;" title="Previous Page"><i
			class="fa fa-times-circle previousIcon"></i> </a>
	</div>
<form id="form" class="form-horizontal" role="form"
								data-parsley-validate="" novalidate="">

		<input type='hidden' name='categoryIds' id='categoryIds' value=${ids } />
		<div id="loadSymbolHtml"></div>
		
		<div id="CategoryContent" class='hiddenDiv'>




			<div style="padding-top: 4%;">
				<div id="pages">




					<div class="container-fluid">
						<div class="row">
							
								<div class="row">
									 
									 
									<div class="row">
										<div class="col-md-12">
											<div id="panel1" class="panel panel-default"
												data-role="panel">
												<div class="panel-heading">Category</div>
												<div class="panel-body">
													<div class="row">
														<div class="col-md-6 ">
															<div class="form-group">
																<label class="control-label control-label-left col-sm-3"
																	for="category_name">Name<span class="req">
																		*</span></label>
																<div class="controls col-sm-9">
																	<input id="category_name" name="categoryName"
																		type="text" onchange="validateField(this)"
																		data_server="" data_minword="5" data_maxword="20"
																		data_key="ALBHANUM"
																		data_keyerror="Only Albhabet and number are allowed."
																		class="form-control k-textbox" data-role="text"
																		required="required" placeholder="Category Name"
																		data-parsley-errors-container="#errId1" result="false">
																	<span id="errId1" class="error"></span><br>
																</div>
															</div>
															<div class="form-group">
																<label class="control-label control-label-left col-sm-3"
																	for="category_thumb">Thumb<span class="req">
																		*</span></label>
																<div class="controls col-sm-9">
																	<input id="category_thumb" name="categoryThumb"
																		type="text" class="form-control k-textbox"
																		data-role="text" required="required"
																		onchange="validateField(this)" data_server=""
																		data_minword="5" data_maxword="250" data_key="THUMB"
																		data_keyerror="Invalid Thumb."
																		data-parsley-errors-container="#errId2"> <span
																		id="errId2" class="error"> </span><br>
																</div>
															</div>
															<div class="form-group">
																<label class="control-label control-label-left col-sm-3"
																	for="category_desc">Desc<span class="req">
																		*</span></label>
																<div class="controls col-sm-9">
																	<textarea id="category_desc" name="categoryDesc"
																		rows="3" class="form-control k-textbox"
																		onchange="validateField(this)" data_server=""
																		data_minword="5" data_maxword="500"
																		data_key="ALBHACOMMASPACE"
																		data_keyerror="Special character not allowed."
																		data-role="textarea" required="required"
																		data-minwords="10"
																		data-parsley-errors-container="#errId3"></textarea>
																	<span id="errId3" class="error"></span><br>
																</div>
															</div>
														</div>
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label control-label-left col-sm-3"
																	for="category_url">Url<span class="req">
																		*</span></label>
																<div class="controls col-sm-9">
																	<input id="category_url" name="categoryUrl"
																		onchange="validateField(this)"
																		data_server="validateCategoryUrl" type="text"
																		class="form-control k-textbox" data-role="text"
																		data_minword="5" data_maxword="120" data_key="URL"
																		data_keyerror="Only Albhabet and number are allowed."
																		required="required" placeholder="Category Url"
																		data-parsley-errors-container="#errId4"><span
																		id="errId4" class="error"></span><br>
																</div>
															</div>
															<div class="form-group">
																<label class="control-label control-label-left col-sm-3"
																	for="category_type">Type<span class="req">
																		*</span></label>
																<div class="controls col-sm-9">
																	<select id="category_type" name="categoryType"
																		class="form-control" data-role="select"
																		required="required" 
																		data-parsley-errors-container="#errId5">

																		<option value="P">Person</option>
																		<option value="L">Page</option>
																		<option value="C">Cinema</option>
																		<option value="N">News</option>
																	</select><span id="errId5" class="error"></span><br>
																</div>
															</div>
															<div class="form-group">
																<label class="control-label control-label-left col-sm-3"
																	for="category_meta">Meta</label>
																<div class="controls col-sm-9">
																	<textarea id="category_meta" name="categoryMeta"
																		rows="3" class="form-control k-textbox"
																		data-role="textarea" onchange="validateField(this)"
																		data_server="" data_minword="5" data_maxword="250"
																		data_key="ALBHACOMMASPACE"
																		data_keyerror="Special character not allowed."
																		data-parsley-errors-container="#errId6"></textarea>
																	<span id="errId6" class="error"></span><br>
																</div>
															</div>
														</div>
													</div>



													<div class="row">
														<div class="col-md-12">
															<div class="form-group">
																<label class="control-label control-label-left col-sm-3">Language</label>
																<div class="controls col-sm-9">
																	<label class="checkbox-inline" for="language_Malayalam">
																		<input type="checkbox" value="ML" id="lang"  class="ML"
																		data-parsley-mincheck="1" data-parsley-maxcheck="3" >Malayalam
																	</label><label class="checkbox-inline" for="language_Tamil">
																		<input type="checkbox" value="TN" class="TN" id="lang">Tamil
																	</label><label class="checkbox-inline" for="language_Telugu">
																		<input type="checkbox" value="TE" class="TE" id="lang">Telugu
																	</label><label class="checkbox-inline" for="language_Kannada">
																		<input id="lang" type="checkbox" class="KA" value="KA">Kannada
																	</label><label class="checkbox-inline" for="language_Bollywood">
																		<input id="lang" type="checkbox" class="BO" value="BO">Bollywood
																	</label><label class="checkbox-inline" for="language_Hollywood">
																		<input id="lang" type="checkbox" class="HO" value="HO">Hollywood
																	</label><br> <span id="lang_errId6" class="error"></span><br>
																</div>
															</div>
														</div>
													</div>



													<hr>
													<div class="row">
														<div class="col-md-6">
															<div class="row">
																<div class="col-md-3">
																	<div class="form-group">
																		<button id="Save" type="button"
																			class="btn btn-default" buttn-action="updateCategory" onclick="submitForm()">Save</button>


																	</div>
																</div>
																<div class="col-md-3"></div>
																<div class="col-md-3"></div>
															</div>
														</div>
														<div class="col-md-6"></div>
													</div>
												</div>
											</div>
										</div>
									</div>

								</div>
							 
						</div>
					</div>

				</div>
			</div>






		</div>
	</form>
</body>
</html>