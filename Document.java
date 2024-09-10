package local;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private String content;
    private List<Observer> observers = new ArrayList<>();

    public void setContent(String content) {
        this.content = content;
        notifyObservers();
    }

    public String getContent() {
        return content;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(content);
        }
    }
}

