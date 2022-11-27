package service;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import session.entity.Account;
import session.metier.AccountstlsLocal;

@WebService
public class BankService {
	@EJB
	private AccountstlsLocal metier;
	
	@WebMethod
	public Account addCompte(@WebParam(name = "acpt") Account c) {
		return metier.addCompte(c);
	}
	@WebMethod
	public List<Account> consultComptes() {
		return metier.consultComptes();
	}
	@WebMethod
	public Account consultCompte(@WebParam(name = "code") Long code) {
		return metier.consultCompte(code);
	}

	@WebMethod
	public void deposit(@WebParam(name = "code") Long code,
			@WebParam(name = "amount") double amt) {
		metier.deposit(code, amt);
	}
	
	@WebMethod
	public void withdraw(@WebParam(name = "code") Long code,
			@WebParam(name = "amount") double amt) {
		metier.withdraw(code, amt);
	}
	
	@WebMethod
	public void transfert(
			@WebParam(name = "cpt1") Long code1,
			@WebParam(name = "cpt2") Long code2,
			@WebParam(name = "amount") double amt) {
		metier.transfert(code1,code2, amt);
	}
}
