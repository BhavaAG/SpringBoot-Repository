package com.bhava.miniproject;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class bank_account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int account_number;
	private String account_holdername;
	private String dob;
	private String account_type;
	private float transaction_fee;
	
	@JsonProperty("initaldeposit")
	@JsonAlias("balance")
	
	private float balance;
	private Date created_at;
	private Date updated_at;
	@JsonIgnore
	@OneToMany(mappedBy = "a_n",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Transaction> transactions = new HashSet<>();
	
	public Set<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
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
	public float getTransaction_fee() {
		return transaction_fee;
	}
	public void setTransaction_fee(float transaction_fee) {
		this.transaction_fee = transaction_fee;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}

}
