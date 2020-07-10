package com.ayalacon.modelo;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Date create_date;
	private String email;
	private String last_name;
	private String first_name;
	private Date photo;
	private Region regionId;

	public Cliente() {
		super();
	}

	public Cliente(Integer id, Date create_date, String email, String last_name, String first_name, Date photo,
			Region regionId) {
		super();
		this.id = id;
		this.create_date = create_date;
		this.email = email;
		this.last_name = last_name;
		this.first_name = first_name;
		this.photo = photo;
		this.regionId = regionId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public Date getPhoto() {
		return photo;
	}

	public void setPhoto(Date photo) {
		this.photo = photo;
	}

	public Region getRegionId() {
		return regionId;
	}

	public void setRegionId(Region regionId) {
		this.regionId = regionId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
