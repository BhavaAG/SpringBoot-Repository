package com.bhava.miniproject;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bank_controller {
	@Autowired
	Bank_Repo obj1 ;
	
	@Autowired
	Trans_Repo a1;
	
	private final Logger LOGGER = Logger.getLogger(Bank_controller.class.getName());
	
    @PostMapping("/bank")
    public bank_account addAccount(@Valid @RequestBody bank_account a) {
	Date d = new Date();
	a.setCreated_at(d);
	a.setUpdated_at(d);
	obj1.save(a);
//	LOGGER.info("Save a bank account"+a.toString());
	return a;
	
    }
    @PostMapping("/{account_number}")
    public TransactionResponse postTransaction(@RequestBody TransactionRequest a,@PathVariable int account_number) {
    	Transaction s1=new Transaction();
    	s1.setTransaction_amount(a.getTransaction_amount());
    	s1.setTransaction_type(a.getTransaction_type());
    	Optional<bank_account> ob2=obj1.findById(account_number);
    	bank_account getobj3=ob2.get();
    	s1.setA_n(getobj3);
    	float bal1=getobj3.getBalance();
    	s1.setTransaction_amount(bal1);
    	s1.setTransaction_status("FAILURE");
    	float bal2;
    	
    	
    	if(a.getTransaction_type().equals("WITHDRAW")) {
    		bal2=bal1-s1.getTransaction_amount();
    		s1.setBalance(bal2);
    		s1.getA_n().setBalance(bal2);
    		s1.setTransaction_status("SUCCESS");
    		}
    	
		else if(a.getTransaction_type().equals("DEPOSIT")) {
			bal2=bal1+s1.getTransaction_amount();
			s1.setBalance(bal2);
    		s1.getA_n().setBalance(bal2);
    		s1.setTransaction_status("SUCCESS");
		}else {
			
			s1.setTransaction_status("FAIL");
			
			
		}
    	
		Date date= new Date();
s1.setTransaction_date(date);
s1.setCreated_at(date);
s1.setUpdated_at(date);
a1.save(s1);
TransactionResponse b1=new TransactionResponse();
b1.setTransaction_id(s1.getTransaction_id());
b1.setA_n(account_number);
b1.setTransaction_amount(s1.getTransaction_amount());
b1.setTransaction_type(s1.getTransaction_type());
b1.setBalance(s1.getBalance());
b1.setTransaction_date(s1.getTransaction_date());
b1.setTransaction_status(s1.getTransaction_status());
b1.setCreated_at(s1.getCreated_at());
b1.setUpdated_at(s1.getUpdated_at());

//LOGGER.info("Transaction /transaction/"+account_number+s1.toString());
    	return b1;
    	
}
    @GetMapping("/gettrans/{account_number}")
    public GetResponse gettransaction(@PathVariable int account_number) {
    	Optional<bank_account> ob2=obj1.findById(account_number);
    	bank_account c=ob2.get();
    	List<Transaction> z=a1.getTrans(account_number);
    	GetResponse vr=new GetResponse();
    	vr.setAccount_number(c.getAccount_number());
    	vr.setAccount_holdername(c.getAccount_holdername());
    	vr.setDob(c.getDob());
    	vr.setAccount_type(c.getAccount_type());
    	vr.setBalance(c.getBalance());
    	vr.setTransactions(z);
    	return vr;
    	
    }
}

