package org.ls.poi;

public class Entity {
	private String name;
	private String data;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Entity [name=" + name + ", data=" + data + "]";
	}
	
 
}
