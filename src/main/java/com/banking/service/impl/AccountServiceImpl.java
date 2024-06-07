package com.banking.service.impl;

import org.springframework.stereotype.Service;

import com.banking.dto.AccountDTO;
import com.banking.entity.Account;
import com.banking.mapper.AccountMapper;
import com.banking.repository.AccountRepository;
import com.banking.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	private AccountRepository accountRepository;
	
	
	
	
	public AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}




	@Override
	public AccountDTO createAccountDTO(AccountDTO accountDTO) {
		Account account = AccountMapper.mapToAccount(accountDTO);
		Account savedAccount  =  accountRepository.save(account);
		
		return AccountMapper.mapToAccountDTO(savedAccount);
	}

}
