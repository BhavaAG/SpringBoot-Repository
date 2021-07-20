package com.bhava.miniproject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetResponse {
    private int account_number;
	private String account_holdername;
	private String dob;
	private String account_type;
	private float balance;
	@JsonIgnoreProperties(value={"a_n", "hibernateLazyInitializer"})
	private List<Transaction> transactions;
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getAccount_holdername() {
		return account_holdername;
	}
	public void setAccount_holdername(String account_holdername) {
		this.account_holdername = account_holdername;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	

}
