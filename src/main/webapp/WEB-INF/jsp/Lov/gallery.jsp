<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gallery LoV</title>
</head>
<script src="/vendor/resources/js/Lov/gallery.js" type="text/javascript"
	charset="utf-8"></script>
 <script src="/vendor/resources/js/Lov/jquery.form.js"></script>
<script src="/vendor/resources/js/dateUtil.js" type="text/javascript"
	charset="utf-8"></script>
<body>


	<form id="form">
		<div class="row">
			<div class="col-sm-4">
				<input id="Key" type="text" class="form-control  input-sm"
					placeholder="search key" data-role="text" name="searchKey"
					data-parsley-errors-container="#errId1" data-parsley-id="1283">
			</div>
			<div class="col-sm-3">
				<div class="input-group date" data-provide="datepicker"
					data-date-show-on-focus="false">
					<input type="text" class="form-control  input-sm" name="fromDate"
						id="fromDate" onChange="validateDate(this)">
					<div class="input-group-addon">
						<span class="glyphicon glyphicon-th"></span>
					</div>
				</div>
			</div>



			<div class="col-sm-3">
				<div class="input-group date" data-provide="datepicker"
					data-date-show-on-focus="false">
					<input type="text" class="form-control input-sm" name="toDate"
						id="toDate" onChange="validateDate(this)">
					<div class="input-group-addon">
						<span class="glyphicon glyphicon-th"></span>
					</div>
				</div>
			</div>
			<div class="col-sm-2">
				<div align='center'>
					<button type="button" onClick="getList()"
						class="btn btn-default btn-sm">
						<span class="glyphicon glyphicon-search"></span> Search
					</button>
					</p>
				</div>
			</div>
		</div>

	</form>


<form id="form2" method="post" action="/upload" enctype="multipart/form-data">
  <!-- File input -->    
  <input name="file2" id="file2" type="file" /><br/>
</form>
  
<button value="Submit" onclick="uploadFormData()" >Upload</button><i>Using FormData Object</i>
 
<div id="result"></div>





	<script>
		$(document).ready(function() {

			$("#datepicker").datepicker({
				format : 'dd-mm-yy'
			});

		});
	</script>



</body>
</html>