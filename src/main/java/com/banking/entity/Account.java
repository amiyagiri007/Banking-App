package com.banking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
	@Column(name = "account_holder_name")
private String accountHolderName;
private double balance;
private Long accountHolderPhoneNo;
private long accountHolderPinCode;





public Account(Long id, String accountHolderName, double balance,
		Long accountHolderPhoneNo, long accountHolderPinCode) {
	super();
	this.id = id;
	this.accountHolderName = accountHolderName;
	this.balance = balance;
	this.accountHolderPhoneNo = accountHolderPhoneNo;
	this.accountHolderPinCode = accountHolderPinCode;
}


public Account() {
	System.out.println("Account constructor called");
}
public Long getId() {
	return id;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public double getBalance() {
	return balance;
}
public Long getAccountHolderPhoneNo() {
	return accountHolderPhoneNo;
}
public long getAccountHolderPinCode() {
	return accountHolderPinCode;
}
public void setId(Long id) {
	this.id = id;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public void setAccountHolderPhoneNo(Long accountHolderPhoneNo) {
	this.accountHolderPhoneNo = accountHolderPhoneNo;
}
public void setAccountHolderPinCode(long accountHolderPinCode) {
	this.accountHolderPinCode = accountHolderPinCode;
}



}
