package work5;
/**
 * Interface {@code Observer} for class {@link News} that represent news channel, contains a function {@code addSub}, {@code removeSub}, {@code notifySub}
 *
 * @author Bykovets Sergey
 */
public interface Subject {
    /**
     * Function {@code addSub} which adds subscriber to channel
     *
     * @param observer subscriber to be added
     */
    void addSub(Observer observer);
    /**
     * Function {@code removeSub} which removes the subscriber from the channel
     *
     * @param observer subscriber that will be deleted
     */
    void removeSub(Observer observer);
    /**
     * Function {@code notifySub} which notifies subscribers about the news
     *
     * @param news what will be the notification of subscribers
     */
    void notifySub(String news);
}
