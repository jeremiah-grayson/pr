package com.cg.payroll.dto;

public class BankDetails 
{
    int accountNumber;
    String bankName;
    String ifscCode;
    
    public BankDetails() 
    {
		// TODO Auto-generated constructor stub
	}
    
    public BankDetails(int accountNumber, String bankName, String ifscCode) 
    {
        super();
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.ifscCode = ifscCode;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getIfscCode() {
        return ifscCode;
    }
    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }
    
}