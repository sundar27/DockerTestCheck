package com.Connector.triggerdetails.model;

public class jSONModel {
	private String object_kind;
	private String before;
	private String after;
	private String ref;
	public jSONModel(String object_kind, String before, String after, String ref) {
		super();
		this.object_kind = object_kind;
		this.before = before;
		this.after = after;
		this.ref = ref;
	}
	public jSONModel() {
		super();
	}
	public String getObject_kind() {
		return object_kind;
	}
	public void setObject_kind(String object_kind) {
		this.object_kind = object_kind;
	}
	public String getBefore() {
		return before;
	}
	public void setBefore(String before) {
		this.before = before;
	}
	public String getAfter() {
		return after;
	}
	public void setAfter(String after) {
		this.after = after;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	
}
