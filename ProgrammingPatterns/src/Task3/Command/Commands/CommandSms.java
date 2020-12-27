package Task3.Command.Commands;

import Task3.Command.Bank;
import Task3.Command.Client;
import Task3.Command.Messages.SmsMessage;

public class CommandSms extends CommandMessage {
    @Override
    public void send(Client client) {
        client.takeSms(new SmsMessage(Bank.message));
    }
}
