package com.banking.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AccountDTO {

	private Long id;
private String accountHolderName;
private double balance;
private Long accountHolderPhoneNo;
private long accountHolderPinCode;
}
