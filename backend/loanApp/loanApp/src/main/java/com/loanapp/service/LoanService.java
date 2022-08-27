package com.loanapp.service;

import java.util.List;

import com.loanapp.entity.Loan;

public interface LoanService {
    public List<Loan> getLoanList();

    public Loan updateLoan(Loan loanData);

    public Loan getLoanById(int loanId);
}
