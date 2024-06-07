package com.banking.service;

import com.banking.dto.AccountDTO;

public interface AccountService {

	AccountDTO createAccount(AccountDTO accountDTO);
	
	AccountDTO getAccountById(Long id);
}
