package behavioralDesignPatterns.observerPattern;

public class InstagramPost {
    private String title;
    
    public InstagramPost(String title)    {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
