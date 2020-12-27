package Task4.Decorator.WorkServices;

import Task4.Decorator.WatchingServices.MonitoringService;
import Task4.Decorator.Request;
import Task4.Decorator.WatchingServices.AuditService;
import Task4.Decorator.WatchingServices.LogService;
import Task4.Decorator.WatchingServices.WatchingService;

import java.util.ArrayList;
import java.util.List;

public class Worker implements WorkService {

    private HistoryService historyService;
    private List<WatchingService> watchingServices;

    public List<WatchingService> getWatchingServices() {
        return watchingServices;
    }

    public Worker(){
        historyService = new HistoryService();

        watchingServices = new ArrayList<>();
        watchingServices.add(new MonitoringService());
        watchingServices.add(new AuditService());
        watchingServices.add(new LogService());
    }

    @Override
    public void createRequest(String text) {
        sendMessages("Операция попытки создания заявки с текстом \""+text+"\" зафиксирована в сервисе");

        historyService.createRequest(text);

        sendMessages("Создание заявки с текстом \""+text+"\" проведено успешно. Операция зафиксирована в сервисе");
    }

    @Override
    public Request updateRequest(Request oldRequest, Request newRequest) {
        String oldText = oldRequest.getText();
        sendMessages("Операция обновления заявки \""+oldText+"\" зафиксирована в сервисе");

        Request request = historyService.updateRequest(oldRequest,newRequest);

        sendMessages("Обновление заявки \""+oldText+"\" проведено успешно." +
                " Новый текст: \""+request.getText()+"\". Операция зафиксирована в сервисе");
        return request;
    }

    @Override
    public Request getRequest() {
        sendMessages("Операция получения текущей заявки из HistoryService зафиксирована в сервисе");

        Request request = historyService.getRequest();

        sendMessages("Получение текущей заявки из HistoryService проведено успешно. " +
                "Её текст: \""+request.getText()+"\". Операция зафиксирована в сервисе");
        return request;
    }

    private void sendMessages(String message){
        for (WatchingService service : watchingServices){
            service.takeMessage(message + " " + service.getNameService());
        }
    }
}
