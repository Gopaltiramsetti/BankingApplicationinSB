package com.savingAccount.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savingAccount.entity.AccountDetails;
import com.savingAccount.service.AccountService;

@RestController
@RequestMapping("/demo") 
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@PostMapping("/createAccount")
	public AccountDetails createAccount(@RequestBody AccountDetails accountDetails) {
		return accountService.createAccount(accountDetails);
	}
	
	@GetMapping("/getAccountDetails/{id}")
	public  Optional< AccountDetails> getAccountDetailsById(@PathVariable long id) {
		return accountService.getAccountDetails(id);
	}
	
	@GetMapping("/getAccountDetails")
	public  List< AccountDetails> getAccountDetail() {
		return accountService.getAccountDetail();
	}

}

