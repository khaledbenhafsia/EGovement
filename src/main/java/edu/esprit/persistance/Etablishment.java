package edu.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Etablishment
 *
 */
@Entity

public class Etablishment implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEtablishment;
	private String name;
	private String location;
	private String description;
	private String contact;
	private Integer phonenumber;
	@OneToMany(mappedBy="etablishment")
	private List<Employee> listEmployees; 
	@OneToMany(mappedBy="etablishment")
	private List<Service> listService; 
	private static final long serialVersionUID = 1L;

	public Etablishment() {
		super();
	}   
	public Integer getIdEtablishment() {
		return this.idEtablishment;
	}

	public void setIdEtablishment(Integer idEtablishment) {
		this.idEtablishment = idEtablishment;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}   
	public Integer getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(Integer phonenumber) {
		this.phonenumber = phonenumber;
	}
   
}
