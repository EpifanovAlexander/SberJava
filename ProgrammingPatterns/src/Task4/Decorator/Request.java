package Task4.Decorator;

public class Request {

    private String text;

    public Request(String _text){
        text = _text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
