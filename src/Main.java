/**
 * Created by Connor on 4/17/16.
 */
public class Main {

    public static void Main(String[] args){
        MailBox mailBox1 = new MailBox();
        PostOffice office = new PostOffice("1723 W Devon Ave");

        office.addObserver(mailBox1);
        office.NewMail();
        office.removeObserver(mailBox1);

    }
}
