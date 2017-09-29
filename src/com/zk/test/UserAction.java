package com.zk.test;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public String add(){
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		return SUCCESS;
	}
	
	public String addError(){
		if(name==null||!name.equals("admin")){
			this.addFieldError("name", "name is error");
			return ERROR;
		}
		return SUCCESS;
	}

}
