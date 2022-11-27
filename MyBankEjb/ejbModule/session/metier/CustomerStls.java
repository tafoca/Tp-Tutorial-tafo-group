package session.metier;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import session.entity.Customer;

/**
 * Session Bean implementation class CustomerStls
 */
@Stateless(name = "BK")
public class CustomerStls implements CustomerStlsRemote, CustomerStlsLocal {
	@PersistenceContext(unitName = "MyBankEjb")
	EntityManager em;
    /**
     * Default constructor. 
     */
    public CustomerStls() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Customer addCustomer(Customer c) {
		em.persist(c);
		return c;
	}

	@Override
	public List<Customer> consultCustomers() {
		Query req = em.createQuery("select c from Customer c");
		return req.getResultList();
	}

	@Override
	public Customer consultCustomer(Integer code) {
		Customer c = em.find(Customer.class, code);
		if(c == null) throw new RuntimeException("Customer unexisting"); 
		return c;
	}

}
