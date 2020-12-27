package Task3.Command.Commands;

import Task3.Command.Bank;
import Task3.Command.Client;
import Task3.Command.Messages.SmsMessage;
import Task3.Command.Messages.EmailMessage;

public class CommandEmail extends CommandMessage {
    @Override
    public void send(Client client) {
        client.takeSms(new SmsMessage("Вам пришло письмо на Email"));
        client.takeEmail(new EmailMessage(Bank.message));
    }
}
