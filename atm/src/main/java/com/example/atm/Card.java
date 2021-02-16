package com.example.atm;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Card implements ATM{

    private int id;
    private Account account;
    private Record record;
    private int pin;

    public Card(){
        System.out.println("Card default constructor");
    }

    public Card(int pin){
        this.pin = pin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Card(String name) {

    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }

    public Account getAccount() {
        return account;
    }

    public Record getRecord() {
        return record;
    }

    public void validatePin(){
        if (pin == 2524){
            System.out.println("Correct pin code, please continue!");
        }else {
            System.out.println("Incorrect pin code, please try again!");
        }
    }

    @Override
    public void makeWithdraw() {
        System.out.println("Card withdrawal amount " + record.getAmount() + "of money!");
    }

    @Override
    public void checkBalance() {
        System.out.println("Your balance is: " + account.getBalance());
    }

    @Override
    public String toString() {
        return "Card user: " + account.getUsername() + "and balance: " + account.getBalance();
    }
}
