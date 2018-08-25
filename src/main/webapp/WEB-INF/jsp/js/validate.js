var ALBHANUM= /^[a-zA-Z0-9]{2,30}$/;
var URL=/^[a-zA-Z0-9_-]{2,30}$/;
var ALBHACOMMASPACE= /^[a-zA-Z0-9-,_ ]*$/;
var THUMB=/^(http(s?):)|([/|.|\w|\s])*\.(?:jpg|gif|png)$/
var result=true;
var html="";
var response=[];
var checkBoxNames=[];
function validateField (content)
{ 
	  erroMessage=$(content).attr('data-parsley-errors-container');
	 
 if($(content).attr('data_minWord')>$(content).val().length)
 {
	 result=false;html="Strength is Poor";
 }
 else if($(content).attr('data_maxWord')>0 && $(content).attr('data_maxWord')<$(content).val().length)
 {
	  result=false;html="Strength is too long";
 }
 else if (validateRegex(getRegex(content),content)) {
	 
        result= true;
		 
 }
   else {
	  html=$(content).attr('data_keyError');
        result=false;
    }
	 
	if(result)
	{
		
		$(erroMessage).html(""); 
		return "true";
	}
	else
	{
		 $(erroMessage).html(html);
		 return "false";
	}
 
}
function getRegex(content)
{ 
	if($(content).attr('data_key')=='ALBHANUM')
	{ return ALBHANUM;
	}
	else if($(content).attr('data_key')=='URL')
	{
		return URL;
	}
	else if($(content).attr('data_key')=='ALBHACOMMASPACE')
	{
		return ALBHACOMMASPACE;
	}
	else if($(content).attr('data_key')=='THUMB')
	{
		return THUMB;
	}
	else
	{
		return "NO";
	}

}
function validateRegex(regex,content)
{
  if(regex!='NO')
  {
	if (regex.test($(content).val())) {
        return true;
    }
    else {
		 return false;
		
    }
  }
  else
  {  return true;}
}
 function validateCheckBox(checkbox)
 {
	var resp=true;
	for(let i = 0;i < checkbox.length; i++)
	{
		 
		if($('#'+checkbox[i]+':checked').length < $('#'+checkbox[i]).attr('data-parsley-mincheck'))
		{
			if(resp==true)
				resp=false;
		   $('#'+checkbox[i]+'_errId6').html('Please Select atleast '+$('#'+checkbox[i]).attr('data-parsley-mincheck')+" item");
		}
		else if($('#'+checkbox[i]+':checked').length > $('#'+checkbox[i]).attr('data-parsley-maxcheck'))
		{
			if(resp==true)
				resp=false;
			 $('#'+checkbox[i]+'_errId6').html('Maximum  '+$('#'+checkbox[i]).attr('data-parsley-maxcheck')+" only Allowed");
		}
		else{$('#'+checkbox[i]+'_errId6').html('');
		}
		
	} 
  return resp;
	 
 }
 function serverValidate(content)
 {
	 
 }
 
$("#Save").click(function(){
	 
	 var res=false;
	  response=[];
  checkBoxNames=[];
 var serverValidationList=[];
  $('#form input,#form textarea').each(function(key, value) {
   
   res=validateField(this);
    response.push(res);
	 
	 if($(this).attr('data_Server')!=undefined && $(this).attr('data_Server')!="")
	 {
		 serverValidationList.push($(this).attr('data_Server')+"||"+this.id+"||"+$(this).val());
	 }
	 
});  
	$("#form input:checkbox").each(function() {
	 checkBoxNames.push(this.id);
	 });
	 
	if(checkBoxNames.length>0)
		response.push(validateCheckBox(removeDuplicates(checkBoxNames)));
	result=$.inArray('false',response)>-1;
	 
   if(result) 
	{
		 
	}
	else
	{
		 
		 if(serverValidationList.length>0)
		{
			data= "data="+JSON.stringify(serverValidationList);
			 $.ajax({
            type:'POST',
            url: '?url=validate',
			dataType: 'json',
            data: data ,
            success: function (data) {
              $.each(data, function(index, element) {
				if(element.result==1)
				{
					urls=$('#Save').attr('buttn-action');
					datas="data="+JSON.stringify($('#form').serializeArray());
					   console.log(element.result)
				  postdata(datas);
				}	
				else
				{
					$($('#'+element.id).attr('data-parsley-errors-container')).html('Already Exist');
				}
          
			  }); 
            } 
            
           }); 
		   
		    
		}
		else
		{
			//alert("FAIL");
		} 
	} 
 
});
function postdata(datas)
{
	   $.ajax({
            type:'POST',
            url: $('#Save').attr('buttn-action'),
			 data: datas ,
			success: function (data) {
              console.log(data);
            } 
            
           }); 
	 
 
}

function removeDuplicates(arr){
    let unique_array = []
    for(let i = 0;i < arr.length; i++){
        if(unique_array.indexOf(arr[i]) == -1){
            unique_array.push(arr[i])
        }
    }
    return unique_array
}