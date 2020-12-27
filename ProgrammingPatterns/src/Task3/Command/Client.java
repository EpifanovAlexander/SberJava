package Task3.Command;

import Task3.Command.Messages.SmsMessage;
import Task3.Command.Messages.EmailMessage;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    private List<SmsMessage> smsMail;     // почта смс сообщений
    private List<EmailMessage> emailMail; // почта email сообщений

    public Client(String _name){
        name = _name;
        smsMail = new ArrayList<>();
        emailMail = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<SmsMessage> getSmsMail() {
        return smsMail;
    }

    public void takeSms(SmsMessage sms) {
        smsMail.add(sms);
    }

    public List<EmailMessage> getEmailMail() {
        return emailMail;
    }

    public void takeEmail(EmailMessage email) {
        emailMail.add(email);
    }
}
