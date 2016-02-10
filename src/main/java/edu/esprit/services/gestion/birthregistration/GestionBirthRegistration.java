package edu.esprit.services.gestion.birthregistration;

import java.util.List;

import javax.ejb.Stateless;

import edu.esprit.domain.BirthRegistration;

/**
 * Session Bean implementation class GestionBirthRegistration
 */
@Stateless
public class GestionBirthRegistration implements GestionBirthRegistrationRemote, GestionBirthRegistrationLocal {

    /**
     * Default constructor. 
     */
    public GestionBirthRegistration() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addBirthRegistration(BirthRegistration birthRegistration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteBirthRegistration(BirthRegistration birthRegistration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateBirthRegistration(BirthRegistration birthRegistration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BirthRegistration> findAllBirthRegistration() {
		// TODO Auto-generated method stub
		return null;
	}

}
