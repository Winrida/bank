package com.wibank.bank.models;

import org.hibernate.annotations.SQLInsert;

import javax.persistence.*;


@Entity
public class Amount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int money;



    @ManyToOne
    @JoinColumn(name = "instance_id")
    private static Amount instance = new Amount(0);

    public Amount() {
    }

    public static Amount getInstance(int money) {
        instance.money += money;
        return instance;
    }

    private Amount(int money) {
        this.money = money;
    }


    

    //public Amount(){
    //}

    // public Amount(int money) {
    //     this.money = money;
    // }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
