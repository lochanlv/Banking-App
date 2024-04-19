package net.javaguides.Banking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
private Long id;
private String accountHolderName;
private double balance;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public AccountDto(Long id, String accountHolderName, double balance) {
	super();
	this.id = id;
	this.accountHolderName = accountHolderName;
	this.balance = balance;
}
public AccountDto() {
	super();
	// TODO Auto-generated constructor stub
}


}
