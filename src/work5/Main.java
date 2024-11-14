package work5;
/**
 * Main class which сreates news channel, subscribers, adds and removes them
 * and publishes news to notify subscribers.
 */
public class Main {
    /**
     * The main method which сreates news channel, subscribers, adds and removes them
     * and publishes news to notify subscribers.
     */
    public static void main(String[] args) {
        News news = new News();

        Observer reader1 = new Subscriber("A");
        Observer mediaAgency = new MediaAgency("Агенція новин");

        news.addSub(reader1);
        news.addSub(mediaAgency);

        news.removeSub(mediaAgency);

        news.addNews("Вулиця Сковороди частково перекрита");
    }
}