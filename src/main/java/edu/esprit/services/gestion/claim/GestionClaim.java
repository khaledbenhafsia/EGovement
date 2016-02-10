package edu.esprit.services.gestion.claim;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.esprit.domain.Citizen;
import edu.esprit.domain.Claim;
import edu.esprit.domain.Employee;

/**
 * Session Bean implementation class GestionClaim
 */
@Stateless
public class GestionClaim implements GestionClaimLocal , GestionClaimRemote {
	@PersistenceContext(unitName="E-Goverment")
	EntityManager entityManager;
   
    public GestionClaim() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addClaim(Claim claim) {
		try {
			entityManager.persist(claim);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteClaim(Claim claim) {
		try {
			entityManager.remove(entityManager.merge(claim));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean updateClaim(Claim claim) {
		try {
			entityManager.merge(claim);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	@Override
	public List<Claim> findClaimsBySubject(String subject) {
		Query query=entityManager.createQuery(""
				+ "select e from Claim e WHERE e.subject = :subject");
		query.setParameter("subject", subject);
		try {
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Claim> findAllClaim() {
		Query query=entityManager.createQuery("select e from Claim e");
		try {
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Claim> findClaimsByState(String state) {
		Query query=entityManager.createQuery(""
				+ "select e from Claim e WHERE e.state = :state");
		query.setParameter("state", state);
		try {
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Claim> findClaimsByCitizen(Citizen citizen) {
		Query query=entityManager.createQuery(""
				+ "select e from Claim e WHERE e.citizen = :citizen");
		query.setParameter("citizen", citizen.getIdClient());
		try {
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Claim> findClaimsByAgent(Employee employee) {
		Query query=entityManager.createQuery(""
				+ "select e from Claim e WHERE e.employee = :employee");
		query.setParameter("employee", employee.getIdEmployee());
		try {
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}

}
