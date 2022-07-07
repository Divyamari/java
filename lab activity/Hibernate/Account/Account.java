package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="acc_details")
@Entity
public class Account {
@Column(length=20,unique=true)
private long accountNo;
@Column(length=20)
private String accountHolderName;
private double accBalance;
@Column(length=20)
private String accType;
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public double getAccBalance() {
	return accBalance;
}
public void setAccBalance(double accBalance) {
	this.accBalance = accBalance;
}
public String getAccType() {
	return accType;
}
public void setAccType(String accType) {
	this.accType = accType;
}
}
