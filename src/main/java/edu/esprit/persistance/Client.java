package edu.esprit.persistance;


import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity

public class Client implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idClient;
	private String login;
	private String password;
	private String role;
	private String firstName;
	private String lastName;
	private String cin;
	private String B3;
	private String carteGrise;
	private String pictureID;
	private String statusResidence;
	private String drivingLicense;
	@OneToMany(mappedBy="client")
	private List<CinRequest> cinRequestList; 
	@OneToMany(mappedBy="client")
	private List<BirthRegistration> birthRegistrationList; 
	@OneToMany(mappedBy="client")
	private List<EDinarServiceRequest> eDinarServiceRequestList ; 
	@OneToMany(mappedBy="client")
	private List<CareerObjectiveService> careerObjectiveServiceList ; 
	@OneToMany(mappedBy="client")
	private List<Claim> ClaimList ; 
	@OneToMany(mappedBy="client")
	private List<RoadTaxService> RoadTaxServiceList  ; 
	@OneToMany(mappedBy="client")
	private List<EDianrCard>   eDianrCardList ; 
	
	
	private static final long serialVersionUID = 1L;

	public Client() {
		super();
	}   
	public Integer getIdClient() {
		return this.idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}   
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public String getCin() {
		return this.cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}   
	public String getB3() {
		return this.B3;
	}

	public void setB3(String B3) {
		this.B3 = B3;
	}   
	public String getCarteGrise() {
		return this.carteGrise;
	}

	public void setCarteGrise(String carteGrise) {
		this.carteGrise = carteGrise;
	}   
	public String getPictureID() {
		return this.pictureID;
	}

	public void setPictureID(String pictureID) {
		this.pictureID = pictureID;
	}   
	public String getStatusResidence() {
		return this.statusResidence;
	}

	public void setStatusResidence(String statusResidence) {
		this.statusResidence = statusResidence;
	}   
	public String getDrivingLicense() {
		return this.drivingLicense;
	}

	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}
   
}
