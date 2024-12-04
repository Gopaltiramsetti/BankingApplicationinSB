package com.savingAccount.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savingAccount.dao.AccountDao;
import com.savingAccount.entity.AccountDetails;

@Service
public class AccountService {

	@Autowired
	private AccountDao accountDao;
	public AccountDetails createAccount(AccountDetails accountDetails) {
		// TODO Auto-generated method stub
		return accountDao.createAccount(accountDetails);
	}

	public Optional< AccountDetails> getAccountDetails(long id) {
		// TODO Auto-generated method stub
		return accountDao.getAccountDetails(id);
	}

	public List<AccountDetails> getAccountDetail() {
		// TODO Auto-generated method stub
		return  accountDao.getAccountDetail();
	}
}
