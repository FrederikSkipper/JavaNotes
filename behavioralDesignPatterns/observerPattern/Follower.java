package behavioralDesignPatterns.observerPattern;
// Concrete observer
public class Follower implements FollowerNotification {
    private int userId;

    public Follower (int userId) {
        this.userId = userId;
    }

    public void onIgPost(InstagramPost post) {
        System.out.println("new post related to you");
        post.getTitle();
    }

}
