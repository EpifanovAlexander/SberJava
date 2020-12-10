public class Request {

    public RequestType type;
    public int sum;
    public String clientName;

    public Request(String clientName, RequestType type, int sum) {
        this.clientName = clientName;
        this.type = type;
        this.sum = sum;
    }
}
