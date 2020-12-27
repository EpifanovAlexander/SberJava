package Task3.Command.Messages;

public class EmailMessage extends Message {
    public EmailMessage(String _message){
        message = _message + " (EMAIL)";
    }
}
