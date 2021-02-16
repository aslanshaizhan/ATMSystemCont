package com.example.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//          Card card = context.getBean("Card", Card.class);
//        card.makeWithdrawal();
//        System.out.println("card = " + card);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
