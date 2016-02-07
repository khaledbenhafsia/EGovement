package edu.esprit.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Employee
 *
 */
@Entity

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="role")
@DiscriminatorValue(value="emp")
public class Employee implements Serializable {
	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEmployee;
	private String login;
	private String password;
	private String role;
	
	@ManyToOne
	private Etablishment etablishment ; 
	@OneToMany(mappedBy="employee")
	private List<CinRequest> cinRequestList; 
	@OneToMany(mappedBy="employee")
	private List<BirthRegistration> birthRegistrationList; 
	@OneToMany(mappedBy="employee")
	private List<EDinarServiceRequest> eDinarServiceRequestList ; 
	@OneToMany(mappedBy="employee")
	private List<CareerObjectiveService> careerObjectiveServiceList ; 
	@OneToMany(mappedBy="employee")
	private List<Claim> ClaimList ; 
	@OneToMany(mappedBy="employee")
	private List<RoadTaxService> RoadTaxServiceList; 

	private static final long serialVersionUID = 1L;
	
	public Employee() {
		super();
	}   
	public Integer getIdEmployee() {
		return this.idEmployee;
	}

	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
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
	public Etablishment getEtablishment() {
		return etablishment;
	}
	public void setEtablishment(Etablishment etablishment) {
		this.etablishment = etablishment;
	}
   
}
