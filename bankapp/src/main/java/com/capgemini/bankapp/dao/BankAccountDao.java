package com.capgemini.bankapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.bankapp.entity.BankAccount;

@Repository
public interface BankAccountDao extends JpaRepository<BankAccount, Integer> {

}
