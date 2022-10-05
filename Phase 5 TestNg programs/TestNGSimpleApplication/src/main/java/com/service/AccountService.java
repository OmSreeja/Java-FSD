package com.service;

import com.bean.Account;
import com.dao.AccountDao;

public class AccountService {
	AccountDao ad = new AccountDao();
	public String createAccount(Account account) {
		
		if(account.getAmount()<500) {
			return "Min amount must be 500";
		}else if(ad.createAccount(account)>0){
			return "Account created";
		}else {
			return "Account didn't create";
		}
	}
	
	public String findBalance(int accno) {
		float balanceAmount =ad.findBalance(accno);
		if(balanceAmount>=0)
		{ 
			return "Your account balance is "+balanceAmount;
	    }if(balanceAmount==-1) {
	    	return "Account number doesn't exist";
	    }else {
	    	return "Exception generated";
	    }
		
		
	}
	public String withdrawn(Account account) {
		float balanceAmount=ad.findBalance(account.getAccno());
		if(balanceAmount==-1) {
			return "Invalid account humber";
		}
		else if(balanceAmount-account.getAmount()>500) {
			if(ad.withdrawn(account)>0) {
				return "Withdrawn done successfully";
			}else {
				return "Didn,t withdrawn";
			}
			
		}else {
		return "You can't withdraw maintain min 500";}
	}
	public String deposit(Account account) {
		if(account.getAmount()>50000) {
			return "you can't deposit 50000 at time";
		}else if(ad.deposit(account)>0) {
			return "Deposit done successfully";
		}else {
		return "You can't deposit";}
	}
}