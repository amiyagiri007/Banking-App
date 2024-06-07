package com.banking.mapper;

import com.banking.dto.AccountDTO;
import com.banking.entity.Account;

public class AccountMapper {

	public static Account mapToAccount(AccountDTO accountDTO) {
		
		Account account = new Account(
				accountDTO.getId(),
				accountDTO.getAccountHolderName(),
				accountDTO.getBalance(),
				accountDTO.getAccountHolderPhoneNo(),
				accountDTO.getAccountHolderPinCode()
				
				);
		return account;
		
	}
	
	
	public static AccountDTO mapToAccountDTO(Account account) {
		
		AccountDTO accountDTO  = new AccountDTO(
				account.getId(),
				account.getAccountHolderName(),
				account.getBalance(),
				account.getAccountHolderPhoneNo(),
				account.getAccountHolderPinCode()
				);
		return accountDTO;
		
	}
}
