package session.metier;

import java.util.List;

import javax.ejb.Local;

import session.entity.Account;


@Local
public interface AccountstlsLocal {
	public Account addCompte(Account c);
	public List<Account> consultComptes();
	public Account consultCompte(Long code);
	public void deposit(Long code,double montant);
	public void withdraw(Long code,double montant);
	public void transfert(Long code1, Long code2, double montant);
}
