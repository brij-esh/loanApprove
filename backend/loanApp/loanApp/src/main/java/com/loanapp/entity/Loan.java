package com.loanapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer_table")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Loan {
	
    @Id
    private int loanId;
	private String loanName;
	private String loanEmail;
	private String loanAccountNo;
	private String loanPhoneNo;
	private String loanAadharNo;
	private String loanPanNo;
	private String loanType;
	private String loanAmount;
	private String loanAnnualIncome;
	private String address;
	private String status;
    
}
