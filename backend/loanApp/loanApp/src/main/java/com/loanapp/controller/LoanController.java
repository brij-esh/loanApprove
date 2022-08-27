package com.loanapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loanapp.entity.Loan;
import com.loanapp.service.LoanService;

@RestController
@RequestMapping("/loan")
@CrossOrigin("http://localhost:4200")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @GetMapping("/get-list")
    public List<Loan> getLoanList(){
        return this.loanService.getLoanList();
    }

    @PutMapping("/update-loan")
    public Loan updateLoan(@RequestBody Loan loanData){
        Loan loan = this.loanService.getLoanById(loanData.getLoanId());
        System.out.println(loan);
        System.out.println(loanData);
        return this.loanService.updateLoan(loanData);
    }
    
}
