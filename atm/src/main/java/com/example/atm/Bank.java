package com.example.atm;

public class Bank {

    private String username;
    private String message;
    private Card card;

    public Bank() {

    }

    public String getUsername() {
        return username;
    }

    public Card getCard() {
        return card;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void changePin() {
        System.out.println("Your pin code is:" + card.getPin());
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
