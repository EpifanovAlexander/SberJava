package Task2.ChainOfResponsibility.Checkers;

import Task2.ChainOfResponsibility.Entities.Request;

public abstract class Checker {

    private Checker nextChecker;

    public abstract boolean checkRequest(Request request);

    public Checker boundWithChecker(Checker _nextChecker) {
        nextChecker= _nextChecker;
        return _nextChecker;
    }

    protected boolean checkNext(Request request) {
        if (nextChecker == null) {
            return true;
        }
        return nextChecker.checkRequest(request);
    }
}
