package com.savingAccount.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.savingAccount.entity.AccountDetails;
@Repository
public class AccountDao {
@Autowired
private AccountRepository accountrepository;

	public AccountDetails createAccount(AccountDetails accountDetails) {
		// TODO Auto-generated method stub
		return accountrepository.save(accountDetails);
	}

	public Optional<AccountDetails> getAccountDetails(long id) {
		// TODO Auto-generated method stub
		AccountDetails accDetails= new AccountDetails();
		accDetails.setAccountNumber(id);
		
		return accountrepository.findById(id);
	}

	public List<AccountDetails> getAccountDetail() {
		// TODO Auto-generated method stub
		//AccountDetails accDetails= new AccountDetails();
		return accountrepository.findAll();
	}

}
