package work5;
/**
 * Interface {@code Observer} for classes {@link Subscriber}, {@link MediaAgency} that represent subscribers to a news channel, contains a function {@code update} for notifying subscribers
 *
 * @author Bykovets Sergey
 */
public interface Observer {
    /**
     * Function {@code update} for notifying subscribers
     *
     * @param news what will be the notification of subscribers
     */
    void update(String news);
}
