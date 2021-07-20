package com.bhava.miniproject;
import java.util.Date;
public class TransactionResponse {
    private int transaction_id;
	private int a_n;
    private float transaction_amount;
	private String transaction_type;
    private float balance;
	private Date transaction_date;
	private String transaction_status;
	private Date created_at;
	private Date updated_at;
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public int getA_n() {
		return a_n;
	}
	public void setA_n(int a_n) {
		this.a_n = a_n;
	}
	public float getTransaction_amount() {
		return transaction_amount;
	}
	public void setTransaction_amount(float transaction_amount) {
		this.transaction_amount = transaction_amount;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public Date getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}
	public String getTransaction_status() {
		return transaction_status;
	}
	public void setTransaction_status(String transaction_status) {
		this.transaction_status = transaction_status;
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
	
	

}
