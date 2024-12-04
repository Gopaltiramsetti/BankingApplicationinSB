package com.savingAccount.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savingAccount.entity.AccountDetails;

public interface AccountRepository extends JpaRepository<AccountDetails, Long>{}
