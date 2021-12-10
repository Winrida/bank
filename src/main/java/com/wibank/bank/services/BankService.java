//package com.wibank.bank.services;
//
//import com.wibank.bank.models.TransferBalance;
//import com.wibank.bank.repo.BalanceRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.math.BigDecimal;
//
//@Service
//@AllArgsConstructor
//public class BankService {
//
//    private final BalanceRepository repository;
//
//    public BigDecimal getBalance(Long accountId) {
//        BigDecimal balance = repository.getBalanceForId(accountId);
//        if (balance == null) {
//            throw new IllegalArgumentException();
//        }
//        return balance;
//    }
//
//    public BigDecimal addMoney(Long to, BigDecimal amount) {
//        return repository.save(to, amount);
//    }
//
//    public void makeTransfer(TransferBalance transferBalance) {
//        repository.getBalanceForId(transferBalance.getFrom())
//
//    }
//}
//