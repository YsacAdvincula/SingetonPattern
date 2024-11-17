public class HelpDesk {
    private static HelpDesk instance;
    private int queueNumber = 0;

    private HelpDesk() {
    }

    public static synchronized HelpDesk getInstance() {
        if (instance == null)
            instance = new HelpDesk();
        return instance;
    }

    public synchronized void currentQueueNumber() {
        System.out.println("Current Queue Number: " + queueNumber);
    }

    public synchronized void serveNextCustomer(String desk) {
        queueNumber++;
        System.out.println("Serving Customer: " + queueNumber + " on " + desk);
    }

    public synchronized void resetQueueNumber(int num) {
        queueNumber = num;
        System.out.println("Reset Queue Number to " + queueNumber);
    }
}