package Task3.Command;

import Task3.Command.Commands.CommandEmail;
import Task3.Command.Commands.CommandSms;
import Task3.Command.Commands.CommandSmsAndEmail;
import Task3.Command.Messages.EmailMessage;
import Task3.Command.Messages.SmsMessage;

public class Program {
    public static void main(String[] args) {

        Client client1 = new Client("John only sms");
        new CommandSms().send(client1);

        Client client2 = new Client("John only email");
        new CommandEmail().send(client2);

        Client client3 = new Client("John sms and email");
        new CommandSmsAndEmail().send(client3);

        showInfo(client1);
        showInfo(client2);
        showInfo(client3);
    }

    public static void showInfo(Client client){
        System.out.println("КЛИЕНТ: " + client.getName());
        System.out.println(" SMS ПОЧТА: ");
        for (SmsMessage message : client.getSmsMail()){
            System.out.println("  - " + message.getText());
        }
        System.out.println(" EMAIL ПОЧТА: ");
        for (EmailMessage message : client.getEmailMail()){
            System.out.println("  - " + message.getText());
        }
        System.out.println();
    }
}
