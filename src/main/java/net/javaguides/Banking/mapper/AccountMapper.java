package net.javaguides.Banking.mapper;

import org.springframework.beans.factory.annotation.Autowired;

import net.javaguides.Banking.dto.AccountDto;
import net.javaguides.Banking.entity.Account;

public class AccountMapper {
	@Autowired
	AccountDto accountDto;
public static Account maptoAccount(AccountDto accountDto) {
	Account account = new Account(
			accountDto.getId(),
			accountDto.getAccountHolderName(),
			accountDto.getBalance()
			);
return	 account;		
}
public static AccountDto maptoAccountDto(Account account) {
	AccountDto accountDto= new AccountDto(
			account.getId(),
			account.getAccountHolderName(),
			account.getBalance()
			);
	return accountDto;
}
}
