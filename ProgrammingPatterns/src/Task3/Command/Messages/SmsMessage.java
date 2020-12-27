package Task3.Command.Messages;

public class SmsMessage extends Message {
    public SmsMessage(String _message){
        message = _message + " (SMS)";
    }
}
