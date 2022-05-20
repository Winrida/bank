package com.wibank.bank.controllers;

import com.wibank.bank.models.Amount;
import com.wibank.bank.models.Reviews;
import com.wibank.bank.repo.AmountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class addmoneyController {

    @Autowired
    private AmountRepository amountRepository;

    @GetMapping("/addmoney")
    public String AddmoneyMain(Model model) {
        return "addmoney";
    }

    @PostMapping("/addmoney")
    public String AddmoneyAmount(@RequestParam int money, Model model) {
        Amount amount = Amount.getInstance(money);
        amount.setMoney(amount.getMoney());
        amountRepository.save(amount);

        return "redirect:/mybank";
    }

}
