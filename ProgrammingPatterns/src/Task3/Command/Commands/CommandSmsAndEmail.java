package Task3.Command.Commands;

import Task3.Command.Client;

public class CommandSmsAndEmail extends CommandMessage {
    @Override
    public void send(Client client) {
        new CommandSms().send(client);
        new CommandEmail().send(client);
    }
}
