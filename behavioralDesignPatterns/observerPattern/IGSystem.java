package behavioralDesignPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class IGSystem implements followerHandler {
    private List<FollowerNotification> notifiers = new ArrayList<>();

    @Override
    public void getNotification(FollowerNotification notification){
        notifiers.add(notification);
    }

    @Override
    public void blockNotication(FollowerNotification notification){
        notifiers.remove(notification);
    }

    @Override
    public void newIgPost(InstagramPost post){
        for (FollowerNotification followerNotification : notifiers) {
            followerNotification.onIgPost(post);
        }
    }
    
    public void addIgPost(InstagramPost post) {
        newIgPost(post);
    }
}
