package com.bhava.miniproject;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
/*
 * Request object for do transaction
 */
public class TransactionRequest {

	@Min(1)
	@NotNull
	private float transaction_amount;
	
	@NotNull
	@Pattern(regexp = "WITHDRAWAL|DEPOSIT")
	private String transaction_type;

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
	
	
	
}
