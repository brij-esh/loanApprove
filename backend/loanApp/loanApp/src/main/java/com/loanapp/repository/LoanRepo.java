package com.loanapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loanapp.entity.Loan;

@Repository
public interface LoanRepo extends JpaRepository<Loan,Integer>{

    Loan findByLoanId(int loanId);
}
