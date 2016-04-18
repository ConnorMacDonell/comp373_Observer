package com;

import com.MailBox;

/**
 * Created by Connor on 4/17/16.
 */
public class Main {

    public static void main(String[] args){
        MailBox mailBox1 = new MailBox();
        PostOffice devonOffice = new PostOffice("1723 W Devon Ave");

        devonOffice.addObserver(mailBox1);
        devonOffice.NewMail();
        devonOffice.removeObserver(mailBox1);
        devonOffice.NewMail();


        MailBox mailbox2 = new MailBox();
        PostOffice loyolaOffice = new PostOffice("6317 N. Broadway");

        loyolaOffice.addObserver(mailBox1);
        loyolaOffice.addObserver(mailbox2);
        loyolaOffice.NewMail();
        loyolaOffice.removeObserver(mailBox1);
        loyolaOffice.NewMail();
    }
}
