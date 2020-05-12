package com.javatpoint;

 
import javax.ejb.Remote;  
@Remote  
public interface BankRemote {  
    boolean withdraw(int amount);  
    void deposit(int amount);  
    int getBalance();  
}  