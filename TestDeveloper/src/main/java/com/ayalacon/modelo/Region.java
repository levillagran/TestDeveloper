package com.ayalacon.modelo;

import java.io.Serializable;

public class Region implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String short_name;

	public Region() {
		super();
	}

	public Region(Integer id, String name, String short_name) {
		super();
		this.id = id;
		this.name = name;
		this.short_name = short_name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShort_name() {
		return short_name;
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}

}
