package work5;
/**
 * Class what implements the interface {@link Observer}, is a media agency and contains functions {@code update}, {@code toString}
 *
 * @author Bykovets Sergey
 */
public class MediaAgency implements Observer {
    /**
     * Name for agency
     */
    private String name;
    /**
     * Constructs a new agency with the name.
     *
     * @param name the name of the agency
     */
    public MediaAgency(String name){
        this.name = name;
    }
    /**
     * Function {@code update} which notifies the agency of the news and writes about it
     *
     * @param news which will be in the message
     */
    @Override
    public void update(String news) {
        System.out.println("Агенція " + name + " отримала повідомлення: " + news);
    }
    /**
     * Function {@code toString} which returns the name of the agency
     */
    public String toString() {
        return name;
    }
}
