package behavioralDesignPatterns.observerPattern;

// 
interface followerHandler {
    void getNotification(FollowerNotification notification);
    void blockNotication(FollowerNotification notification);
    void newIgPost(InstagramPost post);
}
