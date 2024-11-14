package work5;
/**
 * Class what implements the interface {@link Observer}, is a subscriber and contains functions {@code update}, {@code toString}
 *
 * @author Bykovets Sergey
 */
public class Subscriber implements Observer {
    /**
     * Name for subscriber
     */
    private String name;
    /**
     * Constructs a new subscriber with the name.
     *
     * @param name the name of the subscriber
     */
    public Subscriber(String name){
        this.name = name;
    }
    /**
     * Function {@code update} which notifies the subscriber of the news and writes about it
     *
     * @param news which will be in the message
     */
    @Override
    public void update(String news) {
        System.out.println("Підписник " + name + " отримав повідомлення: " + news);
    }
    /**
     * Function {@code toString} which returns the name of the subscriber
     */
    public String toString() {
        return name;
    }
}
