package work5;

import java.util.ArrayList;
import java.util.List;
/**
 * Class what implements the interface {@link Subscriber}, is a news channel and contains functions {@code addNews}, {@code addSub},
 * {@code removeSub}, {@code notifySub}
 *
 * @author Bykovets Sergey
 */
public class News implements Subject{
    /**
     * A list of subscribers
     */
    private List<Observer> observers = new ArrayList<>();
    /**
     * The News Itself
     */
    private String news;
    /**
     * Function {@code addNews} which adds the news to the channel and writes about it
     *
     * @param news which will be added
     */
    public void addNews(String news) {
        this.news = news;
        System.out.println("Додано новину: " + news);
        notifySub(news);
    }
    /**
     * Function {@code addSub} which adds subscriber to channel and writes about it
     *
     * @param observer subscriber to be added
     */
    @Override
    public void addSub(Observer observer) {
        observers.add(observer);
        System.out.println("Новий підписник: " + observer);
    }
    /**
     * Function {@code removeSub} which removes the subscriber from the channel and writes about it
     *
     * @param observer subscriber that will be deleted
     */
    @Override
    public void removeSub(Observer observer) {
        observers.remove(observer);
        System.out.println("Підписника видалено: " + observer);
    }
    /**
     * Function {@code notifySub} which notifies subscribers about the news
     *
     * @param news what will be the notification of subscribers
     */
    @Override
    public void notifySub(String news) {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

}
