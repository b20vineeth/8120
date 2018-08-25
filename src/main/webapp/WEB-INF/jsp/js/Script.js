var html="";  var JSONObject ;  var page=[]; var loadedPage=0;
callMenu(); $(document).ready(function() {   loadbody(html); callURL() }); function bodyLoad() { callMenu(); }


function callURL()
{
	url=window.location.href;
	url=url.split('#');
	if(url[1]!='')
	{
		if($('#'+url[1]).attr('values')!="")
		{goToPage($('#'+url[1]).attr('values'));
		}
	}
	
}
 
function callMenu()
 {
	 
	
	 
   $.ajax({url: "/getmenu?url=getmenu", success: function(result){
	  JSONObject = JSON.parse(result); 
	 	iterates(0); 
		  html =" <div class='navbar-default sidebar' role='navigation'>  <div class='sidebar-nav navbar-collapse'> "
		 +"  <ul class='nav' id='side-menu'> <li class='sidebar-search'>  <div class='input-group custom-search-form'>      <input type='text' class='form-control' placeholder='Search...'>      <span class='input-group-btn'> "      
		 +"  <button class='btn btn-default' type='button'>              <i class='fa fa-search'></i>          </button>     "
		 +"  </span>  </div>  <!-- /input-group --> </li> <li>  <a href='/admins/'><i class='fa fa-dashboard fa-fw orange'></i> Dashboard</a> </li> "+html+  "</ul></div>  </div>";                       
   
	 	 
        
    }});
	 
 }
function countMenu(id)
{
   var count=0;
   for (var key in JSONObject) 
 	{
	 
     if(JSONObject[key]["menuParrent"]==id)
	 {
		
	   count++;
	 }
   } 
 return count;
}
 function iterates(value)
 {
	
	if(countMenu(value)>0 && value!=0)
     {
		  html+="<ul class='nav nav-second-level'>";
	 } 
    for (var key in JSONObject) 
	{
	var count=0;
	 
     if(JSONObject[key]["menuParrent"]==value)
	 { 
		count=countMenu(JSONObject[key]["menuId"]);
		html+="<li>  <a href='#"+JSONObject[key]["menuLink"]+"'";
		html+="  id='"+JSONObject[key]["menuLink"]+"'";
		html+="  values='"+JSONObject[key]["menuId"]+"'";
		if(count==0)
		{
		  html+="onclick='goToPage("+JSONObject[key]["menuId"]+")'";
		}
		
		html+=">"+JSONObject[key]["menuFavicon"]+" &nbsp; "+JSONObject[key]["menuName"] ;
		
		
		if(JSONObject[key]["itemCount"]=='Y')
		{
			html+=" &nbsp; <span id='itemCount' class='red'>(0)</span>";
		}
		if(count>0)
		{
			html+='<span class="fa arrow"></span>';
		}
		html+="</a>";
         iterates(JSONObject[key]["menuId"]);
	     html+="</li>";
		 
	 }
	
	
   }
    if(countMenu(value)>0 && value!=0)
	 {
		  html+="</ul>";
	 }
   
 }
 function goToPage(value)
 {
	 invokePageLoad();
	loadPage(value);
	 

}
 function invokePageLoad()
 {
	 
	 $('#contentBody').html("<div class='bodyCenter'><i class='fa fa-spinner fa-spin blue' style='font-size:35px'></i></div>")
	
 }
  function loadbody(html)
 { 
	$('#htmlBody').html(" <div id='wrapper'>  <!-- Navigation --> <nav class='navbar navbar-default navbar-static-top' role='navigation' style='margin-bottom: 0'>          <div class='navbar-header'>              <button type='button' class='navbar-toggle' data-toggle='collapse' data-target='.navbar-collapse'>                  <span class='sr-only'>Toggle navigation</span>                  <span class='icon-bar'></span>                  <span class='icon-bar'></span>                  <span class='icon-bar'></span>              </button>              <a class='navbar-brand' href='#' ><span id='Courierz'>Courier</span></a>          </div>          <!-- /.navbar-header -->      <ul class='nav navbar-top-links navbar-right' >                           <li class='dropdown'>                  <a class='dropdown-toggle' data-toggle='dropdown' href='#'>                      <i class='fa fa-user fa-fw'></i> <i class='fa fa-caret-down'></i>                  </a>                  <ul class='dropdown-menu dropdown-user'>                      <li><a href='#'><i class='fa fa-user fa-fw'></i> User Profile</a>                      </li>                                            <li class='divider'></li>                      <li><a href='login.html'><i class='fa fa-sign-out fa-fw'></i> Logout</a>                      </li>                  </ul>                  <!-- /.dropdown-user -->              </li>              <!-- /.dropdown -->          </ul>          <!-- /.navbar-top-links -->  "+html+"                   <!-- /.navbar-static-side -->      </nav>  <div id='page-wrapper'> <div id='contentBody'></div></div>      <!-- /#page-wrapper --></div>");	
	
 } 
 function loadPage(value)
 {
	 loadedPage=value;
	// console.log(page);
	 if(page[loadedPage]!=undefined)
		 pages=page[loadedPage];
	 else
		pages=0; 
	  $("#contentBody").html("<div style='padding-top:4%;'><div id='pages'></div></div>");
	  $("#pages").load("Pages.php?loadPage="+value+"&page="+ pages);
 }
 function goPage(val)
 {
	 
	  page[loadedPage]=val;
	 loadPage(loadedPage);
	   
 }
 
 