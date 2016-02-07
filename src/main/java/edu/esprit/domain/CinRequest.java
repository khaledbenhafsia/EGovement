package edu.esprit.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CinRequest
 *
 */
@Entity

public class CinRequest implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idCinRequest;
	private String birthExcerpt;
	private String residenceCertificate;
	private String photoId;
	private String requestState;
	private Date requestDate;
	private Date responseDate;
	private String response;
	@ManyToOne
	private Citizen citizen ; 
	@ManyToOne
	private Service service  ;
	@ManyToOne
	private Agent agent;
	
	private static final long serialVersionUID = 1L;
	
	public Citizen getCitizen() {
		return citizen;
	}
	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	

	public CinRequest() {
		super();
	}   
	public Integer getIdCinRequest() {
		return this.idCinRequest;
	}

	public void setIdCinRequest(Integer idCinRequest) {
		this.idCinRequest = idCinRequest;
	}   
	public String getBirthExcerpt() {
		return this.birthExcerpt;
	}

	public void setBirthExcerpt(String birthExcerpt) {
		this.birthExcerpt = birthExcerpt;
	}   
	public String getResidenceCertificate() {
		return this.residenceCertificate;
	}

	public void setResidenceCertificate(String residenceCertificate) {
		this.residenceCertificate = residenceCertificate;
	}   
	public String getPhotoId() {
		return this.photoId;
	}

	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}   
	public String getRequestState() {
		return this.requestState;
	}

	public void setRequestState(String requestState) {
		this.requestState = requestState;
	}   
	public Date getRequestDate() {
		return this.requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}   
	public Date getResponseDate() {
		return this.responseDate;
	}

	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
	}   
	public String getResponse() {
		return this.response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
   
}
