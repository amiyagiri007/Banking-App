package com.banking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.dto.AccountDTO;
import com.banking.service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
private AccountService accountService;

public AccountController(AccountService accountService) {
	super();
	this.accountService = accountService;
}

//Add Account REST API
@PostMapping
public ResponseEntity<AccountDTO> addAccount(@RequestBody  AccountDTO accountDTO){
		return new ResponseEntity<>(accountService.createAccount(accountDTO),HttpStatus.CREATED);
}

}
