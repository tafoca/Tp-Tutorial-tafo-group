package session.metier;

import java.util.List;

import javax.ejb.Remote;

import session.entity.Customer;

@Remote
public interface CustomerStlsRemote {
	public Customer addCustomer(Customer c);
	public List<Customer> consultCustomers();
	public Customer consultCustomer(Integer code);
}
