package com.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class AccountDTO {

	private Long id;
private String accountHolderName;
private double balance;
private Long accountHolderPhoneNo;
private Long accountHolderPinCode;

public AccountDTO(long id, String accountHolderName, double balance,
		long accountHolderPhoneNo, long accountHolderPinCode) {
	super();
	this.id = id;
	this.accountHolderName = accountHolderName;
	this.balance = balance;
	this.accountHolderPhoneNo = accountHolderPhoneNo;
	this.accountHolderPinCode = accountHolderPinCode;
}






}
