package Task3.Command.Commands;

import Task3.Command.Client;

public abstract class CommandMessage {
    public abstract void send(Client client);
}
