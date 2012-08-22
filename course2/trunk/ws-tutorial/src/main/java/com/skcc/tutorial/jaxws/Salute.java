package com.skcc.tutorial.jaxws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="salute")
public class Salute {
	private String salute;
	private String name;
	public Salute(){
	}
	public Salute(String salute, String name) {
		super();
		this.salute = salute;
		this.name = name;
	}
	public String getSalute() {
		return salute;
	}
	public void setSalute(String salute) {
		this.salute = salute;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
