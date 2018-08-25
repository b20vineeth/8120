<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Privilege</title>
</head>
<script src="/vendor/resources/js/ValidateScreen.js"></script>
<script>
	var menuList = ${menus};
	 
</script>
<body>


 












<div id="MenuList"></div>
	 	<style>
.tree, .tree ul {
	margin: 0;
	padding: 0;
	list-style: none
}

.tree ul {
	margin-left: 1em;
	position: relative
}

.tree ul ul {
	margin-left: .5em
}

.tree ul:before {
	content: "";
	display: block;
	width: 0;
	position: absolute;
	top: 0;
	bottom: 0;
	left: 0;
	border-left: 1px solid
}

.tree li {
	margin: 0;
	padding: 0 1em;
	line-height: 2em;
	color: green;;
	 
	position: relative
}

.tree ul li:before {
	content: "";
	display: block;
	width: 10px;
	height: 0;
	border-top: 1px solid;
	margin-top: -1px;
	position: absolute;
	top: 1em;
	left: 0
}

.tree ul li:last-child:before {
	background: #fff;
	height: auto;
	top: 1em;
	bottom: 0
}

.indicator {
	margin-right: 5px;
}

.tree li a {
	text-decoration: none;
	color: #369;
}

.tree li button, .tree li button:active, .tree li button:focus {
	text-decoration: none;
	color: #369;
	border: none;
	background: transparent;
	margin: 0px 0px 0px 0px;
	padding: 0px 0px 0px 0px;
	outline: 0;
}
</style>
	<script>
		$(document).ready(function() {
			htmls = "   ";
			callMenus();
		});
		$.fn
				.extend({
					treed : function(o) {

						var openedClass = 'glyphicon-minus-sign';
						var closedClass = 'glyphicon-plus-sign';

						if (typeof o != 'undefined') {
							if (typeof o.openedClass != 'undefined') {
								openedClass = o.openedClass;
							}
							if (typeof o.closedClass != 'undefined') {
								closedClass = o.closedClass;
							}
						}
						;

						//initialize each of the top levels
						var tree = $(this);
						tree.addClass("tree");
						tree
								.find('li')
								.has("ul")
								.each(
										function() {
											var branch = $(this); //li with children ul
											branch
													.prepend("<i class='indicator glyphicon " + closedClass + "'></i>");
											branch.addClass('branch');
											branch
													.on(
															'click',
															function(e) {
																if (this == e.target) {
																	var icon = $(
																			this)
																			.children(
																					'i:first');
																	icon
																			.toggleClass(openedClass
																					+ " "
																					+ closedClass);
																	$(this)
																			.children()
																			.children()
																			.toggle();
																}
															})
											branch.children().children()
													.toggle();
										});
						//fire event from the dynamically added icon
						tree.find('.branch .indicator').each(function() {
							$(this).on('click', function() {
								$(this).closest('li').click();
							});
						});
						//fire event to open branch if the li contains an anchor instead of text
						tree.find('.branch>a').each(function() {
							$(this).on('click', function(e) {
								$(this).closest('li').click();
								e.preventDefault();
							});
						});
						//fire event to open branch if the li contains a button instead of text
						tree.find('.branch>button').each(function() {
							$(this).on('click', function(e) {
								$(this).closest('li').click();
								e.preventDefault();
							});
						});
					}
				});

		 
		function callMenus() {

			var dataItem = JSON.stringify(menuList)
			JSONObject = JSON.parse(dataItem);
			console.log("HI");
			iteratess(0);
			htmls = "  <ul id='tree1'>" + htmls + "</ul>";

			$('#MenuList').html(htmls);
			$('#tree1').treed();

			$('#tree2').treed({
				openedClass : 'glyphicon-folder-open',
				closedClass : 'glyphicon-folder-close'
			});

			$('#tree3').treed({
				openedClass : 'glyphicon-chevron-right',
				closedClass : 'glyphicon-chevron-down'
			});

		}

		function countMenus(id) {
			var count = 0;
			for ( var key in JSONObject) {

				if (JSONObject[key]["menuParrent"] == id) {

					count++;
				}
			}
			return count;
		}

		function iteratess(value) {

			if (countMenus(value) > 0 && value != 0) {
				htmls += "<ul>";
			}
			for ( var key in JSONObject) {
				var count = 0;

				if (JSONObject[key]["menuParrent"] == value) {
					count = countMenus(JSONObject[key]["menuId"]);
					htmls += "<li>  &nbsp;&nbsp; <a  ";
					htmls += "  id='" + JSONObject[key]["menuLink"] + "'";
					htmls += "  values='" + JSONObject[key]["menuId"] + "'";
					
					htmls += ">" +   " &nbsp; "
							+ JSONObject[key]["menuName"];

					 
					if (count > 0) {
						htmls += '&nbsp;<span class="fa arrow"></span>';
					}
					else
						{
							htmls += ' &nbsp;<span onClick="deleteMenu('+JSONObject[key]["menuId"]+')" class="glyphicon glyphicon-trash" style="font-size:12px" title="Delete"></span>';
						}
					htmls += "</a> ";
					 if(value==0)
						 htmls += '<span class="glyphicon glyphicon-plus" style="font-size:12px"  title="Add"></span>';
						 
					iteratess(JSONObject[key]["menuId"]);
					htmls += "</li>";

				}

			}
			if (countMenus(value) > 0 && value != 0) {
				htmls += "</ul>";
			}

		}
		function deleteMenu(id)
		{
			alert(id);
		}
	</script>
</body>
</html>