package com.loanapp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loanapp.entity.Loan;
import com.loanapp.repository.LoanRepo;
import com.loanapp.service.LoanService;


@Service
public class LoanServiceImpl implements LoanService{

    @Autowired
    private LoanRepo loanRepo;

    @Override
    public List<Loan> getLoanList() {
       return this.loanRepo.findAll();
    }

    @Override
    public Loan updateLoan(Loan loanData) {
        System.out.println(loanData);
        Loan loan = this.getLoanById(loanData.getLoanId());
        System.out.println(loanData.getLoanId());
        loan.setAddress(loanData.getAddress());
        loan.setLoanAadharNo(loanData.getLoanAadharNo());
        loan.setStatus(loanData.getStatus());
        loan.setLoanAccountNo(loanData.getLoanAccountNo());
        loan.setLoanAmount(loanData.getLoanAmount());
        loan.setLoanAnnualIncome(loanData.getLoanAnnualIncome());
        loan.setLoanEmail(loanData.getLoanEmail());
        loan.setLoanName(loanData.getLoanName());
        loan.setLoanPanNo(loanData.getLoanPanNo());
        loan.setLoanPhoneNo(loanData.getLoanPhoneNo());
        return this.loanRepo.save(loan);
    }

    @Override
    public Loan getLoanById(int loanId) {
       return this.loanRepo.findByLoanId(loanId);
    }
    
}
