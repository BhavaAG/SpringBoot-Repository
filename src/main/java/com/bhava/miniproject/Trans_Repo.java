package com.bhava.miniproject;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Trans_Repo extends JpaRepository<Transaction,Integer> {
	@Query("from Transaction where a_n.account_number=?1")
    List<Transaction> getTrans(int account_number);

}
