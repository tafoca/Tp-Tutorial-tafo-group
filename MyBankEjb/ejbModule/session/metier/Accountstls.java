package session.metier;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import session.entity.Account;
import session.entity.Customer;

/**
 * Session Bean implementation class Accountstls
 */
@Stateless(name = "BK2")
public class Accountstls implements AccountstlsRemote, AccountstlsLocal {
	@PersistenceContext(unitName = "MyBankEjb")
	EntityManager em;
    /**
     * Default constructor. 
     */
    public Accountstls() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Account addCompte(Account c) {
		em.persist(c);
		return c;
	}

	@Override
	public List<Account> consultComptes() {
		Query req = em.createQuery("select a from Account a");
		List resultList = req.getResultList();
		return resultList;
	}

	@Override
	public Account consultCompte(Long code) {
		Account a = em.find(Account.class, code);
		if(a == null) throw new RuntimeException("Account unexisting"); 
		return a;
	}

	@Override
	public void deposit(Long code, double montant) {
		Account a = consultCompte(code);
		a.setSolde(a.getSolde() + montant);
		
	}

	@Override
	public void withdraw(Long code, double montant) {
		Account a = consultCompte(code);
		a.setSolde(a.getSolde() - montant);
		
	}

	@Override
	public void transfert(Long code1, Long code2, double montant) {
		withdraw(code1, montant);
		deposit(code2, montant);
	}

}
