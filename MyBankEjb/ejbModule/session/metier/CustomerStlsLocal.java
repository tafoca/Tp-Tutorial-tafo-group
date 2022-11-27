package session.metier;

import java.util.List;

import javax.ejb.Local;

import session.entity.Customer;

@Local
public interface CustomerStlsLocal {
	public Customer addCustomer(Customer c);
	public List<Customer> consultCustomers();
	public Customer consultCustomer(Integer code);
}
