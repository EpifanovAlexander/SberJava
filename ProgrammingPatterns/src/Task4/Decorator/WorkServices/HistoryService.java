package Task4.Decorator.WorkServices;

import Task4.Decorator.Request;

public class HistoryService implements WorkService {

    private Request request;

    @Override
    public void createRequest(String text) {
        request = new Request(text);
    }

    @Override
    public Request updateRequest(Request oldRequest, Request newRequest) {
        oldRequest.setText(newRequest.getText());
        return oldRequest;
    }

    @Override
    public Request getRequest() {
        return request;
    }
}
