package local;

public class DocumentView implements Observer {
    private String viewName;

    public DocumentView(String viewName) {
        this.viewName = viewName;
    }

    @Override
    public void update(String content) {
        System.out.println(viewName + " received update: " + content);
    }
}

