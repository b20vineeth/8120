package net.xin.web.packages.framework;


import java.util.List;


public class ValidationForm {

	List<ValidationItem> item;
	boolean result;
	public Object obj;
	
	
	public List<ValidationItem> getItem() {
		return item;
	}

	public void setItem(List<ValidationItem> item) {
		this.item = item;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}




}
