package session.metier;

import java.util.List;

import javax.ejb.Remote;

import session.entity.Account;

@Remote
public interface AccountstlsRemote {
	public Account addCompte(Account c);
	public List<Account> consultComptes();
	public Account consultCompte(Long code);
	public void deposit(Long code,double montant);
	public void withdraw(Long code,double montant);
	public void transfert(Long code1, Long code2, double montant);

}
