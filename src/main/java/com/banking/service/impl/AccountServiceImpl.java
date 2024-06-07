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
	public AccountDTO createAccount(AccountDTO accountDTO) {
		Account account = AccountMapper.mapToAccount(accountDTO);
		Account savedAccount  =  accountRepository.save(account);
		
		return AccountMapper.mapToAccountDTO(savedAccount);
	}




	@Override
	public AccountDTO getAccountById(Long id) {
		
		Account account  = accountRepository
						.findById(id)
						.orElseThrow(() -> new RuntimeException("Account does not exists"));
		return AccountMapper.mapToAccountDTO(account);
	}

}
