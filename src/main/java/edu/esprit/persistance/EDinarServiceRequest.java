package edu.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: EDinarServiceRequest
 *
 */
@Entity

public class EDinarServiceRequest implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEdinarRequest;
	private String requestState;
	private Date requestDate;
	private Date responseDate;
	private String response;
	@ManyToOne
	private University university;
	@ManyToOne
	private EDianrCard eDinarCard ; 
	@ManyToOne
	private Client client; 
	@ManyToOne
	private TransportLine transportLine; 
	@ManyToOne
	private Employee employee ;
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	public EDianrCard geteDinarCard() {
		return eDinarCard;
	}
	public void seteDinarCard(EDianrCard eDinarCard) {
		this.eDinarCard = eDinarCard;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public TransportLine getTransportLine() {
		return transportLine;
	}
	public void setTransportLine(TransportLine transportLine) {
		this.transportLine = transportLine;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	private static final long serialVersionUID = 1L;

	public EDinarServiceRequest() {
		super();
	}   
	public Integer getIdEdinarRequest() {
		return this.idEdinarRequest;
	}

	public void setIdEdinarRequest(Integer idEdinarRequest) {
		this.idEdinarRequest = idEdinarRequest;
	}
	public String getRequestState() {
		return requestState;
	}
	public void setRequestState(String requestState) {
		this.requestState = requestState;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public Date getResponseDate() {
		return responseDate;
	}
	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
   
}
