package com;

/**
 * Created by Connor on 4/17/16.
 */
public class MailBox implements Observer {
    String Address;

    @Override
    public void update(){
        System.out.println("New Mail");
    }
}
