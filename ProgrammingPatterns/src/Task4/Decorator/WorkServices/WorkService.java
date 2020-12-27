package Task4.Decorator.WorkServices;

import Task4.Decorator.Request;

public interface WorkService {
    void createRequest(String text);
    Request updateRequest(Request oldRequest, Request newRequest);
    Request getRequest();
}
