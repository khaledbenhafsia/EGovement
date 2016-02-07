package edu.esprit.domain;

import edu.esprit.domain.Employee;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Agent
 *
 */
@Entity
@DiscriminatorValue(value="agent")
public class Agent extends Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	public Agent() {
		super();
	}
	   
}
