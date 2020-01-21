package com.mkyong.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TestCase")
public class TestCase {

	private String id;
	private String name;
	private String result;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	

}
