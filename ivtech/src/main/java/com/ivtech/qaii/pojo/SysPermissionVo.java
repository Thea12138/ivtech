package com.ivtech.qaii.pojo;

public class SysPermissionVo {
	
	
    private Integer id;//主键.
    private String text;//名称.
    private String parent;//资源路径.
    private Boolean state;//状态 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text== null ? null :text.trim();
	}
	
	
	
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent== null ? null :parent.trim();
	}
	public Boolean getState() {
		return state;
	}
	public void setState(Boolean state) {
		this.state = state;
	}



}