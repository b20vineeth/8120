package net.xin.web.packages.framework;

public class ValidationItem {
	
	private String dataInput;
	private String id;
	private String value;
	private boolean result=true;
	private String ids;
	private String msg;
	private boolean isUnique=false;
	
	
	public boolean isUnique() {
		return isUnique;
	}
	public void setUnique(boolean isUnique) {
		this.isUnique = isUnique;
	}
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getDataInput() {
		return dataInput;
	}
	public void setDataInput(String dataInput) {
		this.dataInput = dataInput;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	
	
	
}
